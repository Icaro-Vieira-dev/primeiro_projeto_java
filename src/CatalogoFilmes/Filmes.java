package CatalogoFilmes;

public class Filmes extends Titulo {
    private String diretor;
    private int duracaoEmMinutos;
    private boolean indicadoOscar;

    public Filmes(String nomeFilme, int anoDeLancamento, boolean incluiNoPlano){
        super(nomeFilme, anoDeLancamento, incluiNoPlano);
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public void setIndicadoOscar(boolean indicadoOscar) {
        this.indicadoOscar = indicadoOscar;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    // Abstract cumprido: Implementando o exibirTitulo() de sua propria maneira
    @Override
    public void exibirTitulo(){
        exibirDadosBase();
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Indicado ao Oscar: " + indicadoOscar);
    }


}
