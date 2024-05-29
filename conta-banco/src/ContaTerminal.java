import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    // int numeroConta = 1021;
    // String agencia = "067-8";
    // String nomeCliente = "MARIO ANDRADE";
    // Double saldo = 237.48;

    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();


        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();


        System.out.println("Por favor digite o número da conta");
        int contaCliente = scanner.nextInt();

        System.out.println("Por favor digite o valor do seu saldo");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal
        System.out.println("Olá, " + nomeCliente + " ,obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Conta: " + contaCliente);
        System.out.println("Seu saldo: " + saldo + " ,Já está disponível para saque.");

        // Exibir a mensagem conta criada


    }
}
