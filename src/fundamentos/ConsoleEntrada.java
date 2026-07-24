package fundamentos;

import java.util.Scanner;

public class ConsoleEntrada {
    public static void main(String[] args) {
        /*Usamos o Scanner para capturar os dados digitados pelo usuario*/
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = input.nextInt();

        System.out.println("Digite seu Nome:");
        String nome = input.next();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome = input.next();

        System.out.printf("Nome: %s %s, Idade: %d", nome, sobrenome, idade);

        input.close();
    }
}
