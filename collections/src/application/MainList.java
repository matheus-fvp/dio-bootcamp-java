package application;

import java.util.ArrayList;
import java.util.Arrays;
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

    }
}
