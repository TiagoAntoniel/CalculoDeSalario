import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.next();
        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();
        if (idade < 11) {
            System.out.println("Menor que " + idade + " anos: " + nome + " participara da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println("entre 11 e 15 anos: " + nome + " participara da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("Entre 16 e 19 anos: " + nome + " participara da categoria Pre-adulto");
        } else {
            System.out.println("Acima de 20 anos: " + nome + " Participara da categoria Adulto ");
        }
    }
}
