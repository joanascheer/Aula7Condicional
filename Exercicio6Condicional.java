import java.util.Scanner;

public class Exercicio6Condicional {
    public static void main(String[] args) {
        // Abrindo Scanner pra pegar dados com o usuário
        Scanner leitor = new Scanner(System.in);

        // Captando dados do nome dos times e seus gols, e armazenando em variáveis
        System.out.println("Qual é o nome do primeiro time? ");
        String time1 = leitor.nextLine();
        System.out.println("Quantos gols o " +time1+ " fez? ");
        int golsTime1 = leitor.nextInt();
        System.out.println("Qual é o nome do segundo time? ");
        String time2 = leitor.nextLine();
        System.out.println("Quantos gols o " +time2+ " fez? ");
        int golsTime2 = leitor.nextInt();

        /* Fazendo condição. Se os gols do time 1 forem maiores, o programa avisa que o time 1 venceu.
        Caso contrário, o time 2 venceu. Se não (else), o programa avisa do empate. */
        if (golsTime1 > golsTime2) {
            System.out.println("O vencedor foi o " +time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("O vencedor foi o " +time2);
        } else {
            System.out.println("EMPATE");
        }
    }
    /* Ler o nome de 2 times e o número de gols marcados na partida (para
cada time). Escrever o nome do vencedor. Caso não haja vencedor
deverá ser impressa a palavra EMPATE */
}
