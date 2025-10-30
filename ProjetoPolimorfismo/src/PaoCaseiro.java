/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para instanciar um objeto do tipo PaoCaseiro para ser preparado pelo objeto polimorfico Forno
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 30/10/2025
 */

// Instanciado como Pizza para respeitar o padrão do forno
public class PaoCaseiro implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pão caseiro");
        System.out.println("Farinha, ovo, leite, óleo, fermento, sal, açucar.");
    }

    @Override
    public void assar() {
       System.out.println("Tempo de forno: 30 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$15,00");
    }
    
} // fim da classe
