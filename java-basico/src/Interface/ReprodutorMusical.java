package Interface;

// Contrato de habilidades para qualquer aparelho que toque música
public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}