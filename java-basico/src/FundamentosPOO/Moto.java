package FundamentosPOO;

// HERANÇA: Herda tudo de Veiculo
public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, double valorDiaria, int cilindradas) {
        super(marca, modelo, valorDiaria);
        this.cilindradas = cilindradas;
    }

    // POLIMORFISMO: Regra de aluguel específica para moto (taxa extra se for > 300cc)
    @Override
    public double calcularAluguel(int dias) {
        double total = getValorDiaria() * dias;
        if (cilindradas > 300) {
            total += 30.0 * dias;
        }
        return total;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}