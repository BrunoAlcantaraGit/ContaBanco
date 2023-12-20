import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Informe seu nome !");
        banco.setAgencia(scanner.next());
        System.out.println("agencia");
        banco.setAgencia(scanner.next());
        System.out.println("numero da conta");
        banco.setNumero(scanner.nextInt());


        banco.imprime();
    }
}