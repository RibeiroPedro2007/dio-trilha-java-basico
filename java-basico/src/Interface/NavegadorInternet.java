package Interface;

// Contrato de habilidades para qualquer aparelho que navegue na web
public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}
