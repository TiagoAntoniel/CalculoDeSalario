package Arrays;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: "+ (i+1));
            notas[i] = teclado.nextDouble();
            double media = notas[i] / notas.length;
            System.out.println("Soma das notas: " +media );
        }
    }
}
