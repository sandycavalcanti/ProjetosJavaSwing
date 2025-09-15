/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para...
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 15/09/2025
 */
public class Pessoa {
    private int id;
    private String nome;
    private String sexo;
    private String idioma;

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getSexo(){
        return sexo;
    }
    public String getIdioma(){
        return idioma;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    
} // fim da classe


