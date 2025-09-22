/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para testar a cinexao criada
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 15/09/2025
 */
public class JavaBD01 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Ricardo");
        p.setSexo("M");
        p.setIdioma("Português");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
    }

} // fim da classe
