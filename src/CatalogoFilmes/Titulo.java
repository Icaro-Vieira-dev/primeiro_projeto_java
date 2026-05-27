package CatalogoFilmes;

public class Titulo {
    private String titulo;
    private int anoLancamento;
    private Boolean incluiNoPlano;


    public static void bemVindo() {
        System.out.println("Bem vindo ao Screen Match\n\n");
    };

    public Titulo(String nomeFilme, Integer anoDeLancamento, boolean incluiNoPlano){
        this.titulo = nomeFilme;
        this.anoLancamento = anoDeLancamento;
        this.incluiNoPlano = incluiNoPlano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluiNoPlano(boolean incluiNoPlano) {
        this.incluiNoPlano = incluiNoPlano;
    }

    public void exibirTitulo(){
        System.out.println("Nome do Filme/Serie: " + titulo);
        System.out.println("Incluido no plano: " + incluiNoPlano);

    }
}