import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal novaConta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        novaConta.nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da sua conta: ");
        novaConta.numero = scanner.nextInt();
        System.out.println("Digite o número da sua agência: ");
        novaConta.agencia = scanner.next();

        System.out.println("Olá "+ novaConta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua " +
                "agência é "+ novaConta.agencia + ", conta "+ novaConta.numero + " e seu saldo R$"+ novaConta.saldo +
                " já está disponível para saque.");

    }
}