public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to screen match: ");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double notaDoFilme = 8.1;
        boolean incluidoNoPlano = true;

        if (incluidoNoPlano) {
            System.out.println("Cliente incluído no plano.");
        } else {
            System.out.println("Cliente não está incluido no plano - verifique suas condições.");
        }

        double media = (9.8  + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galâ dos anos 80.
                Muito bom!
                Ano de lançamento                
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}