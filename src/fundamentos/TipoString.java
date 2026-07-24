package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        /*No java usamos o tipo String para representar, armazenar e manipular sequencias de texto
         * o tipo String é um objeto, isso significa que ele possui comportamentos e metodos proprios
         *o tipo String sempre começa com o S maisculo */

        String nome = "Douglas Coelho";
        String profissao = "Desenvolvedor backend java";

        /*Concatenação de Strings*/
        String boasVindas = "Seja bem-vindo ao: ";
        String linguagem = "Java - Springboot";

        System.out.println(boasVindas + linguagem);
        /*Console: "Seja bem-vindo ao: Java - Springboot"*/

        /*Imutabilidade
         *No Java, dizemos que a classe String é imutável. Aqui está a ideia principal:
         *uma vez que um texto é criado e guardado na memória do computador,
         *o conteúdo dele nunca mais pode ser modificado internamente.*/

        String texto = "Bom dia X";
        texto.replace("X", "Douglas Coelho");
        System.out.println(texto); //a saida ainda sera "Bom dia x"

        /*Por que o Java faz isso?
         *Isso traz muita segurança para aplicações backend. Como o texto nunca muda,
         *o Java pode compartilhar a mesma String em várias partes do seu sistema
         *(como em várias requisições no Spring Boot) sem medo de que uma parte altere o texto sem querer e acabe quebrando outra.*/

        /*Para que isso funcione precisamos criar uma outra String*/
        String texto1 = texto.replace("X", "Douglas Coelho");
        System.out.println(texto1);
        /*Console: Bom dia Douglas Coelho*/

        /*Metodos Ulteis do Objeto String*/

        String emailRecebido = "   usuario@api.com   ";

        /*1. trim(): Remove espaços em branco do começo e do fim (muito usado em APIs!)*/
        String emailLimpo = emailRecebido.trim(); // Fica: "usuario@api.com"
        System.out.println(emailLimpo);

        /*2. toUpperCase(): Transforma todas as letras em maiúsculas*/
        String emailMaiusculo = emailLimpo.toUpperCase(); // Fica: "USUARIO@API.COM"
        System.out.println(emailMaiusculo);

        /* 3. length(): Conta o tamanho do texto (quantos caracteres tem)*/
        int tamanho = emailLimpo.length(); // Fica: 15
        System.out.println(tamanho);

    }
}
