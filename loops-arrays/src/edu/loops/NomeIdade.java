package edu.loops;

import java.util.Scanner;

public class NomeIdade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        Integer idade;

        while(!(nome = sc.nextLine()).equals("0")) {
            idade = Integer.parseInt(sc.nextLine());
            System.out.println("Nome: " + nome + "\nIdade: " + idade);
        }

        sc.close();
    }

}
