package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int numeroDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoes(){
        System.out.println(tarefaList);
    }
    static void main(String[] args) {
        ListaTarefa lista= new ListaTarefa();
        System.out.println("Numero de elementos na lista: "+ lista.numeroDeTarefas());
        lista.adicionarTarefa("Tarefa1");
        lista.adicionarTarefa("Tarefa2");
        lista.adicionarTarefa("Tarefa3");
        System.out.println("Numero de elementos na lista: "+ lista.numeroDeTarefas());
        lista.removerTarefa("Tarefa1");
        System.out.println("Numero de elementos na lista: "+ lista.numeroDeTarefas());
        lista.obterDescricoes();
    }
}
