
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para gerar threads que executam uma determinada tarefa
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 06/11/2025
 */
public class Threads extends Thread{
    int sleepTime;
    public Threads( String nome ){
        super(nome);
        sleepTime = (int)(Math.random() * 5000);
        System.out.println("A thred "+getName()+" vai dormir por "+sleepTime+" ms.");
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            System.out.println("A thread "+getName()+" foi interrompida!");
        }
        System.err.println("A thread "+getName()+" ACORDOU!");
    }
} // fim da classe
