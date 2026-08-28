package exercicios;

public abstract class Conta  implements InterfaceConta{
    protected static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia=1;
        this.numero= SEQUENCIAL++;
        this.cliente= cliente;
    }

    public void sacar(double valor){
        saldo-=valor;
    }

    public void depositar(double valor){
        saldo+=valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirAtributos(){
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
}
