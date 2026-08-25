package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatoNome= new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoNome.add(c);
            }
        }
        return contatoNome;
    }

    public Contato atualizarNumero(String nome, int novoNumero){
        Contato contatoAtual= null;
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtual=c;
                break;
            }
        }
        return contatoAtual;
    }

    static void main(String[] args) {
        AgendaContatos agc= new AgendaContatos();
        agc.addContato("c1", 1);
        agc.addContato("c2", 2);
        agc.addContato("c3", 3);
        agc.addContato("c4", 4);
        agc.exibirContatos();
        System.out.println(agc.pesquisarNome("c2"));
        agc.atualizarNumero("c3", 123);
        System.out.println(agc.pesquisarNome("c3"));
    }

}
