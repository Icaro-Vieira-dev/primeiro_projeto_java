package MoedaConvert;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoedaConvert {
    double real;
    double euro = 5.85;

    public MoedaConvert(double real) {
        this.real = real;

    }

    public int convertMoeda() {

        // Retorno Int

        double valorEuro = euro;
        double resultado = (double) real * valorEuro;
        int resultadoConvert = (int) resultado;
        System.out.println("Valor total sem contar centavos: " + resultadoConvert);

        return resultadoConvert;
    }

    public double convertMoedaCentavos() {
        // Retorno Double
        double doubleReal = (double) this.real;
        double valor = doubleReal * euro;
        System.out.println("Valor convertido contando centavos: " + valor);

        return valor;
    }

}
