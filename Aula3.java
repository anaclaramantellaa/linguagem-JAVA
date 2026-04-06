package primeiro;

import java.util.Scanner;

public class Aula3 {
    public static void main(String args[]) {
        // exercicio 1
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // exercicio 2
        int z = 10;

        while (z >= 1) {
            System.out.println(z);
            z--;
        }

        // exercicio 3
        int j = 1;
        int soma = 0;

        while (j <= 5) {
            soma = soma + j;
            j++;
        }
        System.out.println(soma);

        // exercicio 4
        Scanner entrada = new Scanner(System.in);

        int numero = -1;
        int somas = 0;

        while (numero != 0) {
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();
            somas = somas + numero;
        }
        System.out.println("O valor total dos numeros digitados foi: " + somas);

        // exercicio 5
        Scanner ent = new Scanner(System.in);

        int senha = 0;

        while (senha != 1234) {
            System.out.println("Digite uma senha de 4 números: ");
            senha = ent.nextInt();
        }
        System.out.println("Senha Válida!!");
    };
}