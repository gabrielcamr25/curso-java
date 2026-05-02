//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
package Section4EstruturaSequencial;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu número: ");
        double numFunc = sc.nextDouble();

        System.out.println("Insira as horas trabalhadas: ");
        int horasTrab = sc.nextInt();

        System.out.println("Insira o valor hora: ");
        int valorHora = sc.nextInt();

        double salario = (horasTrab * valorHora);

        System.out.println("O seu número: " + numFunc);
        System.out.printf("Salário: %.2f%n", salario);

    }
}
