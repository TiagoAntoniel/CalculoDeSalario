package Arrays.Multidimensionais;

import java.util.Scanner;

public class Aula01ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMulti1 = new int[2][3];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("Digite o valor da posicao [" + i + "] [" + j + "]");
                arrayMulti1[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("[" + i + "] [" + j + "]=" + arrayMulti1[i][j]);
            }
        }
    }
}