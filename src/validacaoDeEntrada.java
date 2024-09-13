import java.util.Scanner;

public class validacaoDeEntrada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0;

        do {

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

            if(idade <= 0){
            System.out.println("Insira uma idade valida!");
            System.out.println("------------------------");
            
            }

        } while(idade <=0);

        System.out.println("Acesso concedido!");
    }
}
