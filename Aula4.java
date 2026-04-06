package primeiro;

import java.util.Scanner;

public class Aula4 {
    public static void main(String args[]) {
        // exercicio 1
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Digite o que deseja: ");
        System.out.println("1- Java");
        System.out.println("2- Phython");
        System.out.println("3- JavaScript");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Java!!");
                break;
            case 2:
                System.out.println("Phython!!");
                break;
            case 3:
                System.out.println("JavaScript!!");
                break;
            default:
                System.out.println("Opção Inválida!!");
                break;
        }

        // exercicio 3

        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada1.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = entrada1.nextDouble();

        System.out.println("1- soma");
        System.out.println("2- subtração ");
        System.out.println("3- multiplicação");
        System.out.println("4- divisão");
        System.out.println("Escolha uma operação: ");

        int op = entrada1.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Opção Inválida!!");
                break;
        }

        // exercicio 4

        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada2.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada2.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = entrada2.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado!!");
        } else if (media >= 5) {
            System.out.println("Recuperação!!");
        } else if (media < 5) {
            System.out.println("Reprovado!!");
        }

        // exercicio 5
        Scanner entrada3 = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int number = entrada3.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
        entrada3.close();

        // exercicio 6
        Scanner entrada4 = new Scanner(System.in);

        int soma5 = 0;

        for (int l = 1; l <= 5; l++) {
            System.out.println("Digite um número: ");
            int digitados = entrada4.nextInt();

            soma5 = soma5 + digitados;
        }
        System.out.println("A soma dos números digitados foi: " + soma5);
        entrada4.close();

        // exercicio 7

        Scanner entrada5 = new Scanner(System.in);

        for (int f = 0; f <= 10; f++) {
            System.out.println("Digite um número: ");
            int n = entrada5.nextInt();
            if (n % 2 == 0) {
                System.out.println("Número Par");
            } else {
                System.out.println("Número ìmpar");
            }
            entrada5.close();
        }

    };

}
