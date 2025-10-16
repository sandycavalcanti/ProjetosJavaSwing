/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  Classe criada para...
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 16/10/2025
 */
public class VerificarPadaria extends Exception{
    public VerificarPadaria(){
        super("Não é permitido vender pães após as 18h!"); 
    }
    public VerificarPadaria(int a){
        super("Não é permitido vender pães passados do ponto!"); 
    }
    public VerificarPadaria(String q){
        super("Não é permitido vender mais de 50 pães para um unico cliente!"); 
    }
    public VerificarPadaria(String q, int a){
        super("A hora inserida não é valida, por favor insira um valor entre 0 e 23!"); 
    }
    

} // fim da classe
