package FundamentosPOO;

// ABSTRAÇÃO: Servirá apenas como molde base
public abstract class Veiculo {

    // ENCAPSULAMENTO: Atributos privados
    private String marca;
    private String modelo;
    private double valorDiaria;

    public Veiculo(String marca, String modelo, double valorDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    // Método abstrato: Obriga as filhas a implementarem sua própria regra
    public abstract double calcularAluguel(int dias);

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        }
    }
}