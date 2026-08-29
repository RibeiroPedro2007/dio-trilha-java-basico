package br.dio.desafio.dominio;

public abstract class Conteudo {
    protected String titulo;
    protected String descricao;
    protected static final double XP_PADRAO=10d;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
