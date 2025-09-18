
import javax.swing.JOptionPane;

/**
 *  Classe criada para demonstrar o recurso de sobrecarga de metodos
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 18/09/2025
 */
public class Figura {
    Integer a,b,c,d;
    
    //contrutor para 1 ponto
    Figura(int a) {
        this.a = a;
    }
    //contrutor para 1 linha
    Figura(int a, int b) {
        this.a = a;
        this.b = b;
    }
    //Construtor para 1 triangulo
    Figura(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }    
    //Construtor para 1 retangulo
    Figura(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        
    }

    
    /** metodo genérico para exibir qualqer tipo de figura
     * Esse metodo identificará automaticamente qual é lo 
     * tipo da figuta que foi instanceada
     */
    public void exibirFigura(){
        if( a != null && b == null && c == null && d == null){
            exibirFigura(1);
        }
        else if( a != null && b != null && c == null && d == null){
            exibirFigura("www");  
        }
        else if( a != null && b != null && c != null && d == null){
            exibirFigura('a');
        }
        else{
            exibirFigura(true);
        }
    }
    

    //metodo comum para exibir dados de um ponto
    public void exibirFigura(int x){
        JOptionPane.showMessageDialog(null,"É um ponto de valor: "+this.a);
    }
    //metodo comum para exibir dados de uma linha
    public void exibirFigura(String k){
        JOptionPane.showMessageDialog(null,"É uma linha de cordenadas: "+this.a+" e "+this.b);
    }
    //metodo comum para exibir dados de um triangulo
    public void exibirFigura(char k){
        JOptionPane.showMessageDialog(null,"É um triangulo de cordenadas: "+this.a+", "+this.b+" e "+this.c);
    }
    /**metodo comum para exibir dados de um retangulo
    * Devera ser passado uma variavel booleana  para retornar o valor de um ponto
    */
    public void exibirFigura(boolean k){
        JOptionPane.showMessageDialog(null,"É um retangulo de cordenadas: "+this.a+", "+this.b+", "+this.c+" e "+this.d);
    }
    
} // fim da classe
