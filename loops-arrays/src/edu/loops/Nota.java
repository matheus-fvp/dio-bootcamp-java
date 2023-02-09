package edu.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;
        while(true) {
            System.out.print("Infrome um valor entre 0 e 10: ");
            nota = sc.nextInt();
            if(nota >= 0 && nota <= 10) break;
            else System.out.println("Nota Inválida!");
        }

        sc.close();
    }
}
