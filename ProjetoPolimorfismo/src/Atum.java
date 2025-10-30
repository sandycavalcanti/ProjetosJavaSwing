/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para implementar todos os métodos abstratos da interface Pizza
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 30/10/2025
 */
public class Atum implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Atum");
        System.out.println("Molho de tomate, atum, catupiry, cebola, rodelas de tomate e orégano");
    }

    @Override
    public void assar() {
       System.out.println("Tempo de forno: 16 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$42,00");
    }
    
} // fim da classe
