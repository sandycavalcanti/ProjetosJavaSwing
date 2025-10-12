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
public class NotaDAO {
    private Conexao conexao;
    private Connection conn;
    public NotaDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    public void inserirNota(Nota n){
        String sql = "INSERT INTO NOTA (NOTA_DATA, NOTA_QUANTIDADE, CLIENTE_ID, FORNECEDOR_ID, PRODUTO_ID)\n" +
                    "VALUES (?, ?, ?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
                   
            stmt.setString(1, n.getData());
            stmt.setInt(2, n.getQuantidade());
            if (n.getClienteId() != null) {
                stmt.setInt(3, n.getClienteId());
            } else {
                stmt.setNull(3, java.sql.Types.INTEGER);
            }
            if (n.getFornecedorId() != null) {
                stmt.setInt(4, n.getFornecedorId());
            } else {
                stmt.setNull(4, java.sql.Types.INTEGER);
            }
            stmt.setInt(5, n.getProdutoId());
            stmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir nota: "+ex.getMessage());
        }
    }
    public void atualizarNota(Nota n){
        String sql = "UPDATE NOTA SET NOTA_DATA = ?, NOTA_QUANTIDADE = ?, CLIENTE_ID = ?," +
                    "  FORNECEDOR_ID = ?, PRODUTO_ID = ? WHERE NOTA_CODIGO = ?;";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, n.getData());
            stmt.setInt(2, n.getQuantidade());
            if (n.getClienteId() != null) {
                stmt.setInt(3, n.getClienteId());
            } else {
                stmt.setNull(3, java.sql.Types.INTEGER);
            }
            if (n.getFornecedorId() != null) {
                stmt.setInt(4, n.getFornecedorId());
            } else {
                stmt.setNull(4, java.sql.Types.INTEGER);
            }
            stmt.setInt(5, n.getProdutoId());
            stmt.setInt(6, n.getId());
            stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao atualizar nota: "+ex.getMessage());
        }
    }
    public void excluirNota(int id){
        try{
            String sql = "DELETE FROM NOTA WHERE NOTA_CODIGO=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao excluir nota: "+ex.getMessage());
        }
    }
    public List<Nota> listarNota(){
          List<Nota> lista = new ArrayList<>();
        String sql = "SELECT * FROM NOTA";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(); 
            while(rs.next()){
                Nota n = new Nota();
                n.setId(rs.getInt("NOTA_CODIGO"));
                n.setQuantidade(rs.getInt("NOTA_QUANTIDADE"));
                n.setData(rs.getString("NOTA_DATA"));
                n.setClienteId(rs.getInt("CLIENTE_ID"));
                n.setProdutoId(rs.getInt("PRODUTO_ID"));
                n.setFornecedorId(rs.getInt("FORNECEDOR_ID"));
                lista.add(n);
            }
            return lista;
        }catch (SQLException ex) {
            System.out.println("Erro ao listar as notas: " + ex.getMessage());
            return null;
        }
    } 
}

