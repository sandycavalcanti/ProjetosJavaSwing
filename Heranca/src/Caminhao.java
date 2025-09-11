
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para...
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 11/09/2025
 */
public class Caminhao extends Veiculo{
    String carroceria;
    float tara;
    int eixos;

    public Caminhao(String marca, String modelo, String cor, int ano, float valor, String carroceria, float tara, int eixos) {
        super(marca, modelo, cor, ano, valor);
        this.carroceria = carroceria;
        this.tara = tara;
        this.eixos = eixos;
    }
    
    public Caminhao(){
        this.carroceria = JOptionPane.showInputDialog("Carroceria: ");
        this.tara = Float.parseFloat(JOptionPane.showInputDialog("Tara: "));
        this.eixos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de eixos: "));
    }
    
    public void exibirDadosCaminhao(){
        super.exibirDadosVeiculo();
        System.out.println("Carroceria: "+ carroceria);
        System.out.println("Tara: "+tara);
        System.out.println("Quantidade de eixos: "+eixos);
    }
    
    public void exibirDadosCaminhaoGUI(){
        String msg = "Marca: "+ marca;
        msg = msg + "\nModelo: "+modelo+"\nCor: "+cor+"\nAno de lançamento: "+ano+"\nValor: R$"+valor+
                "\nCarroceria: "+carroceria+"\nTara: "+tara+"\nQuantidade de eixos: "+eixos;
        JOptionPane.showMessageDialog(null, msg, "Dados do Caminhao", -1);
    }
    
    

} // fim da classe
