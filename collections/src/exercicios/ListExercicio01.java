package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListExercicio01 {
    public static void main(String[] args) {
        /*
         * Faça um programa que receba a temperatura média dos 6
         * primeiros meses do ano e armazene-as em uma lista.
         * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
         * mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2– Fevereiro e etc).
         */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        List<Double> temperaturaMeses = new ArrayList<>();
        
        for(int i = 0; i < 6; i++) {
            System.out.print("Temperatura do mês " + (i + 1) + ": ");
            double mes = sc.nextDouble();
            temperaturaMeses.add(mes);
        }

        Iterator<Double> iteratorTemperaturaMeses = temperaturaMeses.iterator();
        double somaTemperaturas = 0.0;
        while(iteratorTemperaturaMeses.hasNext()) {
            double temperaturaMesAtual = iteratorTemperaturaMeses.next();
            somaTemperaturas += temperaturaMesAtual;
        }
        double mediaTemperaturaSemestral = somaTemperaturas / temperaturaMeses.size();
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        int mesIndex = 0; 
        for (Double double1 : temperaturaMeses) {
            if(double1 > mediaTemperaturaSemestral) System.out.println(meses[mesIndex]);
            mesIndex++;
        }

        sc.close();
    }
}

