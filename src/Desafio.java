import java.util.Scanner;

public class Desafio {
    private static String nome = "Clark Kent";
    private  static String conta = "Corrente";
    private  static double saldo = 1599.99;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Digite o Valor do deposito:   ");
                    double valorDeposito = scanner.nextDouble();
                    deposito(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o Valor do Saque:   ");
                    double valorSaque = scanner.nextDouble();
                    saque(valorSaque);
                    break;
                case 3:
                    System.out.println("Saindo do menu.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção invalida. Por favor, Escolha Novamente.");
            }
        }
    }
    private static void printMenu() {

        System.out.println("*********************************");
        System.out.println("Dados Iniciais do cliente:\n");
        System.out.println("Nome:                   " + nome);
        System.out.println("Tipo de Conta:          " + conta);
        System.out.println("Saldo Inicial:          R$" + saldo);
        System.out.println("*********************************");
        System.out.println("");
        System.out.println("===== MENU =====");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
        }else {
            System.out.println("Digite um valor Válido");
        }
    }
    private static void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }else {
            System.out.println("Digite um valor Válido");
        }
    }
}
