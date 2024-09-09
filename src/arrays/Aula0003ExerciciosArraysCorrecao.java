package Arrays;

import java.util.Scanner;

public class Aula0003ExerciciosArraysCorrecao {
    public static void main(String[] args) {
    int vr1[] = new int[3];
    int vr2[] = new int[3];
    int soma[] =new int[3];
    String SomaGeral = "";
    Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vr1.length; i++) {
            System.out.print("Vetor 1 porcicao:"+ i +":");
            vr1[i] = teclado.nextInt();
            System.out.print("Vetor 2 porcicao:"+ i +":");
            vr2[i] = teclado.nextInt();
            soma[i] = vr1[i] + vr2[i];
            SomaGeral += soma[i] + " ";
        }
            System.out.println(" "+SomaGeral);
    }
}
