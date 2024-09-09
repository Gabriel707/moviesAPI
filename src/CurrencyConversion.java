import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConversion {
    public static void main(String[] args) {
        // Definindo as variáveis com BigDecimal e escala diretamente
        BigDecimal valorEmDolarBD = new BigDecimal("3000").setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal cotacaoDolarBD = new BigDecimal("4.94").setScale(2, RoundingMode.HALF_EVEN);

        // Realizando a conversão diretamente com a escala
        BigDecimal valorConvertidoBD = valorEmDolarBD.multiply(cotacaoDolarBD).setScale(2, RoundingMode.HALF_EVEN);

        // Exibindo o valor final diretamente com BigDecimal
        System.out.println("O valor convertido para reais é: R$ " + valorConvertidoBD);
    }
}