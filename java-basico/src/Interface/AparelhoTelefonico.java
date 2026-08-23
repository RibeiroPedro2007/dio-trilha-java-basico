package Interface;

// Contrato de habilidades para qualquer aparelho que faça chamadas
public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}