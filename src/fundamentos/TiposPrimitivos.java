package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

       /*Tipos Primitivos
       * Temos 8 tipos dentro da linguagem Java
       * 1-Char é usado para um unico caracter, ele é colocado dentro de uma aspas
       * Char -> 'a' '1' '@' 'M' 'F'
       * boolean -> true ou false (Verdadeiro ou Falso)
       * byte -> 8 bits
       * short -> 16 bits
       * int -> numeros inteiros - 32 bits
       * long -> numeros grandes como cpf por exemplo - 64 bits
       * float -> numeros flutuantes - 32 bits
       * double -> numeros decimais - 32 bits*/

        char simbolo = 'a';
        boolean estaChovendo = true;
        boolean estaChovendo2 = false;

        /*O uso do _ é para separar as casa decimais, fica mais para identificaro tamanho do numero */
        byte i1 = 127;
        short i2 = 32_767;
        int i3 = 2_147_483_647;

        /*O uso da letra F ao final do valor é para o java identificar que é um float*/
        float i4 = 123.45f;
        double i5 = 123.456;

        System.out.println(simbolo);
        System.out.println(estaChovendo);
        System.out.println(estaChovendo2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

    }
}
