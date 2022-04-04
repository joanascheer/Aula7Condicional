import java.util.Scanner;

public class Exercicio4Condicional {
    public static void main(String[] args) {

        // Abrindo um leitor para captura de dados que o usuario vai digitar
        Scanner leitor = new Scanner(System.in);

        /* Coletando os tamanhos da base e altura do retângulo chamando o leitor
        criado acima no Scanner para guardar o que o usuario digitar
        nas variáveis base e altura */
        System.out.println("Qual o tamanho da base do seu retângulo? ");
        double base = leitor.nextDouble();
        System.out.println("Qual a altura do seu retângulo? ");
        double altura = leitor.nextDouble();

        // Calculando a área
        double area = (base * altura);

        // Entregando o resultado
        System.out.printf("A área do seu retângulo é de %.2f", area);
    }
    
}

/*
Escreva um algoritmo para ler as dimensões de um retângulo (base
e altura), calcular e escrever a área do retângulo;
*/
