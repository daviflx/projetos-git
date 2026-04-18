import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        if (num <=0) {
            System.out.print("Número incorreto.");
            return;
        }
        for(int i= 1; i<=10;i++){
        System.out.printf("%d x %d = %d\n",num ,i , num*i );
        }

    }
}
