package sistemacompravenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "INSERT INTO PRODUTO (PRODUTO_NOME, PRODUTO_DESCRICAO, PRODUTO_PRECO, PRODUTO_QUANTIDADE, FORNECEDOR_ID) " +
                    "VALUES (?, ?, ?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
                   
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setFloat(3, p.getPreco());
            stmt.setInt(4, p.getQuantidade());
            stmt.setInt(5, p.getFornecedorId());
            
            stmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir produto: "+ex.getMessage());
        }
    }
    
    public List<Produto> listaProdutos(){
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM PRODUTO";
        
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("PRODUTO_ID"));
                p.setNome(rs.getString("PRODUTO_NOME"));
                p.setDescricao(rs.getString("PRODUTO_DESCRICAO"));
                p.setPreco(rs.getFloat("PRODUTO_PRECO"));
                p.setQuantidade(rs.getInt("PRODUTO_QUANTIDADE"));
                p.setFornecedorId(rs.getInt("FORNECEDOR_ID"));
                
                lista.add(p);
            }
            return lista;
        }catch (SQLException ex) {
            System.out.println("Erro ao listar produtos: " + ex.getMessage());
            return null;
        }
        
    }
    
}

