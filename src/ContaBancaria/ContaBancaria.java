package ContaBancaria;

// ENTENDENDO O GET/SET
public class ContaBancaria {
    private int numero;
    private double saldo;
    private String titular;


    public ContaBancaria() {
        numero = 111111111;
        saldo = 150.00;
        titular = "Ícaro";
    }

    // SET´s
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Get´s
    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    // metodos da classe
    public double pagamento (double valorRecebido, String titular, String destinatario) {
        double valorTotal = valorRecebido + saldo;
        this.saldo = valorTotal;
        System.out.println("Novo valor tranferido de " + titular + " para " + destinatario + ": R$: " + valorRecebido + " Saldo novo: " + saldo);

        return this.saldo;
    }

    public boolean tranferencia(double valorTransferir, String titular, String destinatario) {
        if (valorTransferir > saldo) {
            System.out.println("Sem saldo para essa transação");
            return false;

        }else{
            saldo = saldo - valorTransferir;
            System.out.println("Transferencia de " + titular + " para " + destinatario + ": R$" + valorTransferir);
            return true;
        }
    }
}
