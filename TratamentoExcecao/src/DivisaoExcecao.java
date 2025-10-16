/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para tratar as exceções oara a classe Divisao
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 16/10/2025
 */
public class DivisaoExcecao extends Exception{
    public DivisaoExcecao(){
        super("O 'a' não pode ser menor que o 'b'!");
    }
    public DivisaoExcecao(int b) {
        super("O valor digitado para o 'b' não pode ser superior a 500!");
    }
    public DivisaoExcecao(String b) {
        super("O valor de 'a' não pode ser negativo!!");
    }
} // fim da classe
