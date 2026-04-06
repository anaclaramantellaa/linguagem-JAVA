package primeiro;

public class Aula5 {
    public static void main(String args[]) {
        int[] notas = new int[5];
        notas[0] = 7;
        notas[1] = 8;
        notas[2] = 9;
        notas[3] = 6;
        notas[4] = 10;

        for (int i = 0; i < 5; i++) {
            System.out.println("Nota: " + notas[i]);
        }

        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[] numeros = new int[5];
        for (int i = 0; i <= 5; i++) {
            System.out.println(numeros);
        }
    };
}
