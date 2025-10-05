package sistemacompravenda;


import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author sandy
 */
public class Conexao {
    public Connection getConexao(){
        try{
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bdVenda?useTimezone=true&serverTimezone=UTC",
                        "root","Root");
            System.out.println("Conexao realizada com sucesso!");
            return conn;
        }
        catch(Exception e){
            System.err.println("Erro ao conectar com o banco de dados "+e.getMessage());
            return null;
        }
    }
}
