package Set.Opercacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvide(String nome, int codConvite){
        convidadoSet.add(new Convidado(nome, codConvite));
    }

    public void remConvidePorCod(int codConvite){
        Convidado remover= null;
        for(Convidado c: convidadoSet){
            if(c.getCodConvite()== codConvite){
                remover=c;
                break;
            }
        }
        convidadoSet.remove(remover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void ExibirConvidados(){
        System.out.println(convidadoSet);
    }

    static void main(String[] args) {
        ConjuntoConvidados conj= new ConjuntoConvidados();
        conj.addConvide("C1",1);
        conj.addConvide("C2",2);
        conj.addConvide("C3",3);
        conj.addConvide("C4",4);
        conj.ExibirConvidados();
        System.out.println(conj.contarConvidados());
        conj.remConvidePorCod(2);
        System.out.println(conj.contarConvidados());

    }
}
