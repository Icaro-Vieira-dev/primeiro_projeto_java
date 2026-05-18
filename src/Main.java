import teste.CatalogoFilme;
import ConvertCtoF.ConvertCtoF;
import MoedaConvert.MoedaConvert;


public class Main {




    public static void main(String[] args) {
        /*CatalogoFilme.bemVindo();

        //CatalogoFilme.Filme maverick = new CatalogoFilme.Filme("Maverick", 2022, true, 8.5);

        // ou com variaveis

        String nomeFilme = "Maverick";
        int lancamento  = 2022;
        boolean incluido = false;
        double nota = 8.5;

        CatalogoFilme.Filme maverick = new CatalogoFilme.Filme(nomeFilme, lancamento, incluido, nota);

        System.out.println(maverick.nomeFilme);
        System.out.println(maverick.anoDeLancamento);
        System.out.println(CatalogoFilme.Filme.convertString(maverick.incluiNoPlano));*/


        //CONVERTENDO CELSIUS PARA F

        //ConvertCtoF convert = new ConvertCtoF(40);
        //convert.celsiusToF();


        // CONVERTENDO REAL PARA EURO
        MoedaConvert real = new MoedaConvert(3.50);
        double valorMoeda = real.convertMoeda();
        double valorMoedaCentavo = real.convertMoedaCentavos();

    }
}


