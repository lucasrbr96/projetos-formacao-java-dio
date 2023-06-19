import com.banco.model.Cliente;
import com.banco.model.Conta;
import com.banco.model.ContaCorrente;
import com.banco.model.ContaPoupanca;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");

        Conta corrente = new ContaCorrente(cliente);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(cliente);
        poupanca.sacar(100);

        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}