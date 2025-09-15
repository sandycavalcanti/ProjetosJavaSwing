
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
    
    


} // fim da classe
