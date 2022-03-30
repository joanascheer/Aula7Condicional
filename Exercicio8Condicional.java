import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Exercicio8Condicional {
    public static void main(String[] args) {
        Scanner le1 = new Scanner(System.in);
        Scanner le2 = new Scanner(System.in);
        Scanner le3 = new Scanner(System.in);
        Scanner le4 = new Scanner(System.in);
        Scanner le5 = new Scanner(System.in);
        Scanner le6 = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double a = le1.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double b = le2.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double c = le3.nextDouble();
        System.out.println("Digite o quarto numero: ");
        double d = le4.nextDouble();
        System.out.println("Digite o quinto numero: ");
        double e = le5.nextDouble();
        System.out.println("Digite o sexto numero: ");
        double f = le6.nextDouble();

        if (a == b) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("Os números são diferentes.");
        }

        if (c != d) {
            System.out.println(c+ " é diferente de " +d);
        } else {
            System.out.println("Os números são iguais");
        }

        if (e > f) {
            System.out.println(e+ " é maior que " +f);
        } else {
            System.out.println(e+ " não é maior que " +f);
        }
    }
    
}
