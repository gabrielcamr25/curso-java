//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

package Section4EstruturaSequencial;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        double valorA = sc.nextDouble();

        System.out.println("Insira o valor de B:");
        double valorB = sc.nextDouble();;

        System.out.println("Insira o valor de C:");
        double valorC = sc.nextDouble();

        double areaTriRet = (valorA * valorC)/2;
        double areaCirculo = (3.14159 * (Math.pow(valorC, 2)));
        double areaTrap = ((valorA + valorB) * valorC )/2;
        double areaQuad = (Math.pow(valorB, 2));
        double areaRet = (valorA * valorB);

        System.out.printf("A área do triângulo retângulo é: %.2f%n" +
                          "A área do círculo é: %.2f%n" +
                          "A área do trapézio é: %.2f%n" +
                          "A área do quadrado é: %.2f%n" +
                          "A área do retângulo é: %.2f%n", areaTriRet, areaCirculo, areaTrap, areaQuad, areaRet);
    }
}
