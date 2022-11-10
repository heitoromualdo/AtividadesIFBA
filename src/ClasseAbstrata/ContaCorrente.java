package ClasseAbstrata;

public class ContaCorrente {
    private double valor = 0d;
    private double saldo;

    public void executarOperacao(Operacao opr){
        setSaldo(this.saldo+(opr.operar(valor)));
    }

    public double getSaldoAtual() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
