package FundamentosPOO;

public class Usuario {

    // Método auxiliar para simular o uso dos veículos (Polimorfismo)
    public static void testarVeiculo(Veiculo veiculo, int dias) {
        System.out.println("Testando: " + veiculo.getMarca() + " " + veiculo.getModelo());
        System.out.println("Valor do aluguel por " + dias + " dias: R$ " + veiculo.calcularAluguel(dias));
        System.out.println("Dando a partida... VRUM VRUM! 🚀\n");
    }

    public static void main(String[] args) {
        System.out.println("=== INICIANDO TESTES DO USUÁRIO ===\n");

        // Instanciando os objetos reais (Carro e Moto) usando o molde base (Veiculo)
        Veiculo meuCarro = new Carro("Toyota", "Corolla", 150.0, 4);
        Veiculo minhaMoto = new Moto("Yamaha", "MT-07", 100.0, 689);

        // O 'Usuario' usa e testa os métodos de cada objeto
        testarVeiculo(meuCarro, 3);
        testarVeiculo(minhaMoto, 3);
    }
}