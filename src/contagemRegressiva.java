import java.util.Scanner;

public class contagemRegressiva {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número para fazer uma contagem regressiva: ");
        numero = scanner.nextInt();

        for(;numero >= 1; ){

            numero = numero - 1;

            System.out.println(numero);
            
        }

    }
}
