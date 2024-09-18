import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Insira o primeiro número: ");
        num1 = leitura.nextInt();

        System.out.println("Insira o segundo número: ");
        num2 = leitura.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (num1 < num2) {
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
