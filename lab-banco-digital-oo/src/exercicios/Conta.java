package exercicios;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements InterfaceConta {
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Lista para guardar o histórico de transações
    protected List<Transacao> historico;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new ArrayList<>();
    }

    public void sacar(double valor) {
        saldo -= valor;
        // Registra o saque
        historico.add(new Transacao(valor, TipoTransacao.SAQUE, "Saque realizado"));
    }

    public void depositar(double valor) {
        saldo += valor;
        // Registra o depósito
        historico.add(new Transacao(valor, TipoTransacao.DEPOSITO, "Depósito realizado"));
    }

    public void transferir(double valor, Conta contaDestino) {
        saldo -= valor;
        contaDestino.saldo += valor;

        // Registra a saída na conta de origem
        this.historico.add(new Transacao(valor, TipoTransacao.TRANSFERENCIA_ENVIADA,
                String.format("Transferência para a conta %d", contaDestino.getNumero())));

        // Registra a entrada na conta de destino
        contaDestino.historico.add(new Transacao(valor, TipoTransacao.TRANSFERENCIA_RECEBIDA,
                String.format("Transferência recebida da conta %d", this.numero)));
    }

    // Método para imprimir o extrato completo com o histórico
    public void imprimirHistorico() {
        imprimirAtributos();
        System.out.println("--- Histórico de Transações ---");
        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            for (Transacao t : historico) {
                System.out.println(t);
            }
        }
        System.out.println("=================================\n");
    }

    protected void imprimirAtributos() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getHistorico() {
        return historico;
    }
}