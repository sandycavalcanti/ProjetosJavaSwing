package sistemacompravenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sandy
 */
public class ProdutoDAO {
        private Conexao conexao;
    private Connection conn;
    
    public ProdutoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserirProduto(Produto p){
        String sql = "INSERT INTO PRODUTO (PRODUTO_NOME, PRODUTO_DESCRICAO, PRODUTO_PRECO, PRODUTO_QUANTIDADE_ESTOQUE, FORNECEDOR_ID) " +
                    "VALUES (?, ?, ?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
                   
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setFloat(3, p.getPreco());
            stmt.setInt(4, p.getQuantidade());
            stmt.setInt(4, p.getFornecedorId());
            
            stmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa: "+ex.getMessage());
        }
    }
}

