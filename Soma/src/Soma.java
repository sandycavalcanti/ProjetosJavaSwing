
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para...
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 16/10/2025
 */
public class Soma {
    public static void main(String[] args) {
        int a, b, soma, media;
        a = 0;
        b = 0;
        
        try{
            while(true){
                a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de a: "));
                
            }
            b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de b: "));
            soma = soma(a,b);
            media = media(a,b);
            System.out.println("Soma = "+soma+"\n Media = "+media);
        }catch(NumberFormatException e){
            System.err.println("Digite apenas numeros!!");            
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção do tipo: "+e.toString());
        }
        
    }

    private static int soma(int a, int b) throws SomaException{
        if( (a+b) > 100 ){
            throw new SomaException();
        }
        return a+b;
    }

    private static int media(int a, int b) throws SomaException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} // fim da classe
