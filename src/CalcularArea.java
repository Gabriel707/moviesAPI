import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int ladoQuadrado;

        System.out.println("Insira a area do quadrado: ");
        ladoQuadrado = leitura.nextInt();

        double areaQ = Math.pow(ladoQuadrado, 2);
        System.out.println("Área do quadrado é igual a: " + areaQ);

    }
}
