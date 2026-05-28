package CatalogoFilmes;

public abstract class Titulo {
    private String titulo;
    private int anoLancamento;
    private boolean incluiNoPlano;


    public static void bemVindo() {
        System.out.println("Bem vindo ao Screen Match\n\n");
    }

    public Titulo(String nomeFilme, int anoDeLancamento, boolean incluiNoPlano){
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

    public String getTitulo() {
        return titulo;
    }

    // Aqui eu estou criando um metodo apenas para os filhos dessa classe poder enxergar.
    // Logicas que os filhos podem precisar usar, como exibir nome, ano lançamento e se inclui ou não no plano

    protected void exibirDadosBase() {
        System.out.println("Nome: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Incluido no Plano: " + incluiNoPlano);
    }

    public abstract void exibirTitulo();
}