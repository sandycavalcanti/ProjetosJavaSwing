 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para exibir diversos frames continuos na janela
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 13/11/2025
 */
public class Virus {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) { 
            Janela j1 = new Janela();
            Janela j2 = new Janela();
            Janela j3 = new Janela();
            Janela j4= new Janela();
        
            j1.start();
            j2.start();
            j3.start();  
            j4.start();       
            x++;
        }
        
    }

} // fim da classe
