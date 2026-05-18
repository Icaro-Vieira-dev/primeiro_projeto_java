package ConvertCtoF;

public class ConvertCtoF {
    int celsius;

    public ConvertCtoF(int celsius){
        this.celsius = celsius;
    }

    public  void celsiusToF() {

        double calculoToF = (this.celsius * 1.8) + 32;
        int resultado = (int) calculoToF;

        System.out.println("Esse é o valor em F: " + resultado);



    }


}
