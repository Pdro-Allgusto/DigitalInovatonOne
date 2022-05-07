

public class Main {

    public static void main(String[] args) {
	Cliente pedro=new Cliente();
    pedro.setNome("PEDRO");
    Banco banco=new Banco();
    banco.setNome("Banco Legal");

    Conta cc = new ContaCorrente(pedro);
    Conta poup = new ContaPoupanca(pedro);

    cc.depositar(100);
    cc.tranferir(43,poup);

    cc.imprimirExtrato();
    poup.imprimirExtrato();

    }
}
