package org.example;
import java.util.Scanner;

// Questão 2 -Aprovação do alunoooo
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Digite sua nota:");
        nota = entrada.nextDouble();

        if (nota >=7 ){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
