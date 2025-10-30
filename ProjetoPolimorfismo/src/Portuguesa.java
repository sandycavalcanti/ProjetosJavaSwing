/**
 *  Classe criada para implementar todos os métodos abstratos da interface Pizza
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 30/10/2025
 */

public class Portuguesa implements Pizza{

    @Override
    public void montar() {
        System.out.println("Pizza portuguesa");
        System.out.println("Molho de tomate,Queijo muçarela, Presunto, Ovo cozido e fatiado, Cebola fatiada, Azeitona preta e Orégano");
    }

    @Override
    public void assar() {
       System.out.println("Tempo de forno: 14 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("Valor: R$45,00");
    }
    
} // fim da classe
