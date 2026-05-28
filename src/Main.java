import CatalogoFilmes.Filmes;
import CatalogoFilmes.Serie;
import CatalogoFilmes.Titulo;
import ContaBancaria.ContaBancaria;

import java.util.ArrayList;
import java.util.List;


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


        // POLIMORFISMO EM PRATICA

        Titulo.bemVindo();

        Titulo serie = new Serie("The boys", 2019, true);
        // Isso é um casting - Forço o Java para poder acessar os metodos desse tipo
        ((Serie) serie).setTotalTemporada(5);
        ((Serie) serie).setTotalEpisodio(8);
        ((Serie) serie).setActive(false);

        Titulo filme = new Filmes("Interestelar ", 2014, true);
        ((Filmes) filme).setDuracaoEmMinutos(169);
        ((Filmes) filme).setIndicadoOscar(true);
        ((Filmes) filme).setDiretor("Christopher Nolan");

        // Lista pela classe pai, guardando filhos diferentes - POLIMORFISMO
        List<Titulo> catalogo = new ArrayList<>();
        catalogo.add(serie);
        catalogo.add(filme);

        // Loop constante (Não precisa mudar)

        for (Titulo titulos : catalogo) {
            titulos.exibirTitulo(); // Cada tipo executando seu proprio @Override
            System.out.println("---------------------");
        }















    }
}


