public class Principal {
    public static void main(String[] args) {
        Movie filme1 = new Movie();
        filme1.nome = "Blue Velvet";
        filme1.anoDeLancamento = 1986;
        filme1.diretor = "David Lynch";
        filme1.duracaoEmMinutos = 120;

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Nota: " + filme1.pegaMedia());
        // filme1.somaDasAvaliacoes = 10;
        // filme1.totalDeAvaliacoes = 1;
        //System.out.println(filme1.pegaMedia());


    }
}