package Enum;

// Enum só aceita atributos com especificações definidas
public enum StatusPedido {
    PENDENTE(1, "Aguardando pagamento"),
    PAGO(2, "Pagamento confirmado"),
    ENVIADO(3, "Pedido a caminho"),
    CANCELADO(4, "Pedido cancelado");

    //atributos imutáveis
    private final int codigo;
    private final String descricao;

    // Construtor do Enum (sempre privado ou implícito)
    StatusPedido(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao.toUpperCase();//exemplo para se precisasse de uma variavel totalmente maiuscula(aqui não se aplica)
    }
}