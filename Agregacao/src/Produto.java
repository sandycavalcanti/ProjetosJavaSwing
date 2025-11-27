/**
 *  Classe criada para gerar objetos do tipo produto
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 27/11/2025
 */
public class Produto {
    int codigo;
    String nome;
    float valor;
    
    public Produto(int codigo, String nome, float valor){
        this.codigo = codigo;
        this.nome = nome;
        this.valor= valor;
    }
    
    public void exibirProduto(){
        System.out.println("Codigo: "+codigo+"\nProduto: "+nome+"\nValor: R$"+valor);
    }
    
} // fim da classe
