import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que deseja fatorar: ");
        int numero = scanner.nextInt();        

        int i = numero;
        int fatorial = 1;

        do {
            fatorial *= i;
            i--;
        } while (i > 0);

        System.out.println("O fatorial de " + numero + " é de: " + fatorial);
        
    }
}
