import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Informe seu nome !");
        banco.setNomeCliente(scanner.next());
        System.out.println("informe a agencia");
        banco.setAgencia(scanner.next());
        System.out.println("informe o numero da conta");
        banco.setNumero(scanner.nextInt());
        System.out.println(" informe seu saldo");
        banco.setSaldo(scanner.nextBigDecimal());
        banco.imprime();
    }
}