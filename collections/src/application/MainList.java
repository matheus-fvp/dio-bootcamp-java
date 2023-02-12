package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainList {
    public static void main(String[] args) throws Exception {
        
        //Dada uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 8, 3.6} faça:

        //1 - Criar uma lista
        List<Double> notas = new ArrayList<>();

        //adicionar dados em uma lista
        notas.addAll(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));

        //imprimir a lista
        System.out.println(notas);

        //exibir a posição de um determinado elemento
        System.out.println(notas.indexOf(5d));

        //adicionar a nota 8.8 na posição 4
        notas.add(4, 8.8);
        System.out.println(notas);

        //substituir a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //checar se a nota 5 está na lista
        System.out.println(notas.contains(5d));

        //imprimir a lista usando o foreach
        for (Double double1 : notas) {
            System.out.println(double1);
        }

        System.out.println("==========");
        //obter a terceira nota da lista
        System.out.println(notas.get(3));

        System.out.println("==================");
        //exibir a menor nota
        System.out.println(Collections.min(notas));

        System.out.println("==================");
        //exibir maior nota
        System.out.println(Collections.max(notas));

        System.out.println("==================");
        //exibir a soma dos valores
        Iterator<Double> it = notas.iterator();
        double soma = 0.0;
        while(it.hasNext()) {
            soma += it.next();
        }
        System.out.println("Soma dos valores: " + soma);

        System.out.println(String.format("Media das notas: %.2f", soma / notas.size()));

        //remover a nota 6
        notas.remove(6d);
        System.out.println(notas);
        //remover a nota da posição 0
        notas.remove(0);
        System.out.println(notas);


        //remover as notas menores que 7
        Iterator<Double> it2 = notas.iterator();
        while(it2.hasNext()) {
            if(it2.next() < 7)
                it2.remove();
        }
        System.out.println(notas);

        //apagar a lista
        notas.clear();
        System.out.println(notas);

        //verificar se a lista está vazia
        System.out.println(notas.isEmpty());

    }
}
