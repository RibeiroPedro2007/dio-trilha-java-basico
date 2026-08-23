package Visibilidade;

public class view {
    //todos as classes do projeto podem acessar ele dando import
    public void ControleSaida(){
        System.out.println("controle genérico de saída");
    }

    //só essa classe pode acessar
    private void PreparLamche(){
        System.out.println("preparação genéreica");
    }

    //so as classes do mesmo pacote (no caso visibilidade) podem usar esse metodos. Ele é Defaut(ou package protected)
    void Entrgar(){
        System.out.println("entrega genérica");
    }
}
