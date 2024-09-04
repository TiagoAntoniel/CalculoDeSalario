package LacosDeRepeticao;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escola a opcao");
        int opcao = 0;
        while (opcao != 3){
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            opcao = teclado.nextInt();
        }
        System.out.println("Programa finalizado");
    }
}
