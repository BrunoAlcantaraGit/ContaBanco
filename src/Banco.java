import java.math.BigDecimal;

public class Banco {
int numero;
String agencia;
String nomeCliente;
BigDecimal saldo;


    public Banco() {

    }


    public void imprime(){
       System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco!" +
               " Sua agência é " + agencia+ ",conta: "+ numero + ", e seu saldo: " + saldo + ". Já está disponível para saque.");
   }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        saldo = saldo;
    }
}
