package Interface;

// O iPhone reúne e cumpre o contrato das 3 interfaces usando Múltipla Implementação
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String modelo;

    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    // --- MÉTODOS DO REPRODUTOR MUSICAL ---
    @Override
    public void tocar() {
        System.out.println("[" + modelo + "] Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("[" + modelo + "] Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("[" + modelo + "] Selecionando a música: " + musica);
    }

    // --- MÉTODOS DO APARELHO TELEFÔNICO ---
    @Override
    public void ligar(String numero) {
        System.out.println("[" + modelo + "] Discando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("[" + modelo + "] Chamada atendida. 'Alô?'");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("[" + modelo + "] Ouvindo mensagens do correio de voz.");
    }

    // --- MÉTODOS DO NAVEGADOR DE INTERNET ---
    @Override
    public void exibirPagina(String url) {
        System.out.println("[" + modelo + "] Carregando página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("[" + modelo + "] Nova aba do navegador aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("[" + modelo + "] Página recarregada.");
    }
}