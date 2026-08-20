package metodos;

public class tv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void Ligar(){
        ligada=true;
    }
    public void Desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        if(volume>100){volume=100;}
    }
    public void diminuirVolume(){
        volume--;
        if(volume<0){volume=0;}
    }

    public void mudarCanal(int novoCanal) {
        canal=novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        if(canal>100){canal=100;}
    }
    public void diminuirCanal(){
        canal--;
        if(canal<1){canal=1;}
    }
}
