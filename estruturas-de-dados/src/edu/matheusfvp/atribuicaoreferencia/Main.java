package edu.matheusfvp.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        //tipo valor
        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " - intB = " + intB);
        intA = 10;
        System.out.println("intA = " + intA + " - intB = " + intB);

        //tipo referencia
        Pessoa pessoaA = new Pessoa("Maria", 12);
        Pessoa pessoaB = pessoaA;

        System.out.println("PessoaA = " + pessoaA + " - PessoaB = " + pessoaB);
        pessoaA.setIdade(20);
        System.out.println("PessoaA = " + pessoaA + " - PessoaB = " + pessoaB);

    }
}
