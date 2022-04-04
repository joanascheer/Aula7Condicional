import java.net.http.WebSocketHandshakeException;
import java.util.Scanner;

public class Exercicio3Condicional {
    public static void main(String[] args) {
        
        // Abrindo Scanner para captar dado do usuário
        Scanner leitor = new Scanner(System.in);

        // Armazenando número digitado pelo usuário na variável "número"
        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        // Se o número for maior que 10, o programa avisará. Se não (else), ele também avisa
        if (numero > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
    
}
