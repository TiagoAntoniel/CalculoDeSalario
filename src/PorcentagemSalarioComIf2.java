import java.util.Scanner;

public class PorcentagemSalarioComIf2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu salario");
        float salario = teclado.nextFloat();
        float resultado = 0F;
        String porcentagem = "";
        if (salario >= 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("Valor final em porcentagem de: " + porcentagem + " e de " + resultado);
    }
}
