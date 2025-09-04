
import javax.swing.JOptionPane;

/**
 *  Classe criada para...
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 04/09/2025
 */
public class Pessoa {
    String nome;
    int idade;
    float altura;
    float peso;
    
    //Método construtor do objeto em memória
    public Pessoa(String nome, int idade, float altura, float peso){
        // Utilizamos this pra diferenciar o atributo nome do parametro nome
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    // Método construtor para a entrada de dados por meio de GUI
    public Pessoa(){
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        this.peso = Float.parseFloat(JOptionPane.showInputDialog("Peso: "));
    }
    
    // Metodo comum para exibir os dados de uma pessoa
    public void exibirDadosPessoa(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        System.out.println("IMC: "+calcularIMC() +" "+classificarIMC());
        // se escrever sout e apertar barra o texto aparece sozinho
    }
    
    //Metodod comum para calcular o IMC de uma Pessoa
    public float calcularIMC(){
        return peso/(altura*altura);
    }
    
    //Metodo comum para classificar o IMC
    public String classificarIMC(){
        float imc = calcularIMC();
        if(imc < 16.0){
            return "Muito abaixo do peso";
        }
        else if(imc <18.0){
            return "Magro";
        }
        else if(imc < 25.0){
            return "Peso normal";
        }
        else if(imc < 30){
            return "Sobre peso";
        }
        else if(imc < 35){
            return "Obesidade I - Leve";
        }
        else if(imc < 40){
            return "Obesidade II - Severa";
        }
        else{
            return "Obesidade III - Mórbida";
        }
    }
    
    //Metodo comum para exibir s adados de uma pessoa por meio de GUI
    // GUI -> Grafical User Interface
    public void exibirDadosPessoaGUI(){
        String msg;
        msg = "Nome: "+this.nome;
        msg = msg+"\nIdade: "+this.idade;
        msg = msg+"\nPeso: "+this.peso;
        msg = msg+"\nAltura: "+this.altura;
        msg = msg+"\nIMC: "+calcularIMC()+" - "+classificarIMC();
        // Exibir a mensage na caixinha
        JOptionPane.showMessageDialog(null, msg,"Dados pessoais", -1);
        
    }
    
} // fim da classe
