import java.text.DecimalFormat;

public class Littlesys {

    public static void main(String[] args) {
        double notaA = 8.7;
        double notaB = 7.9;
        double mediaAcomB = (notaA + notaB)/ 2;

        System.out.println("Media das duas notas é: " + mediaAcomB);

        double varA = 10.02;
        int varB;

        varB = (int) varA;
        System.out.println(varA);
        System.out.println(varB);

        char letra = 'n';
        String frase = "O nome do meu pet começa com a letra ";

        System.out.println(String.format("%s, %s", frase, letra));

        double precoBruto = 99.90;
        int quantidade = 12;
        System.out.println("A cotação feita, resultou no valor de: " + precoBruto * quantidade);

        double valorEmDol = 3000;
        double cotacaoDol = 4.94;

        double valorConvertido = valorEmDol * cotacaoDol;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("O valor convertido para reais é: R$ " + df.format(valorConvertido));

        double precoOriginal = 399.90;
        double percentualDesconto = 0.10;

        double valorDesconto = precoOriginal * percentualDesconto;
        System.out.println("Valor do desconto é igual a R$" + valorDesconto);
        System.out.println("Valor final do produto após desconto é igual a: R$" + (precoOriginal - valorDesconto));

    }
}
