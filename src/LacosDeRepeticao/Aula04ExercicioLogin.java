package LacosDeRepeticao;

import javax.swing.*;
import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "tiago1003";
        final String senha = "tiagoFoda";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Faca login");
        while (true) {
            System.out.println("Digite seu usuario: ");
            String loginDigitado = teclado.next();
            System.out.println("Digite sua senha: ");
            String senhaDigitado = teclado.next();
            if (login.equals(loginDigitado) && senha.equals(senhaDigitado)) {
                System.out.println("Acesso concedido");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
    }
}

