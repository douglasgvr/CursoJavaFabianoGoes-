package desafios;

public class ConversoDeTemperatura {
    public static void main(String[] args) {
        final double fahrenheit, celsius;

        fahrenheit = 71;
        celsius = (fahrenheit - 32) * 5/9;

        System.out.println(celsius);
    }
}
