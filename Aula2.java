package primeiro;

import java.util.Scanner;

public class Aula2 {
    public static void main(String args[]) {
        /* imprimir os dados na tela */
        /*
         * String texto = "Disciplina - Desenvolvimento de Software";
         * int ano = 2026;
         * System.out.println(texto);
         * System.out.println("Universidade");
         * System.out.print(ano);
         * System.out.println();
         * System.out.println("===============");
         * System.out.print("Olá");
         * System.out.println("Isadora");
         * System.out.print("Olá\nIsadora");
         * System.out.println("Olá" + "Isadora");
         */

        /* captar um dado declarado pelo sistema ou pelo usuário */
        /*
         * int numero;
         * Scanner entrada = new Scanner(System.in);
         * numero = entrada.nextInt();
         * System.out.print(numero);
         * System.out.println("Você digitou: " + numero);
         */

        /*
         * String nome = "Isadora";
         * int idade = 20;
         * System.out.println("Olá, " + nome + "!");
         * System.out.println("Você tem " + idade + " anos.");
         */

        /*
         * System.out.println("Informe sua idade: ");
         * int x;
         * Scanner entr = new Scanner(System.in);
         * x = entr.nextInt();
         * System.out.println("Sua idade é: " + x);
         */

        /*
         * int i = 5;
         * int j = i++;
         * int x = ++i;
         * int y = j + x;
         * System.out.println(y);
         */

        /*
         * int num1 = 10;
         * int num2 = 20;
         * int num3 = 45;
         * System.out.println("A média de 10, 20 e 45 é: " + (num1 + num2 + num3) / 3);
         */

        int lado1 = 15, lado2 = 15, lado3 = 20;
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triângulo Equilátero!!");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else if (lado1 != lado2 || lado2 != lado3) {
            System.out.println("Triângulo Escaleno");
        }

    };
}
