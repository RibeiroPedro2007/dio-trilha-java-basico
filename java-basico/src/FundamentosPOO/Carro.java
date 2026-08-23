package FundamentosPOO;

// HERANÇA: Herda tudo de Veiculo
public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String marca, String modelo, double valorDiaria, int quantidadePortas) {
        super(marca, modelo, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    // POLIMORFISMO: Regra de aluguel específica para carro (+ R$ 50 de taxa de limpeza)
    @Override
    public double calcularAluguel(int dias) {
        double taxaLimpeza = 50.0;
        return (getValorDiaria() * dias) + taxaLimpeza;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}