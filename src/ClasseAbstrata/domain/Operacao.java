package ClasseAbstrata.domain;

public abstract class Operacao {
    protected double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public double operar(double saldo){
        return saldo;
    }
}
