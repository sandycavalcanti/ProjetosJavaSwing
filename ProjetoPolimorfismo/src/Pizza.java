/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Interface para servir de padrão para todo e qualquer tipo de pizza
 * Possui as funcionalidades montar, assar e cobrar
 * @author Sandy Pereira Cavalcanti
 * @since 30/10/2025
 */
public interface Pizza {
//    Metodo para montar a pizza com os ingredientes
    public void montar();
    
//    Metodo para o tempo que a pizza ficará no forno
    public void assar();
    
//    Metodo para cobrar o valor de acordo com o sabor
    public void cobrar();
    
}
