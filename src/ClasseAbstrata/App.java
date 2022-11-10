package ClasseAbstrata;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente();
        Correntista correntista1 = new Correntista("Heitor", contaCorrente1);
        ContaCorrente contaCorrente2 = new ContaCorrente();
        Correntista correntista2 = new Correntista("Yan", contaCorrente2);
        ContaCorrente contaCorrente3 = new ContaCorrente();
        Correntista correntista3 = new Correntista("Mikhael", contaCorrente3);
        Banco banco = new Banco("Heitor",contaCorrente1,"Yan",contaCorrente2,"Mikhael",contaCorrente3);

        banco.debitar("Heitor",1000);
        banco.creditar("Heitor", 50000);
        banco.getCorrentista("Heitor");
        banco.transferir("Heitor","Yan",6000);

        System.out.println(banco.getSaldo("Yan"));
        System.out.println(banco.getSaldo("Heitor"));
    }
}
