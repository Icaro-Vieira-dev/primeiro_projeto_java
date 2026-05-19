package scanner;

import java.util.Scanner;

public class leitura {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");

        String nomeFilme = scanner.nextLine();
        System.out.println(nomeFilme);
        System.out.println("Digite Ano de lançamento: ");

        int anoLancamento = scanner.nextInt();
        System.out.println(anoLancamento);



    }
}
