package fundamentos;

import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {

        System.out.println("Tomada de Decisões");

        // Comparando idade
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de Idade.");
        } else if(idade >= 12) {
            System.out.println("Adolescente");
        }else {
            System.out.println("Criança");
        }

        // Comparando Email e senhas
        System.out.println("Digite seu Email: ");
        String email = input.next();

        System.out.println("Digite sua Senha: ");
        int senha = input.nextInt();

        String emailAdmin = "douglas@email";
        int senhaAdmin = 12345;

        if(email == emailAdmin && senha == senhaAdmin){
            System.out.println("Usuário Administrador");
        }else {
            System.out.println("Usuário ou senha incorretos");
        }

        input.close();
    }
}
