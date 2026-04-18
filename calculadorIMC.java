import java.util.Scanner;

public class calculadorIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (Kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (M): ");
        double altura = scanner.nextDouble();

        scanner.close();

        double imc = peso /(altura * altura);

        System.out.printf("Seu IMC é %.2f:" , imc);

        if (imc < 20) {
            System.out.print("Abaixo do peso.");
        }
        if (imc>=20 && imc < 25) {
            System.out.print("Peso normal.");  
        } else if (imc<30) {
            System.out.println("Sobrepeso.");   
        }
        else if (imc < 40) {
            System.out.println("Obeso.");  
        }
        else {
            System.out.println("Obeso mórbido.");
        }
    }
}
