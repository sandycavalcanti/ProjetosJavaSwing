/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para gerar um objeto do tipo pizza
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 30/10/2025
 */
public class FrangoCatupiry implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza de Frango com catupiry");
        System.out.println("Molho de tomate, frango, catupity e azeitonas verdes");
    }

    @Override
    public void assar() {
        System.out.println("Tempo de forno: 12 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$55,00");
    }
    
} // fim da classe
