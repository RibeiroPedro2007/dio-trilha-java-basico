package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }


    public List<Livro> intervaloAnos(int anoInicio, int anoFim){
        List<Livro> livrosPorintervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicado()>=anoInicio && l.getAnoPublicado()<=anoFim) {
                    livrosPorintervaloAnos.add(l);
                }
            }
        }
        return livrosPorintervaloAnos;
    }

    static void main(String[] args) {
        CatalogoLivros cat= new CatalogoLivros();
        cat.addLivro("Lvro1","autor1",2008);
        cat.addLivro("Lvro2","autor1",2004);
        cat.addLivro("Lvro3","autor2",2003);
        cat.addLivro("Lvro4","autor2",2020);

        System.out.println(cat.pesquisarPorAutor("autor1"));
        System.out.println(cat.intervaloAnos(2008, 2020));

    }


}
