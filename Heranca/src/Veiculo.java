
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para demonstrar o principio de Herança entre classes
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 11/09/2025
 */
public class Veiculo {
    // Atributos
    String marca;
    String modelo;
    String cor;
    int ano;
    float valor;
    
    // o metodo construtor cria/constroi um objeto na memória
//    Metodo construtor responsavel por criar m objeto na memoria
    public Veiculo(String marca, String modelo, String cor, int ano, float valor) {
        // this.marca é o atributo marca
        //marca é a variavel de parametro
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.valor = valor;
    }
    
    //    Construtor para a entada de dados com GUI
    public Veiculo(){
        this.marca = JOptionPane.showInputDialog("Marca: ");
        this.modelo = JOptionPane.showInputDialog("Modelo: ");
        this.cor = JOptionPane.showInputDialog("Cor: ");
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação: "));
        this.valor = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));
    }
    
    // Metodo  comum para exibir os dados de Veiculo
    public void exibirDadosVeiculo(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Cor: "+ cor);
        System.out.println("Ano de fabricação: "+ ano);
        System.out.println("Valor: R$"+ valor);
    }
    
    //    Metodo para exibir os dados de veiculo por meio de GUI
    public void exibirDadosVeiculoGUI(){

    }
    
    
} // fim da classe
