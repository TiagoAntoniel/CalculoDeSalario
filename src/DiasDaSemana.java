import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        int dia = teclado.nextInt();
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("segunda feita");
        } else if (dia == 3) {
            System.out.println("terca feita");
        } else if (dia == 4) {
            System.out.println("quarta feita");
        } else if (dia == 5) {
            System.out.println("quinta feita");
        } else if (dia == 6) {
            System.out.println("sexta feita");
        } else {
            System.out.println("sabado");
        }
    }
}
