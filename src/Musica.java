public class Musica {
    String titulo;
    String artista;
    int anoLacamento;
    double avaliacao;
    int numAvaliacoes;


    void exibirFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLacamento);
        System.out.println("Avaliacao: " + avaliacao);
    }

    void avaliaMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMedia(){
        return avaliacao / numAvaliacoes;
    }
}
