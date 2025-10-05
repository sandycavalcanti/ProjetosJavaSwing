package sistemacompravenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sandy
 */
public class NotaDAO {
    private Conexao conexao;
    private Connection conn;
    
    public NotaDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserirNota(Nota n){
        String sql = "INSERT INTO NOTA (NOTA_DATA, NOTA_QUANTIDADE_PRODUTO, CLIENTE_ID, FORNECEDOR_ID, PRODUTO_ID)\n" +
                    "VALUES (?, ?, ?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
                   
            stmt.setString(1, n.getData());
            stmt.setInt(2, n.getQuantidade());
            stmt.setInt(3, n.getClienteId());
            stmt.setInt(4, n.getFornecedorId());
            stmt.setInt(5, n.getProdutoId());
            stmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa: "+ex.getMessage());
        }
    }
}

