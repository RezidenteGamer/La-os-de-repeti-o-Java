import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100);
        int chute = 0;

        System.out.println("Adivinhe o número que o computador pensou: ");

        do {
            System.out.println("Diga qual número você acha que é!");
            chute = scanner.nextInt();

            if (chute != numeroAleatorio){
                System.out.println("Você errou!");
                System.out.println("--------------");
                System.out.println("Tente novamente: ");
            }
        } while (chute != numeroAleatorio);

        System.out.println("--------------");
        System.out.println("Você acertou!");
        System.out.println("O numero correto era: " + numeroAleatorio);
    }
}
