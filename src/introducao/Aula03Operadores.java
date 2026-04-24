package introducao;

public class Aula03Operadores {
    public static void main(String[] args) {
        /*
        * Operadores são símbolos para realizar operações especificas como:
        * operações matemáticas, comparações, ou verificações lógicas */

        // 1. Operadores ARITMÉTICOS
        int soma = 10 + 5;        // 15
        int subtracao = 10 - 5;   // 5
        int multiplicacao = 10 * 5; // 50
        int divisao = 10 / 3;     // 3 (nota: como são inteiros, ele descarta as casas decimais)
        int resto = 10 % 3;       // 1 (o resto da divisão de 10 por 3)

        // 2. Operadores DE ATRIBUIÇÃO
        int numero = 10;
        numero += 5; // É o mesmo que: numero = numero + 5 (resultado: 15)
        numero++;    // Incremento: adiciona 1 (resultado: 16)

        // 3. Operadores Relacionais
        boolean eMaior = 10 > 5;      // true
        boolean eIgual = (10 == 10);  // true (usa-se dois sinais de igual para comparar)
        boolean eDiferente = (10 != 5); // true

        // 4. Operadores LÓGICOS
        // && (E): Verdadeiro se AMBOS forem verdade
        boolean testeE = (10 > 5) && (2 < 1); // false, porque 2 não é menor que 1

        // || (OU): Verdadeiro se PELO MENOS UM for verdade
        boolean testeOu = (10 > 5) || (2 < 1); // true, porque a primeira parte é verdade

        // EXIBIÇÃO
        System.out.println("Soma: " + soma);
        System.out.println("Resto da divisão de 10 por 3: " + resto);
        System.out.println("10 é maior que 5? " + eMaior);
        System.out.println("Resultado Lógico OU: " + testeOu);
    }
}
