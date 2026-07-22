package desafios;

public class AreaCircunferencia {
    public static void main(String[] args) {
        /*Raio com o valor de 10
        * PI 3,1415 (Constante Matematica)
        *
        * Area -> PI * Raio ao Quadrado
        * 3.1415 (double) variavel para numeros decimais*/

        double raio = 10;
        final double PI = 3.1415;
        double area = PI * raio * raio;
        System.out.println("Area: " + area);
    }
}
