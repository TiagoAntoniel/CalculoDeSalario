package LacosDeRepeticao;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        int desejaContinuara = 1;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um numero:");
            int num1 = teclado.nextInt();
            System.out.println("Digite um numero:");
            int num2 = teclado.nextInt();
            System.out.println("Acertou=" + (num1 == num2));
            System.out.println("-------------------------------------------");
            System.out.println("Deseja continuar no game fio?");
            System.out.println("Sim: Digita 1");
            System.out.println("Nao: Digita 2");
            desejaContinuara = teclado.nextInt();
        } while (desejaContinuara == 1);
        if (desejaContinuara != 1){
            System.out.println("Jogo fonalizado!");
        }
    }
}
