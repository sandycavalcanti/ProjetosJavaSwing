/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para criar instancias de conta corrente e testar o encapsulamento
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 02/10/2025
 */
public class Movimentação {

    public static void main(String []args){
        // Variavel que referencia o objeto na memória
        ContaCorrente cc = new ContaCorrente("Sandyyy", 50000, 98765);
        cc.exibirDadosContaCliente();
        cc.menu();
    }
    
} // fim da classe
