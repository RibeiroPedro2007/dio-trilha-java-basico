package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Eventos evento=  new Eventos(nome,atracao);
        eventosMap.put(data,evento);
    }

    public void exibir(){
        Map<LocalDate, Eventos> eventosTreeMap= new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();//pega a data atual do seu PC
        LocalDate proxData=null;
        Eventos proxEvento= null;
        Map<LocalDate, Eventos> eventosTreeMap= new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proxData= entry.getKey();
                proxEvento= entry.getValue();
                System.out.println(proxData+" "+proxEvento);
                break;
            }
        }

    }

    static void main(String[] args) {
        AgendaEventos ag= new AgendaEventos();
        ag.adicionarEvento(LocalDate.of(2026, Month.SEPTEMBER,30), "ev1", "at1");
        ag.adicionarEvento(LocalDate.of(2027, Month.SEPTEMBER,30), "ev2", "at2");
        ag.adicionarEvento(LocalDate.of(2029, Month.SEPTEMBER,30), "ev3", "at4");
        ag.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER,30), "ev4", "at7");
        ag.exibir();
        ag.obterProximoEvento();

    }
}
