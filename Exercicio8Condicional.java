import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Exercicio8Condicional {
    public static void main(String[] args) {
        
        // Abrindo leitor, que agora se chama "le" pra que possamos ver que ele pode ter o nome que eu escolher
        Scanner le = new Scanner(System.in);

        // Captando dados de 6 numeros com o usuario e atribuindo cada um a uma variável (de a até f)
        System.out.println("Digite o primeiro numero: ");
        double a = le.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double b = le.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double c = le.nextDouble();
        System.out.println("Digite o quarto numero: ");
        double d = le.nextDouble();
        System.out.println("Digite o quinto numero: ");
        double e = le.nextDouble();
        System.out.println("Digite o sexto numero: ");
        double f = le.nextDouble();

        /* Abrindo 3 condicionais diferentes para que eu possa avaliar 3 condições que não tem 
        nada a ver uma com a outra. Se tivessem uma a ver com a outra, faria em um "if" só */
        
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

/* Fazer um programa que receba 6 números e exiba se:
a) A é igual a B
b) C é diferente de D
c) E é maior que F */
