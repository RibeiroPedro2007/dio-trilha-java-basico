package Interface;

public class Usuario {
    public static void main(String[] args) {

        // Instancia o objeto iPhone
        Iphone meuIphone = new Iphone("iPhone 15 Pro");

        System.out.println("=== TESTANDO MÚSICA ===");
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n=== TESTANDO TELEFONE ===");
        meuIphone.ligar("11 99999-8888");
        meuIphone.atender();

        System.out.println("\n=== TESTANDO INTERNET ===");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
    }
}