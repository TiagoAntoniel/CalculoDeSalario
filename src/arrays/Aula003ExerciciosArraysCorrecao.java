package Arrays;

import java.util.Scanner;

public class Aula003ExerciciosArraysCorrecao {
    public static void main(String[] args) {
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Vetor 1, posicao: " + i);
            v1[i] = teclado.nextInt();
        }
        System.out.println("Didite os valores Inteiros para o vetor 2: ");
        for (int i = 0; i < v2.length; i++) {
            System.out.println("Vetor 2, posicao: " + i);
            v2[i] = teclado.nextInt();
        }
        System.out.println("Resultado da multiplicação dos elementos de v1 com os correspondentes em v2:");
        for (int i = 0; i < v1.length; i++) {
            int resultado = v1[i] * v2[i];
            System.out.println("v1[" + v1[i] + "] * v2[" + v2[i] + "] = " + resultado);
        }
        teclado.close();
    }
}
