package teste;

public class CatalogoFilme {

    // Criando um catalogo de filmes

    public static void bemVindo() {
        System.out.println("Bem vindo ao Screen Match\n\n");
    };

    public static class Filme{
        public String nomeFilme;
        public Integer anoDeLancamento;
        public Boolean incluiNoPlano;
        public double nota;

        public Filme(String nomeFilme, Integer anoDeLancamento, boolean incluiNoPlano, double nota){
            this.nomeFilme = nomeFilme;
            this.anoDeLancamento = anoDeLancamento;
            this.incluiNoPlano = incluiNoPlano;
            this.nota = nota;
        }

        public static String convertString(boolean includePlan) {

            if (includePlan){
                String incluido = "Sim";
                return incluido;
            }

            else {
                String incluido = "Não";
                return incluido;
            }

        }


    }

}



