/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para herdar os atributos de pessoa
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 25/09/2025
 */
public class Aluno extends Pessoa{
    int ra;
    float media;
    int faltas;
    boolean dependencia;

    public Aluno(String nome, int idade, float altura, int ra, float media, int faltas, boolean dependencia) {
        super(nome, idade, altura);
        this.ra = ra;
        this.media = media;
        this.faltas = faltas;
        this.dependencia = dependencia;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("O aluno "+nome+" tem média "+media+" e "+faltas+" faltas.");
    }
    
    public void exibirDados(int x){
        if(dependencia){
            System.out.println("o aluno "+nome+" TEM dependencias!");
        }
        else{
            System.out.println("O aluno "+nome+" NÃO tem dependencia!");
        }
    }
    
    public void exibirDados(int x, boolean a){
        System.out.println("O aluno "+nome+" tem "+idade+" anos.");
    }
    
    
} // fim da classe
