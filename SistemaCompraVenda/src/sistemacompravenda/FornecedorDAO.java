package sistemacompravenda;

import com.mysql.cj.xdevapi.Result;
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
public class FornecedorDAO {
    private Conexao conexao;
    private Connection conn;
    
    public FornecedorDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserirFornecedor(Fornecedor f){
        String sql = "INSERT INTO FORNECEDOR (FORNECEDOR_NOME, FORNECEDOR_EMAIL, FORNECEDOR_NOME_FANTASIA, FORNECEDOR_CNPJ," +
                    "FORNECEDOR_ENDERECO_CIDADE, FORNECEDOR_ENDERECO_CEP, FORNECEDOR_ENDERECO_UF," +
                    "FORNECEDOR_ENDERECO_RUA, FORNECEDOR_ENDERECO_BAIRRO, FORNECEDOR_ENDERECO_NUMERO," +
                    " FORNECEDOR_ENDERECO_COMPLEMENTO, FORNECEDOR_TELEFONE)" +
                    "VALUES (?, ?, ?, ?,?, ?, ?, ?,?, ?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
                   
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getNomeFantasia());
            stmt.setString(4, f.getCnpj());
            stmt.setString(5, f.getCidade());
            stmt.setString(6, f.getCep());
            stmt.setString(7, f.getUf());
            stmt.setString(8, f.getRua());
            stmt.setString(9, f.getBairro());
            stmt.setInt(10, f.getNumero());
            stmt.setString(11, f.getComplemento());
            stmt.setString(12, f.getTelefone());
            
            stmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa: "+ex.getMessage());
        }
    }
    
    public List<Fornecedor> listarFornecedores(){
        List<Fornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM FORNECEDOR";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor f = new Fornecedor();
                
                f.setNome(rs.getString("FORNECEDOR_NOME"));
                f.setEmail(rs.getString("FORNECEDOR_EMAIL"));
                f.setNomeFantasia(rs.getString("FORNECEDOR_NOME_FANTASIA"));
                f.setCnpj(rs.getString("FORNECEDOR_CNPJ"));
                f.setCidade(rs.getString("FORNECEDOR_ENDERECO_CIDADE"));
                f.setCep(rs.getString("FORNECEDOR_ENDERECO_CEP"));
                f.setUf(rs.getString("FORNECEDOR_ENDERECO_UF"));
                f.setRua(rs.getString("FORNECEDOR_ENDERECO_RUA"));
                f.setBairro(rs.getString("FORNECEDOR_ENDERECO_BAIRRO"));
                f.setNumero(rs.getInt("FORNECEDOR_ENDERECO_NUMERO"));
                f.setComplemento(rs.getString("FORNECEDOR_ENDERECO_COMPLEMENTO"));
                f.setTelefone(rs.getString("FORNECEDOR_TELEFONE"));
                
                lista.add(f);
                
            }
            
            return lista;
        }
        catch(SQLException ex){
            System.out.println("Erro ao listar fornecedores: " + ex.getMessage());
            return null;
        }
    }
    
}
