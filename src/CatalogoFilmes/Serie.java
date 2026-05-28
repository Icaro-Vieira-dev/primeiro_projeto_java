package CatalogoFilmes;

public class Serie extends Titulo{
    private int totalTemporada;
    private int totalEpisodio;
    private boolean active;
    private int minutosPorEpisodio;


    public Serie (String nomeFilme, int anoDeLancamento, boolean incluiNoPlano ) {
        super(nomeFilme, anoDeLancamento, incluiNoPlano);
    }

    public void setTotalTemporada(int totalTemporada) {
        this.totalTemporada = totalTemporada;
    }

    public void setTotalEpisodio(int totalEpisodio) {
        this.totalEpisodio = totalEpisodio;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTotalTemporada() {
        return totalTemporada;
    }

    public int getTotalEpisodio() {
        return totalEpisodio;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public int calcularTotalEpisodios() {
        return totalTemporada * totalEpisodio;
    }


    @Override
    public void exibirTitulo() {
        exibirDadosBase(); // Reaproveitei a genetica do pai (exibindo nome, ano de lançamento incluido ou nao no plano

        // Aqui eu mexo exatamente oq esse metodo vai fazer a mais.
        System.out.println("Total de Temporada: " + this.totalTemporada);
        System.out.println("Total de episodios por temporada: " + this.totalEpisodio);
        System.out.println("Andamento: " + this.active);
        System.out.println("Total de episodios: " + calcularTotalEpisodios());

    }
}
