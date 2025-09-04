/**
 *  Classe criada para instanciar objetos do tipo pessoa
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 04/09/2025
 */
public class Objeto {
    
    public static void main(String[] fatec){
        Pessoa p1, p2;
        Analise analise = new Analise();
        p1 = new Pessoa();
        p2 = new Pessoa();
        
        //pessoa = new Pessoa("Sandy", 19, 1.62f, 64.32f);
        //;outraPessoa = new Pessoa("Maria", 49, 1.79f, 80.32f);
        p1.exibirDadosPessoaGUI();
        p2.exibirDadosPessoaGUI();
        System.out.println(analise.analisarIdadePessoa(p1));
        System.out.println(analise.AnalisarAlturaPessoa(p1));
        System.out.println(analise.compararAlturas(p1, p2));
        System.out.println(analise.compararIdades(p1, p2));

    }
} // fim da classe
