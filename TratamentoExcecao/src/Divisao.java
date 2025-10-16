
import javax.swing.JOptionPane;

/**
 *  Classe criada para demonstrar o recurso de linguagem chamado tratamento de exceção
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 16/10/2025
 */
public class Divisao {
    public static void main(String[] args) {
        int a, b, div;
        String numA, numB;
        numA = JOptionPane.showInputDialog("Digite o valor de A: ");
        numB = JOptionPane.showInputDialog("Digite o valor de B: ");
        
        div =0;
        try{
            a= Integer.parseInt(numA);
            b= Integer.parseInt(numB);
            div = dividir(a,b);  
            System.out.println("Divisão: "+div);
        }
        catch(NumberFormatException e){
            System.err.println("Digite apenas numeros!!");            
        }catch(ArithmeticException e){
            System.err.println("Não existe divisão por zero!!");
        }
        catch(DivisaoExcecao e){
            System.err.println("Ocorreu uma exceção do tipo: "+e.toString());   
        }catch(Exception e){
            System.out.println("Ocorreu uma exceção do tipo: "+e.toString());
        }
        // Será executado independente do resultado
        finally{
            System.err.println("Obrigada!!");
        } 
    }

    private static int dividir(int a, int b) throws DivisaoExcecao {
        if(a < b){
            throw new DivisaoExcecao();
        }
        if(b > 500){
            throw new DivisaoExcecao(b);
        }
        if(a<0){
            throw new DivisaoExcecao("Erro");
        }
        return a / b;
    }
} // fim da classe
