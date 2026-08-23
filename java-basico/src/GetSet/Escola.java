package GetSet;

public class Escola {
    static void main(String[] args) {
        Aluno felipe= new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(12);
        System.out.println(felipe.getNome()+felipe.getIdade());

    }
}
