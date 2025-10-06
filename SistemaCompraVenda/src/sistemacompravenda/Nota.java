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
public class Nota {
    int id;
    String data;
    int quantidade;
    int clienteId;
    int fornecedorId;
    int produtoId;
    
            @Override
    public String toString() {
        return this.getId()+" - "+getData(); 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(int fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }
    
    
    
}
