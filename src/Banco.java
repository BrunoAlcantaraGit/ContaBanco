import java.math.BigDecimal;

public class Banco {
    int numero;
    String agencia;
    String nomeCliente;
    BigDecimal saldo;


    public Banco() {

    }


    public void imprime() {
        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco!" +
                " Sua agência é " + agencia + ",conta: " + numero + ", seu saldo é de:: " + saldo + ". Já está disponível para saque.");
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}