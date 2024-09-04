import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double salario = teclado.nextDouble();
        String porcentagem = "";
        if (salario <= 2112.00) {
            porcentagem = "0%";
            System.out.println("Porcentagem do salario e "+porcentagem+" valor a pagar ISENTO");
        } else if (salario >= 2112.0 && salario <= 2826.65) {
            porcentagem = "7.5%";
            System.out.println("Porcentagem do salario "+porcentagem+" Valor a pagar e de:"+salario * 0.075);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            porcentagem = "15%";
            System.out.println("Porcentagem do salario "+porcentagem+" Valor a pagar e de:"+salario * 0.15);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            porcentagem = "22.5%";
            System.out.println("Porcentagem do salario "+porcentagem+" Valor a pagar e de:"+salario * 0.225);
        } else {
            porcentagem = "27.5%";
            System.out.println("Porcentagem do salario "+porcentagem+" Valor a pagar e de:"+salario * 0.275);
        }
    }
}
