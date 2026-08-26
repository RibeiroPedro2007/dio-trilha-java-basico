package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoset;

    public CadastroProduto() {
        this.produtoset = new HashSet<>();
    }

    public void addProduto(String nome, long codigo, double preco, int quantidade){
        produtoset.add(new Produto(nome, codigo, preco, quantidade));

    }

    public Set<Produto> exebirPorNome(){
        Set<Produto> produtosPorNome= new TreeSet<>(produtoset);
        return produtosPorNome;
    }

    public Set<Produto> exebirPorPreco(){
        Set<Produto> produtosPorPreco= new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoset);
        return produtosPorPreco;
    }

    static void main(String[] args) {
        CadastroProduto cad= new CadastroProduto();
        cad.addProduto("p1",1,1.50,5);
        cad.addProduto("p2",2,3.50,10);
        cad.addProduto("p3",3,78.50,6);
        cad.addProduto("p4",4,9.50,8);

        System.out.println(cad.exebirPorNome());
        System.out.println(cad.exebirPorPreco());
    }

}
