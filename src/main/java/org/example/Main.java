package org.example;
import java.util.Scanner;

// Questão 3 - Maior numero
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        if (n1 > n2 ){
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}