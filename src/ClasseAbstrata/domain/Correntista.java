package ClasseAbstrata.domain;

public class Correntista {
    private String nome;
    private ContaCorrente conta;

    public Correntista(String nome, ContaCorrente co1) {
        this.nome = nome;
        this.conta = co1;
    }

    public String getNome() {
        return nome;
    }
    public ContaCorrente getContaCorrente() {
        return conta;
    }


}
