import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------PROJETO SIMULAR A CRIAÇÃO DE UMA CONTA BANCARIA - DIO");

        System.out.println("Digite a agencia");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite a conta");
        int  numeroConta = scanner.nextInt();

        System.out.println("Digite seu nome completo");
        String nomeCompleto = scanner.next();
        System.out.println("Processando, aguarde-------");

        System.out.println("Informação da conta");
        System.out.println("Agencia: "+ numeroAgencia);
        System.out.println("Conta: "+ numeroConta);
        System.out.println("Nome completo: "+ nomeCompleto);
        System.out.println("Saldo inicial: "+ 0);
        System.out.println("Processando, aguarde-------");
        System.out.println("Conta criada com sucesso!");
    }
}
