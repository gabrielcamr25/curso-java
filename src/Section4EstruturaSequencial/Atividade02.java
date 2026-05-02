//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

package Section4EstruturaSequencial;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = (3.14159 * (Math.pow(raio, 2)));
        System.out.printf("O valor da área é: %.4f%n", area);
    }
}
