/**
 *  Classe criada para analisar um objeto do tipo pessoa
 * @author Sandy Pereira Cavalcanti
 * @since Classe criada em 04/09/2025
 */
public class Analise {
    
    // metodo comum para analisar a idade de uma pessoa
    public String analisarIdadePessoa(Pessoa p){
        if(p.idade < 2){
            return p.nome+ " é um Bebê";
        }
        else if(p.idade < 13){
            return p.nome+ " é uma Criança";
        }
        else if(p.idade < 20){
            return p.nome+ " é um Adolescente";
        }
        else if(p.idade <= 60){
            return p.nome+ " é um Adulto";
        }
        else if(p.idade <= 85){
            return p.nome+ " é um Idoso";
        }
        else{
            return p.nome+ " é um Mega velho";
        }
    }
    
    // Metodo comum para analisar a altura de uma pessoa
    public String AnalisarAlturaPessoa(Pessoa p){
        if(p.altura < 1.30){
            return p.nome+ " é um Gnome!";
        }
        else if(p.altura < 1.55){
            return p.nome+ " é pequena";
        }
        else if(p.altura < 1.80){
            return p.nome+ " é média";
        }
        else if(p.altura < 2){
            return p.nome+ " é alta";
        }
        else{
            return p.nome+ " é Enorme!";
        }
    }
    
            // Metodo comum para analisar e compara a idade de 2 pessoas
    public String compararIdades(Pessoa a, Pessoa b){
        if(a.idade == b.idade){
            return "Ambas tem a mesma idade!";
        }
        else if(a.idade > b.idade){
            return a.nome+ " é mais velha que "+ b.nome;
        }
        else{
            return b.nome+ " é mais velha que "+ a.nome;
        }
    }
    
        // Metodo comum para analisar e compara a altura de 2 pessoas
    public String compararAlturas(Pessoa a, Pessoa b){
        if(a.altura == b.altura){
            return "Ambas tem a mesma altura!";
        }
        else if(a.altura > b.altura){
            return a.nome+ " é maior que "+ b.nome;
        }
        else{
            return b.nome+ " é maior que "+ a.nome;
        }
    }
    
}


