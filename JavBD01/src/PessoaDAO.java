
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para fazer a interação da classe pessoa com o banco de dados
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 15/09/2025
 */
public class PessoaDAO {
    private Conexao conexao;
    private Connection conn;
    
    public PessoaDAO(){
       this.conexao = new Conexao();
       this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO Pessoa( nome, sexo, idioma) VALUES (?, ?, ?);";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            
            stmt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa: "+ex.getMessage());
        }
    }
    
    public Pessoa getPessoa(int id){
        String sql = "select * from Pessoa where id = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Pessoa p = new Pessoa();
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setSexo(rs.getNString("sexo"));
            p.setIdioma(rs.getNString("idioma"));
            return p;
        } catch(SQLException ex){
            System.out.println("Erro ao consultar pessoa: "+ex.getMessage());
            return null;
        }
    }
    
    public void editarPessoa(Pessoa p){
        try{
        String sql = "UPDATE Pessoa set nome=?, sexo=?, idioma=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        stmt.setString(2, p.getSexo());
        stmt.setString(3, p.getIdioma());
        stmt.setInt(4, p.getId());
        stmt.execute();
        } catch (SQLException ex){
            System.out.println("Erro ao atualiizar pessoa: "+ex.getMessage());
        }
    }
    
    public void excluirPessoa(int id){
        try{
            String sql = "delete from Pessoa WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao excluir pessoa: "+ex.getMessage());
        }
        
    }
    
} // fim da classe
