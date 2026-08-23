package Enum;

public class TesteStatusPedido {
    public static void main(String[] args) {

        // 1. Criando um status inicial
        StatusPedido statusAtual = StatusPedido.PENDENTE;
        System.out.println("Status inicial: " + statusAtual);
        System.out.println("Código: " + statusAtual.getCodigo());
        System.out.println("Descrição: " + statusAtual.getDescricao());
        System.out.println("----------------------------------------");

        // 2. Simulando a alteração do status
        statusAtual = StatusPedido.PAGO;
        System.out.println("Novo status: " + statusAtual);
        System.out.println("Descrição atualizada: " + statusAtual.getDescricao());
        System.out.println("----------------------------------------");

        // 3. Testando comparação com 'if'
        if (statusAtual == StatusPedido.PAGO) {
            System.out.println("Sucesso: O pagamento foi liberado!");
        }

        System.out.println("----------------------------------------");

        // 4. Listando TODOS os status disponíveis no Enum
        System.out.println("Todos os status do sistema:");
        for (StatusPedido s : StatusPedido.values()) {
            System.out.println("- [" + s.getCodigo() + "] " + s.name() + ": " + s.getDescricao());
        }
    }
}