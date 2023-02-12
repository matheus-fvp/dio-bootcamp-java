package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(gatos);

        //deixa os elementos da lista em ordem aleatoria
        Collections.shuffle(gatos);
        System.out.print("Ordem Aleatória: ");
        System.out.println(gatos);

        //ordenar uma lista pela ordem Natural (Nome)
        Collections.sort(gatos);
        System.out.print("Ordem Natural (Nome): ");
        System.out.println(gatos);


    }
    
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareTo(o.getNome());
    }

    
}
