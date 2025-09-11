
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para herdar TODOS os atributos e metodos da superclasse Veiculo
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 11/09/2025
 */

public class Carro extends Veiculo{
//    Atributos
    int volPortaMalas;
    boolean conversivel;
//    construtor para um objeto do tipo Carro em memória
    public Carro(String marca, String modelo, String cor, int ano, float valor, int volPortaMalas, boolean conversivel){
//        A chamada com o super tem que ser o primeiro comportamento no construtor
//        isso só vale para o construtor
        super(marca, modelo, cor, ano, valor);
        this.volPortaMalas = volPortaMalas;
        this.conversivel = conversivel;
        
    }
    
//    Construtor para a entada de dados com GUI
   public Carro(){
        this.volPortaMalas = Integer.parseInt(JOptionPane.showInputDialog("Volume do porta-malas: "));
        this.conversivel = JOptionPane.showInputDialog("Conversivel: ").equalsIgnoreCase("Sim");
//        String resp = JOptionPane.showInputDialog("Conversivel: ");
//        if("Sim".equals(resp) || resp.equals("sim") || "s".equals(resp)){
//            this.conversivel = true;
//        }else{
//            this.conversivel = false;
//        }
   }
    
//    Para exibir os dados de Carro
    public void exibirDadosCarro(){
        // para acessar coisas da classe superior sempre usa super
        super.exibirDadosVeiculo();
        System.out.println("Volume do porta-malas: "+volPortaMalas);
        System.out.println("É conversível: " + (conversivel?"Sim":"Não"));
    }
    
//    Metodo para exibir os dados de carro por meio de GUI
    public void exibirDadosCarroGUI(){
        String msg = "Marca: "+ marca;
        msg = msg + "\nModelo: "+modelo+"\nCor: "+cor+"\nAno de lançamento: "+ano+"\nValor: R$"+valor+
                "\nVolume do porta-malas"+volPortaMalas+"\nConversivel: "+(conversivel?"Sim":"Não");
        JOptionPane.showMessageDialog(null, msg, "Dados do Carro", -1);
    }
    
    
} // fim da classe
