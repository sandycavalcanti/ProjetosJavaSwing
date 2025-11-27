/**
 *  Classe criada para instanciar objetos do tipo produto e venda
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 27/11/2025
 */
public class Mercado {
    
    public static void main(String[] args) {
        
//      Produtos disponiveis para compra
        Produto p1, p2, p3, p4, p5;
        p1 = new Produto(10, "Vasoura", 23.50f);
        p2 = new Produto(15, "Arroz", 7.83f);
        p3 = new Produto(25, "Detergente", 1.75f);
        p4 = new Produto(45, "Esponja", 1.25f);
        p5 = new Produto(18, "Feijão", 4.92f);
        
//      Instancias de vendas
        Venda v1, v2;
        v1 = new Venda(101, "Carlos Alberto");
        v1.adicionarProduto(p1);
        v1.adicionarProduto(p2);
        v1.adicionarProduto(p3);
        
        v2 = new Venda(205, "Camila Souza");
        v2.adicionarProduto(p5);
        v2.adicionarProduto(p4);
        v2.adicionarProduto(p3);
        
//      Listagens de produtos da venda 1
        System.out.println("\n==================================");
        System.out.println("Cliente: "+v1.cliente);
        System.out.println("==================================\n");
        v1.listarProdutos();
//        v1.indiceProdutos();
        v1.totalizarCompra();
        
//      Listagens de produtos da venda 2
        System.out.println("\n==================================");
        System.out.println("Cliente: "+v2.cliente);
        System.out.println("==================================\n");
        v2.listarProdutos();
//        v2.indiceProdutos();
        v2.totalizarCompra();
        
//      Removendo um item do produto
        v1.totalizarCompra();
        v1.removerItemProduto(p2);
        v1.totalizarCompra();
    }

} // fim da classe
