package Construtores;

public class SistemaCadastro {
    static void main(String[] args) {
        Pessoa pessoa= new Pessoa("Pedro",19);//precisa dos atributos passados no construtor para criar o objeto
        pessoa.setEndereco("Rua genérica");

        System.out.println(pessoa.getIdade()+pessoa.getNome()+ pessoa.getEndereco());
    }
}
