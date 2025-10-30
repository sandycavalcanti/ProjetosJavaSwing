/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para gerar o objeto polimorfico forno, que irá preparar todo e qualquer tipo de pizza
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 30/10/2025
 */
public class Forno {
    
    public void preparar(Pizza p){
        p.montar();
        p.assar();
        p.cobrar();
    }
} // fim da classe
