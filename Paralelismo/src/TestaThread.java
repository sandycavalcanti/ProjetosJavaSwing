/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para instanciar os objetos do tipo Threads e propor o paralelismo 
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 06/11/2025
 */
public class TestaThread {
    public static void main(String[] args) {
        while(true){
            Threads t1 = new Threads("Diva");
            Threads t2 = new Threads("Fatec Santana de Parnaíba");
            Threads t3 = new Threads("Hj esta nublado");
            Threads t4 = new Threads("Olá");
            Threads t5 = new Threads("Ai ai aiii");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
        }
    }   // fim do main

} // fim da classe
