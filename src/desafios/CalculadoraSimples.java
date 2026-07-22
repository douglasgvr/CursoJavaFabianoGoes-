package desafios;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        System.out.println("Calculcadora simples");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = input.nextInt();

        System.out.println("Digite a operação matemática.");
        char operacao = input.next().charAt(0);

        System.out.println("Digite outro número");
        int n2 = input.nextInt();

        if( operacao == '+') {
            int soma = n1 + n2;
            System.out.println("Resultado: " + soma);
        } else if( operacao == '-') {
            int subtracao = n1 - n2;
            System.out.println("Resultado: " + subtracao);
        }  else if( operacao == '*') {
            int multiplicacao = n1 * n2;
            System.out.println("Resultado: " + multiplicacao);
        }

        input.close();
    }
}
