import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double numero;

        System.out.println("Digite um número para multiplicar ele de 1 a 10: ");
        numero = scanner.nextDouble();
        
        for(int i = 1; i<=10; i++){

        System.out.println(numero + " X " + i + " = " + numero * i);
        }

    }

}