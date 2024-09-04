import java.util.Scanner;

public class CadastroDeUsuario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.next();
        if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println(nome + " Usuario invalido");
        } else {
            System.out.println(nome + " Cadastrado com sucesso");
        }
    }
}
