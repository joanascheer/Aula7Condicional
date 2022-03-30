import java.util.Scanner;

public class Exercicio4Condicional {
    public static void main(String[] args) {
        Scanner lealtura = new Scanner(System.in);
        Scanner lebase = new Scanner(System.in);

        System.out.println("Qual o tamanho da base do seu retângulo? ");
        double base = lebase.nextDouble();
        System.out.println("Qual a altura do seu retângulo? ");
        double altura = lealtura.nextDouble();

        double area = (base * altura);

        System.out.printf("A área do seu retângulo é de %.2f", area);
    }
    
}
