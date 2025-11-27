
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;               
// Sessão de importação


/**
 *  Classe criada para...
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 13/11/2025
 */
public class Janela extends Thread{
    JFrame frame = new JFrame();
    JPanel painel = new JPanel();
    JTextField texto = new JTextField();
    int sleepTime;
    
    public Janela(){
        int x = (int) (Math.random() * 1500);
        int y = (int) (Math.random() * 680);
        texto.setText("Texto");
//        painel.add(texto);
        
        
        painel = new JPanel() {
//            Image bg = new ImageIcon( getClass().getResource("/legosh1.png")).getImage());
                
            Image bg = new ImageIcon(getClass().getResource("/legosh1.png")).getImage();
            @Override
              protected void paintComponent(Graphics g){
                  super.paintComponent(g);
                  g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }
        };

        float h = (float) Math.random() * 100; // de 0.0 a 1.0
        float s = (float) Math.random()* 510; // de 0.0 a 1.0
        float b = (float) Math.random()* 400; // de 0.0 a 1.0

        int rgb = Color.HSBtoRGB(h, s, b);
        painel.setBackground(new Color(rgb));
        

        sleepTime = (int) (Math.random() * 2000);
        frame.setSize(400,400);     //Define o tamanho XY do frame
        frame.add(painel);
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(sleepTime);
//            frame.setVisible(false);
            frame.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
} // fim da classe
