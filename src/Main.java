public class Main {

    public static void main(String[] args) {
        Cliente camila = new Cliente();
        camila.setNomeCliente("Camila");

        Conta cc = new ContaCorrente(camila);
        Conta poupanca = new ContaPoupanca(camila);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirInfo();
        poupanca.imprimirInfo();
    }
}
