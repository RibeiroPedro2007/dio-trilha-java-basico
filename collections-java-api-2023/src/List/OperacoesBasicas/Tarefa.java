package List.OperacoesBasicas;

public class Tarefa {
    private String Descricao;

    public Tarefa(String descricao) {
        Descricao = descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    @Override
    public String toString() {
        return  Descricao;
    }
}
