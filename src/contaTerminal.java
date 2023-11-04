import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("digite seu nome ");
            String nome = scanner.next();

            System.out.println("digite sua agencia ");
            String agencia = scanner.next();

            System.out.println("Digite o numero da sua conta ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite seu saldo");
            double saldo = scanner.nextDouble();

            System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                    + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}