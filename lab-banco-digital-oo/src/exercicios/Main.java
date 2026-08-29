package exercicios;

public class Main {
    static void main(String[] args) {
        Cliente venilton= new Cliente();
        venilton.setNome("Venilton");

        Conta contaCorrente= new ContaCorrente(venilton);
        Conta contaPoupanca= new ContaPoupanca(venilton);

        contaCorrente.depositar(1234.78);
        contaCorrente.transferir(250.56, contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaCorrente.imprimirAtributos();
        contaPoupanca.imprimirExtrato();
        contaPoupanca.imprimirAtributos();
        contaCorrente.imprimirHistorico();
    }
}
