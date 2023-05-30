import Banco.ContaBancaria;
import Banco.ContaEspecial;
import Banco.ContaPoupanca;
public class ContasJava {
    public static void main(String[] args) {
// Incluir dados relativos as contas de um cliente
        ContaBancaria conta1 = new ContaBancaria("Márcio", 12345, 1000);
        ContaPoupanca conta2 = new ContaPoupanca("Isabel", 54321, 2000, 10);
        ContaEspecial conta3 = new ContaEspecial("Daniel", 10987, 3000, 1000);





        // Mostrar novo saldo do cliente, a partir da taxa de rendimento daqueles que possuem ContaPoupanca


        // Mostrar dados da conta do cliente
        System.out.println("Dados da conta:");
        System.out.println("Cliente: " + conta1.getCliente());
        System.out.println("Número da conta: " + conta1.getNumConta());
        System.out.println("Saldo da conta antes de sacar R$ 500: R$ " + conta1.getSaldo());
        conta1.sacar(500);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());

        System.out.println("\nDados da conta:");
        System.out.println("Cliente: " + conta2.getCliente());
        System.out.println("Número da conta: " + conta2.getNumConta());
        System.out.println("Saldo sem taxa de rendimento: R$ " + conta2.getSaldo());
        conta2.calcularNovoSaldo(10.0f);
        System.out.println("Saldo com taxa de rendimento 10%: R$ " + conta2.getSaldo());
        System.out.println("Saldo da conta antes de sacar R$ 100: R$ " + conta2.getSaldo());
        conta2.sacar(100);
        System.out.println("Saldo atual: R$ " + conta2.getSaldo());

        System.out.println("\nDados da conta:");
        System.out.println("Cliente: " + conta3.getCliente());
        System.out.println("Número da conta: " + conta3.getNumConta());
        System.out.println("Saldo da conta antes de sacar R$ 4000: R$ " + conta3.getSaldo());
        System.out.println("Limite atual: R$ " + conta3.getLimite());
        conta3.sacar(4000);
        System.out.println("Saldo atual: R$ " + conta3.getSaldo());
    }
}