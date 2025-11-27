
import java.util.ArrayList;

/**
 *  Classe criada para gerar um objeto do tipo venda
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 27/11/2025
 */
public class Venda {
    int codigo;
    String cliente;
    ArrayList <Produto> itens = new ArrayList();
    
    public Venda(int codigo, String cliente){
        this.codigo = codigo;
        this.cliente = cliente;
    }
    
//    Metodo q relaciona o produto comprado a venda
    public void adicionarProduto(Produto p){
        itens.add(p);
    }
    
//    Exibir todo o conteudo dos produtos comprados
    public void listarProdutos(){
        for( Produto p: itens){
            System.out.println("Produto: " + p.nome);
            System.out.println("Valor: R$" + p.valor);
        }
    }
    
    public void indiceProdutos(){
        System.out.println("Indice exadecimal em memoria:"+itens);
    }
    
    public void totalizarCompra(){
        float soma = 0;
        for(Produto p: itens){
            soma += p.valor;
        }
        System.out.println("Valor total da compra: R$" + soma);
    }
    
//    Método para remover um produto da lista de itens
    public void removerItemProduto(Produto p){
        System.out.println("Item removido: "+p.nome);
        itens.remove(p);
    }

} // fim da classe
