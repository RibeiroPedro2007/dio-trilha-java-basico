package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasIdade= new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);

        return pessoasIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura= new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    static void main(String[] args) {
        OrdenacaoPessoa ord= new OrdenacaoPessoa();
        ord.addPessoa("pessoa1",39,1.90);
        ord.addPessoa("pessoa2",22,1.86);
        ord.addPessoa("pessoa3",23,1.80);
        ord.addPessoa("pessoa4",24,1.70);
        System.out.println(ord.ordenarIdade());
        System.out.println(ord.ordenarPorAltura());
    }
}
