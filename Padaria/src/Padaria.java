
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para...
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 16/10/2025
 */
public class Padaria {
    public static void main(String[] args) {
        int qntPao, hora;
        boolean queimado, v;
        try{
            qntPao = Integer.parseInt(JOptionPane.showInputDialog("Insita a quantidade de pão"));
            hora = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora da compra"));
            queimado = JOptionPane.showInputDialog("O pão está queimado? (sim/não)").equalsIgnoreCase("sim");
            v = verificar(queimado, qntPao, hora);
            
        }catch(NumberFormatException e){
            System.out.println("Digite apenas numeros para a quantidade de pães e a hora da compra!!"); 
        }catch(VerificarPadaria e){
            System.err.println("Ocorreu uma exceção do tipo: "+e.toString());
        }
        catch(Exception e){
            System.out.println("Ocorreu uma exceção do tipo: "+e.toString());
        }
    }

    private static boolean verificar(boolean queimado, int qntPao, int hora) throws VerificarPadaria{
        if(queimado){
            throw new VerificarPadaria(2);
        }
        if(qntPao > 50){
            throw new VerificarPadaria("dnvj");
        }if(hora > 23 || hora < 0){
            throw new VerificarPadaria("as", 9);
        }
        if(hora > 18){
            throw new VerificarPadaria();
        }
        return true;
    }


} // fim da classe
