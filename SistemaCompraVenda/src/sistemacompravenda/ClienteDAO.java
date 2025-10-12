package sistemacompravenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;



/**
 *
 * @author sandy
 */
public class ClienteDAO {
    private Conexao conexao;
    private Connection conn;
    
    public ClienteDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserirCliente(Cliente cli){
        String sql = "INSERT INTO CLIENTE (CLIENTE_TIPO, CLIENTE_IDENTIFICACAO, CLIENTE_NOME, CLIENTE_EMAIL, CLIENTE_TELEFONE," +
                    "CLIENTE_ENDERECO_CIDADE, CLIENTE_ENDERECO_CEP, CLIENTE_ENDERECO_UF," +
                    "CLIENTE_ENDERECO_RUA, CLIENTE_ENDERECO_BAIRRO, CLIENTE_ENDERECO_NUMERO, CLIENTE_ENDERECO_COMPLEMENTO)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setBoolean(1, cli.isTipo());
            stmt.setString(2, cli.getIdentificador());
            stmt.setString(3, cli.getNome());
            stmt.setString(4, cli.getEmail());
            stmt.setString(5, cli.getTelefone());
            stmt.setString(6, cli.getCidade());
            stmt.setString(7, cli.getCep());
            stmt.setString(8, cli.getUf());
            stmt.setString(9, cli.getRua());
            stmt.setString(10, cli.getBairro());
            stmt.setInt(11, cli.getNumero());
            stmt.setString(12, cli.getComplemento());
            
            stmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir cliente: "+ex.getMessage());
        }
    }
    
    public void atualizarCliente(Cliente cli){
        String sql = "UPDATE CLIENTE SET CLIENTE_TIPO = ?, CLIENTE_IDENTIFICACAO = ?, CLIENTE_NOME = ?," +
                    "  CLIENTE_EMAIL = ?, CLIENTE_TELEFONE = ?, CLIENTE_ENDERECO_CIDADE = ?, CLIENTE_ENDERECO_CEP = ?," +
                    "  CLIENTE_ENDERECO_UF = ?, CLIENTE_ENDERECO_RUA = ?, CLIENTE_ENDERECO_BAIRRO = ?, CLIENTE_ENDERECO_NUMERO = ?," +
                    "  CLIENTE_ENDERECO_COMPLEMENTO = ? WHERE CLIENTE_ID = ?;";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setBoolean(1, cli.isTipo());
            stmt.setString(2, cli.getIdentificador());
            stmt.setString(3, cli.getNome());
            stmt.setString(4, cli.getEmail());
            stmt.setString(5, cli.getTelefone());
            stmt.setString(6, cli.getCidade());
            stmt.setString(7, cli.getCep());
            stmt.setString(8, cli.getUf());
            stmt.setString(9, cli.getRua());
            stmt.setString(10, cli.getBairro());
            stmt.setInt(11, cli.getNumero());
            stmt.setString(12, cli.getComplemento());
            stmt.setInt(13, cli.getId());
            stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao atualizar cliente: "+ex.getMessage());
        }
        
    }
    
    public void excluirCliente(int id){
        try{
            String sql = "DELETE FROM CLIENTE WHERE CLIENTE_ID=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao excluir cliente: "+ex.getMessage());
        }
    }
    
    public List<Cliente> listarClientes() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM CLIENTE";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("CLIENTE_ID"));
                cli.setTipo(rs.getBoolean("CLIENTE_TIPO"));
                cli.setIdentificador(rs.getString("CLIENTE_IDENTIFICACAO"));
                cli.setNome(rs.getString("CLIENTE_NOME"));
                cli.setEmail(rs.getString("CLIENTE_EMAIL"));
                cli.setTelefone(rs.getString("CLIENTE_TELEFONE"));
                cli.setCidade(rs.getString("CLIENTE_ENDERECO_CIDADE"));
                cli.setCep(rs.getString("CLIENTE_ENDERECO_CEP"));
                cli.setUf(rs.getString("CLIENTE_ENDERECO_UF"));
                cli.setRua(rs.getString("CLIENTE_ENDERECO_RUA"));
                cli.setBairro(rs.getString("CLIENTE_ENDERECO_BAIRRO"));
                cli.setNumero(rs.getInt("CLIENTE_ENDERECO_NUMERO"));
                cli.setComplemento(rs.getString("CLIENTE_ENDERECO_COMPLEMENTO"));

                lista.add(cli);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Erro ao listar clientes: " + ex.getMessage());
            return null;
        }

    }

    
    
}
