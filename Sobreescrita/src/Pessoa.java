/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para demonstrar o recurso de sobreescrita de metodos
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 25/09/2025
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;

    // Mesmo nome da classe
    // Construtor do objeto pessoa em memória
    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    // método para exibir os dados de pessoa
    public void exibirDados(){
        System.out.println("Nome da pessoa: "+ nome);
        System.out.println("Idade da pessoa: "+idade);
        System.out.println("Altura da pessoa: "+altura);
    }
    
    
    
    
} // fim da classe
