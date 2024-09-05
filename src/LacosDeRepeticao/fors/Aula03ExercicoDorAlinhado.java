package LacosDeRepeticao.fors;

import java.util.Scanner;

public class Aula03ExercicoDorAlinhado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser somado:");
         int i = teclado.nextInt();
        for ( ;i <= 10; i++) {
            System.out.println("Fazendo a tabuada do numero: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));

            }
        }
    }
}
