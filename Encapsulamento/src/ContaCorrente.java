import javax.swing.JOptionPane;
 
/**
 *  Classe criada para exemplificar o principio de encapsulamento
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 02/10/2025
 */
public class ContaCorrente {
    private String cliente;
    // Agora só podemos alterar o saldo criando um método dentro da classe
    private float saldo;
    private int senha;
    private boolean bloqueada;
    
    // Constroi o objeto na memória
    // retorna o objeto na memória
    public ContaCorrente(String cliente, float saldo, int senha){
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueada = false;
    }
    
    //Método comum para exibir os dados da conta cliente
    // Retorna o tipo de retorno
    public  void exibirDadosContaCliente(){
        System.out.println("Nome do cliente: "+getCliente());
        System.out.println("Saldo: R$"+getSaldo());
        System.out.println("Senha: "+getSenha());
    }
    
    //Metodo para modificar o saldo da conta do cliente
    // Métodos assessores
    //set = setSenha e get = getSenha
    
    //Metodo que guarda a informação
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    //Método que retorna o conteudo do atributo
    private float getSaldo(){
        return this.saldo;
    }
    
    private String getCliente() {
        return cliente;
    }

    private void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }
    
    private boolean isBloqueada(){
        return this.bloqueada;
    }
    
    private void setBloqueada(boolean bloqueada){
        this.bloqueada = bloqueada;
    }
    
    //Método para modificar o saldo da conta do cliente
    public void realizarSaque(){
        if(!verificarSenha()){
            JOptionPane.showMessageDialog(null,"Não foi possivel realizar o saque!");
        }
        else{
            float vlrSaldo;
            vlrSaldo = Float.parseFloat(JOptionPane.showInputDialog("Valor do saque: "));
            setSaldo(getSaldo() - vlrSaldo);
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!!");
        }
    }
    
    public void exibirSaldo(){
        if(!verificarSenha()){
            JOptionPane.showMessageDialog(null,"Não foi possivel exibir o saldo!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Saldo: R$"+saldo);
        }
    }
    
    public void relizarDeposito(){
        String cliDep = JOptionPane.showInputDialog("Digite o nome do cliente que deseja realizar o saldo:");
        if(cliDep.equals(getCliente())){
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do depósito:"));
            setSaldo(getSaldo() + valor);
        }
    }

    //Método para validar a senha em diversas operaçê
    public boolean verificarSenha(){
        int pwd;
        for(int i = 0; i<3;i++){
            pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
            if(pwd != getSenha()){
                JOptionPane.showMessageDialog(null, "Senha Invalida!");
                continue;
            }
            return true;   
        }
        JOptionPane.showMessageDialog(null,"Conta bloqueada!");
        setBloqueada(true);
        return false;
    }
    
    public void trocarSenha(){
         if(!verificarSenha()){
            JOptionPane.showMessageDialog(null,"Não foi possivel trocar a senha!");
        }
        else{
            int novaSenha = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova senha: "));
            int confSenha = Integer.parseInt(JOptionPane.showInputDialog("Confirmar a nova senha: "));
            if(novaSenha == confSenha){
                setSenha(novaSenha);
            } 
            else{
                JOptionPane.showMessageDialog(null,"As senhas não são iguais\n\n Não foi possivel realizar a alteração!");
            }
             
        }
    }
    
    //Método para exibir o menu
    public void menu(){
        int opc;
        String msg = "Selecione a opção desejada!!\n\n"
            + "1) Exibir saldo\n"
            + "2) Realizar saque\n"
            + "3) Realizar depósito\n"
            + "4) Trocar senha\n"
            + "0) Sair";
        while (true) {            
            if(isBloqueada()){
                JOptionPane.showMessageDialog(null, "Essa conta esta bloqueada!");
                System.exit(0);
            }
            opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
            switch(opc){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    exibirSaldo();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    relizarDeposito();
                    break;
                case 4:
                    trocarSenha();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida!");
                    break;
            }
        }
    }
    
    
    
    
} // fim da classe
