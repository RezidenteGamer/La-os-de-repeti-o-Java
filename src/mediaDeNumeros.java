import java.util.ArrayList;
import java.util.Scanner;

public class mediaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String continuar = "";

        do {
            System.out.println("Digite um número para adicionar à média: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            scanner.nextLine();

            if (numeros.size() > 0) {
                int soma = 0;
                for (int num : numeros) {
                    soma += num;
                }
                double media = (double) soma / numeros.size();
                System.out.print("Números inseridos: ");
                for (int num : numeros) {
                    System.out.print(num + " ");
                }
                System.out.println("\nA média dos números até agora é: " + media);
            }

            System.out.println("Digite 's' quando quiser parar ou qualquer outra tecla para continuar.");
            continuar = scanner.nextLine();
            
        } while (!continuar.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado.");
    }
}
