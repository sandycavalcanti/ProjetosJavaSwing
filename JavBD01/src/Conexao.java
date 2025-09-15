
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para realizar conexao com o banco de dados bdaula01 no MySQL
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 15/09/2025
 */
public class Conexao {
    public Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaula01?useTimezone=true&serverTimezone=UTC",
                    "root","root");
            System.out.println("Conexão realizada com sucesso!");
            return conn;
        }
        catch(Exception e){
            System.err.println("Erro ao conectar com o banco de dados "+e.getMessage());
            return null;
        }
    } 

} // fim da classe
