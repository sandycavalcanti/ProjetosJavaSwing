
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para exibir um menu de opções para o usuário
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 18/09/2025
 */
public class Menu {
    
    int opc;
    String msg;
    Figura figura;
    
    public Menu(){
        int a,b,c,d;
        boolean flag;
        
        while(true){
            flag = false;
            msg = "1 - Ponto\n2 - Linha\n3 - Triângulo\n4 - Retângulo\n5 - Finalizar o programa";
            opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
            
            switch(opc){
                case 1:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do ponto"));
                    figura = new Figura(a);
                    break;
                case 2:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial da linha"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final da linha"));
                    figura = new Figura(a,b);
                    break;
                case 3:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da primeira coordenada"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da segunda coordenada"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da terceira coordenada"));
                    figura = new Figura(a,b,c);
                    break;
                case 4:
                    a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da primeira coordenada"));
                    b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da segunda coordenada"));
                    c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da terceira coordenada"));
                    d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da quarta coordenada"));
                    figura = new Figura(a,b,c,d);
                    break;
                case 5:
                    System.out.println("Fechando  programa...");
                    System.out.println("*_*");
                    System.exit(0);
                    break;
                default:
                    flag = true;
                    System.out.println("Opção invalida...\n");
                    break;
            }   //Fim do switch
            if(flag != true){
                figura.exibirFigura();
            }
        }   //Fim do loop
        
    }; 
    
} // fim da classe
