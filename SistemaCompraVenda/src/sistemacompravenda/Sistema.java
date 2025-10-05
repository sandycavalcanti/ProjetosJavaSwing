/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacompravenda;

/**
 *
 * @author sandy
 */
public class Sistema {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setTipo(true);
        cli.setIdentificador("12345678900");
        cli.setNome("João da Silva");
        cli.setEmail("joao@email.com");
        cli.setTelefone("999999999");
        cli.setCidade("São Paulo");
        cli.setCep("01001000");
        cli.setUf("SP");
        cli.setRua("Av. Paulista");
        cli.setBairro("Bela Vista");
        cli.setNumero(1000);
        cli.setComplemento("Apto 12");
        
        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.inserirCliente(cli);
    }
    
}
