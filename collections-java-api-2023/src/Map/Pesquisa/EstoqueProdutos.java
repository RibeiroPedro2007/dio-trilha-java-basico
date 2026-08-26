package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void addProduto(long codigo, String nome, double preco, int quantidade){
        estoqueProduto.put(codigo, new Produto( nome, preco, quantidade));
    }

    public void exibir(){
        System.out.println(estoqueProduto);
    }

    public double calcularValorEstoque(){
        double valorTotalEstoque=0;
        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                valorTotalEstoque += p.getPreco()*p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterMaisCaro(){
        Produto maisCaro= null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProduto.isEmpty()){
            for(Produto p: estoqueProduto.values()){
                if(p.getPreco() > maiorPreco){
                    maisCaro= p;
                }
            }
        }
        return maisCaro;
    }

    static void main(String[] args) {
        EstoqueProdutos est= new EstoqueProdutos();
        est.addProduto(1,"p1",1.80,3);
        est.addProduto(2,"p2",3.80,4);
        est.addProduto(3,"p3",2.80,90);
        est.exibir();
        System.out.println(est.calcularValorEstoque());
        System.out.println(est.obterMaisCaro());
    }
}
