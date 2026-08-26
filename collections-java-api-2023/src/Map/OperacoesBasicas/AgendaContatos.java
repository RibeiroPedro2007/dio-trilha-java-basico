package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    public void addContato(String nome, int telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void remContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibir(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaNome(String nome){
        Integer numeroPorNome= null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome= agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    static void main(String[] args) {
        AgendaContatos ag= new AgendaContatos();
        ag.addContato("c1",1);
        ag.addContato("c2",2);
        ag.addContato("c3",3);

        ag.exibir();
        System.out.println(ag.pesquisaNome("c2"));
        ag.remContato("c2");
        ag.exibir();
    }
}
