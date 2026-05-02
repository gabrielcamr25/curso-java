//Fazer um programa para ler quatro valores inteiros A, B, C e D.
// A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
// segundo a fórmula: DIFERENCA = (A * B - C * D).
package Section4EstruturaSequencial;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor:");
        double valorA = sc.nextDouble();

        System.out.println("Insira um valor:");
        double valorB = sc.nextDouble();

        System.out.println("Insira um valor:");
        double valorC = sc.nextDouble();

        System.out.println("Insira um valor:");
        double valorD = sc.nextDouble();

        double dif = ((valorA * valorB) - (valorC * valorD));
        System.out.printf("A diferença é: %.2f%n", dif);
    }
}
