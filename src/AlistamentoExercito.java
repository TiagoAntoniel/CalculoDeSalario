import java.util.Scanner;

public class AlistamentoExercito {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.next();
        System.out.println("Digite seu sexo:");
        String sexo = teclado.next();
        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();
        if (sexo.equalsIgnoreCase("m") && idade >= 18) {
            System.out.println(nome + " Seu alistamento e obrigatorio");
        } else if (sexo.equalsIgnoreCase("m") && idade < 18) {
            System.out.println(nome + " Seu alistamento nao e permitido");
        } else if (sexo.equalsIgnoreCase("f") && idade >= 18) {
            System.out.println(nome + " voce deseja se alistar?");
            String questionamento = teclado.next();
            if (questionamento.equalsIgnoreCase("sim")) ;
            System.out.println("voce se alistou no exercito");
        } else if (sexo.equalsIgnoreCase("f") && idade >= 18)
            System.out.println("voce esta dispensada");
    }
}
