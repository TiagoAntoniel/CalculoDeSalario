package Arrays;

import java.util.Scanner;

public class Aula002ArraysComForSimples {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: " + (i + 1) + ":");
            notas[i] = teclado.nextDouble();
            soma += notas[i];
        }
        System.out.println("Notas Digitadas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " +(i + 1)+ " = "+ notas[i]);
        }
        double media = soma / notas.length;
        System.out.println("Media das notas: " + media);
    }
}
