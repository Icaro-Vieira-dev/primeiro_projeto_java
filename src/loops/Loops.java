package loops;

import java.lang.reflect.Array;

public class Loops {

    public static void imprimirSemIcaro(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("icaro")) {
                continue;
            }
            System.out.println(nomes[i]);
        }
    }

    public static void somaDeNumeroPar(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0){
                soma = soma + numeros[i];
            }
        }

        System.out.println(soma);
    }

    public static void somaDeNumeroParWhile(int[] numeros) {
        int soma = 0;
        int i = 0;
        while (i < numeros.length) {
            if (numeros[i] %2 == 0){
                soma = soma + numeros[i];
            }
            i++;
        }
        System.out.println(soma);
    }


    static void main() {
        String[] nomes = {"icaro", "daniela", "Alexandre", "Alexandra"};
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        imprimirSemIcaro(nomes);
        somaDeNumeroPar(numeros);
        somaDeNumeroParWhile(numeros);
    }



}
