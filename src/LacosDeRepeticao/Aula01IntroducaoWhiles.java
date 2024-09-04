package LacosDeRepeticao;

import java.util.Scanner;

public class Aula01IntroducaoWhiles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero a ser contado: ");
        int contador = teclado.nextInt();
        while (contador <= 50) {
            System.out.println("contador " + contador);
        contador = contador + 2;
        }
    }
}
