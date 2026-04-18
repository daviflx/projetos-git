import java.util.Scanner;

public class olaMundo {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Olá mundo.");
         System.out.print("Digite seu nome: ");
         String nome = scanner.nextLine();

         scanner.close();

         System.out.printf("Olá %s!" , nome);
    }
}