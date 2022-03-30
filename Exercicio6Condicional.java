import java.util.Scanner;

public class Exercicio6Condicional {
    public static void main(String[] args) {
        Scanner letime1 = new Scanner(System.in);
        Scanner letime2 = new Scanner(System.in);
        Scanner legolstime1 = new Scanner(System.in);
        Scanner legolstime2 = new Scanner(System.in);

        System.out.println("Qual é o nome do primeiro time? ");
        String time1 = letime1.nextLine();
        System.out.println("Quantos gols o " +time1+ " fez? ");
        int golsTime1 = legolstime1.nextInt();
        System.out.println("Qual é o nome do segundo time? ");
        String time2 = letime2.nextLine();
        System.out.println("Quantos gols o " +time2+ " fez? ");
        int golsTime2 = legolstime2.nextInt();

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
