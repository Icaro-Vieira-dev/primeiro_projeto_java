package JogoAdivinhacao;
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    int rangeNumero = new Random().nextInt(100) + 1;

    public void jogoDoAdivinha() {
        int chances = 5;
        Scanner scanner = new Scanner(System.in);

        while (chances > 0) {
            System.out.println("Jogue um numero: ");
            int lerNumero = scanner.nextInt();

            if (lerNumero == this.rangeNumero) {
                System.out.println("Parabéns você acertou!!!");
                break;
            } else {
                chances--;
                System.out.println("Errou! Chances restantes: " + chances);
                if (chances == 0) {
                    System.out.println("Acabou suas chances, o numero era: " + rangeNumero);
                }
            }
        }
    }

    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        jogo.jogoDoAdivinha();
    }
}