package desafios;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int n3 = input.nextInt();

        System.out.println("Digite o quarto numero: ");
        int n4 = input.nextInt();

        int resultado = n1 + n2 + n3 + n4;
        int media = resultado / 4;
        System.out.println("Resultado da soma: " + resultado);
        System.out.println("Media da soma: " + media);
        input.close();
    }
}
