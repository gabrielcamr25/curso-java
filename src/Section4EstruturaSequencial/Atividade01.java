//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

package Section4EstruturaSequencial;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int vA = sc.nextInt();
        System.out.println(("Insira um valor B: "));
        int vB = sc.nextInt();
        int soma = (vA + vB);
        System.out.println("A soma é: " + soma);
    }
}