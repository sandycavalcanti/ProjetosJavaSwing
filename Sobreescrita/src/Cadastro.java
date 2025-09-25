/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para instanciar objetos do tipo pssoa e professor
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 25/09/2025
 */
public class Cadastro {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Manuela", 32, 1.62f);
        Professor prof = new Professor("Tetsuo", 54, 1.74f, 98765 ,"Matemática Discreta", 7500f);
        p.exibirDados();
        prof.exibirDados();
        prof.exibirDados(true);
        prof.exibirDados(3);
        
        
        Aluno a = new Aluno("João", 19, 1.65f, 123456, 8, 10, true);
        a.exibirDados();
        a.exibirDados(4);
        a.exibirDados(3, true);
        
    }
    
} // fim da classe
