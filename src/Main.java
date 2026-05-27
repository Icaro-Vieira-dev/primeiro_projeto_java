import CatalogoFilmes.Serie;
import ContaBancaria.ContaBancaria;


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

        /*ConvertCtoF convert = new ConvertCtoF();
        convert.setCelsius(37);
        convert.getCelsius();
        convert.celsiusToF();

        // CONVERTENDO REAL PARA EURO
        MoedaConvert real = new MoedaConvert(3.50);
        double valorMoeda = real.convertMoeda();
        double valorMoedaCentavo = real.convertMoedaCentavos();*/

        /*
        // Conta bancaria
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumero(123456789);
        conta1.setSaldo(250.00);
        conta1.setTitular("Alexandre");

        System.out.println(conta1.getNumero());
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getTitular());
        System.out.println(conta1.getSaldo());

        // conta 2
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumero(987654321);
        conta2.setSaldo(100.00);
        conta2.setTitular("Daniela");

        System.out.println(conta2.getNumero());
        System.out.println(conta2.getSaldo());
        System.out.println(conta2.getTitular());
        System.out.println(conta2.getSaldo());

        // Enviou
        conta1.tranferencia(100.00, conta1.getTitular(), conta2.getTitular());

        // recebeu
        conta2.pagamento(100.00, conta1.getTitular(), conta2.getTitular());*/

        Serie theBoys = new Serie("The boys", 2019,true);
        theBoys.setTotalTemporada(5);
        theBoys.setTotalEpisodio(8);
        theBoys.setActive(false);
        theBoys.setMinutosPorEpisodio(60);
        theBoys.exibirTitulo();













    }
}


