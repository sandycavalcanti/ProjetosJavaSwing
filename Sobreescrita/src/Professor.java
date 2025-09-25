/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para herdar todos os atributos e metodos da superclasse Pessoa
 * e promovendo a sobrestrita de allguns metodos
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 25/09/2025
 */
public class Professor extends Pessoa{
    int codigo;
    String disciplina;
    float salario;

    // Construtor do objeto professor em memória
    public Professor( String nome, int idade, float altura, int codigo, String disciplina, float salario) {
        super(nome, idade, altura);
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    @Override // sobreescrito 
    public void exibirDados(){
        System.out.println("O professor "+nome+" ministra a disciplina "+disciplina+" e tem o salario de R$"+salario);
        
    }
    
    // Sobrecarga
    public void exibirDados(boolean resp){
        super.exibirDados();
        System.out.println("Salario: R$"+salario);
        System.out.println("Disciplina: "+disciplina);
    }
    
    //Sobrecarga
    public void exibirDados(int x){
        System.out.println("Professor "+nome+" ganha R$"+salario);
    }
    

} // fim da classe
