import java.net.http.WebSocketHandshakeException;
import java.util.Scanner;

public class Exercicio3Condicional {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        if (numero > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
    
}
