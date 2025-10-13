package sistemacompravenda;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author sandy
 */
public class Conexao {
    public Connection getConexao(){
        try{
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bdVenda?useTimezone=true&serverTimezone=UTC",
                        "root","root");
            System.out.println("Conexao realizada com sucesso!");
            return conn;
        }
        catch(SQLException e){
            System.err.println("Erro ao conectar com o banco de dados "+e.getMessage());
            return null;
        }
    }
}
