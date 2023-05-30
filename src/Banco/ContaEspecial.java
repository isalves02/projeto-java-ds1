package Banco;

public class ContaEspecial extends ContaBancaria {
private float limite;

public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
        }


        public float getLimite(){
            return limite;
        }

@Override
public void sacar(float valor) {
        float saldoTotal = getSaldo() + limite;
        float saldo = getSaldo();

        if (valor <= saldoTotal) {
            saldo -= valor;
            setSaldo(saldo);
        } else {
        System.out.println("Saldo insuficiente.");
        }
    }
}

