package switchcase;

import java.util.Scanner;

public class aula01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        int dia = teclado.nextInt();
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda feita");
                break;
            case 3:
                System.out.println("terca feita");
                break;
            case 4:
                System.out.println("quarta feita");
                break;
            case 5:
                System.out.println("quinta feita");
                break;
            case 6:
                System.out.println("sexta feita");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("esse dia nao e correspondente");
        }
        System.out.println("Aproveite seu dia");
    }
}
