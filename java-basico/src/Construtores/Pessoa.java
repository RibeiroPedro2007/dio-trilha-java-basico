package Construtores;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    //construtor serve para quando criar um objeto, precisa ter esses atributos
    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
