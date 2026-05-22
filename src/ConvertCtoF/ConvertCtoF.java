package ConvertCtoF;

public class ConvertCtoF {
    // int celsius;  < Antes o celsius era publico e qualquer um podia alterar.
    private int celsius; // Agora ele é privado, e apenas consegue ser alterado por um setter

    // Setter criado para troca de valor do celsius.

    public void setCelsius(int celsius) {
        this.celsius = celsius;
        System.out.println("Valor alterado para: " + this.celsius);
    }

    public int  getCelsius() {
        return celsius;
    }

    public  void celsiusToF() {

        double calculoToF = (this.celsius * 1.8) + 32; // Sem um valor colocado dentro do celsius usando o setter, o resutado sempre vai dar 32, pois ele esta setado como 0
        int resultado = (int) calculoToF;

        System.out.println("Esse é o valor em F: " + resultado);



    }


}
