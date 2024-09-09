public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos mais assistidos!");
        } else {
            System.out.println("Filme retrô para se conferir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme incluso no plano.");
        } else {
            System.out.println("Não incluído no plano - comprar filme.");
        }

    }
}
