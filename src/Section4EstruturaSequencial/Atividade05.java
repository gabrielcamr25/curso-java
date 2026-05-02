//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

package Section4EstruturaSequencial;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código da peça 1: ");
        String codigo1 = sc.nextLine();

        System.out.println("Insira o número de peças: ");
        int qtd1 = sc.nextInt();

        System.out.println("Insira o valor unitário: ");
        double valorUnidade1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Insira o código da peça 2: ");
        String codigo2 = sc.nextLine();

        System.out.println("Insira o número de peças: ");
        int qtd2 = sc.nextInt();

        System.out.println("Insira o valor unitário: ");
        double valorUnidade2 = sc.nextDouble();

        double valorTotal1 = (qtd1 * valorUnidade1);
        double mediaValor1 = (valorTotal1 / qtd1);
        double valorTotal2 = (qtd2 * valorUnidade2);
        double mediaValor2 = (valorTotal2 / qtd2);

        System.out.printf("Valor a ser pago pela primeira peça: %.2f%n" +
                          "Média de valor a ser pago por peça: %.2f%n" +
                          "Valor a ser pago pela segunda peça: %.2f%n" +
                          "Média de valor a ser pago por peça: %.2f%n", valorTotal1, mediaValor1, valorTotal2, mediaValor2 );

    }
}
