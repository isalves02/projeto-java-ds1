package Banco;

public class ContaPoupanca extends ContaBancaria {
    private int dia_de_rendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int dia_de_rendimento) {
        super(cliente, num_conta, saldo);
        this.dia_de_rendimento = dia_de_rendimento;
    }

    public void calcularNovoSaldo(float taxa_rendimento) {
        float rendimento = getSaldo() * taxa_rendimento / 100;
        depositar(rendimento);
    }
}
