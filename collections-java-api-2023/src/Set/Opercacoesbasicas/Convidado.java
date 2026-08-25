package Set.Opercacoesbasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codConvite=" + codConvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codConvite == convidado.codConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codConvite);
    }

    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

}
