import java.util.Scanner;

public class Exercicio2Condicional {
    public static void main(String[] args) {
        Scanner leAltura = new Scanner(System.in);
        Scanner lePeso = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = leAltura.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = lePeso.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Seu peso está normal.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está com sobrepeso.");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está com obesidade de grau I.");
        } else {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println(". Você está com obesidade de grau II.");
        }
    }
    
}
