package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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


        //ordenar pela idade dos gatos
        //Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println("Ordenação pela idade: " + gatos);


        //ordenar pela cor
        gatos.sort((g1, g2) -> g1.getCor().compareToIgnoreCase(g2.getCor()));
        System.out.println("ordenação pela cor: " + gatos);

        //Ordenar por nome, cor e idade
        Comparator<Gato> ComparatorNomeCorIdade = new Comparator<Gato>() {

            @Override
            public int compare(Gato g1, Gato g2) {
                int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
                if(nome != 0) return nome;

                int cor = g1.getCor().compareToIgnoreCase(g2.getNome());
                if(cor != 0) return cor;

                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
            
        };
        gatos.sort(ComparatorNomeCorIdade);
        System.out.println("Ordenação por nome, cor e idade: " + gatos);


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


class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }

}
