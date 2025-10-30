
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para apresentar o menu de opções ao cliente com os diversos sabores de pizzas e pão
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 30/10/2025
 */
public class Menu {
    
    Pizza p;
    Forno f = new Forno();
    String msg;
    
    public Menu(){
        msg = "1 - Frango com catupity";
        msg += "\n 2 - Calabresa";
        msg += "\n 3 - Cinco queijos";
        msg += "\n 4 - Romeu e julieta";
        msg += "\n 5 - Brigadeiro";
        msg += "\n 6 - Atum";
        msg += "\n 7 - Escarola";
        msg += "\n 8 - Portuguêsa";
        msg += "\n 9 - Pão";
        msg += "\n 10 - Sair do programa";
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog(msg)); 
        
        switch(opc){
            case 1: 
                p = new FrangoCatupiry();
                break;
            case 2: 
                p = new Calabresa();
                break;
            case 3: 
                p = new CincoQueijos();
                break;
            case 4: 
                p = new RomeuJulieta();
                break;
            case 5: 
                p = new Brigadeiro();
                break;
            case 6: 
                p = new Atum();
                break;
            case 7: 
                p = new Escarola();
                break;
            case 8: 
                p = new Portuguesa();
                break;
            case 9: 
                p = new PaoCaseiro();
                break;
            case 10: 
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!!");
                return;
                
        } // Fim do switch
//        Objeto polimórfico
        f.preparar(p);
    } // Fim do construtor
        
} // fim da classe
