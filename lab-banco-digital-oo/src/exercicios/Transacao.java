package exercicios;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum TipoTransacao {
    DEPOSITO,
    SAQUE,
    TRANSFERENCIA_ENVIADA,
    TRANSFERENCIA_RECEBIDA
}

public class Transacao {
    private LocalDateTime dataHora;
    private double valor;
    private TipoTransacao tipo;
    private String descricao;

    public Transacao(double valor, TipoTransacao tipo, String descricao) {
        this.dataHora = LocalDateTime.now();
        this.valor = valor;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    // Getters
    public LocalDateTime getDataHora() { return dataHora; }
    public double getValor() { return valor; }
    public TipoTransacao getTipo() { return tipo; }
    public String getDescricao() { return descricao; }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return String.format("[%s] %-22s | R$ %8.2f | %s",
                dataHora.format(fmt), tipo, valor, descricao);
    }
}