package metodos;

public class user {
    static void main(String[] args) {
        tv Tv=new tv();

        System.out.println("Ligada? "+Tv.ligada);
        System.out.println("Canal: "+Tv.canal);
        System.out.println("Volume: "+Tv.volume);

        Tv.Ligar();
        System.out.println("Ligada? "+Tv.ligada);
        Tv.Desligar();
        System.out.println("Ligada? "+Tv.ligada);

        Tv.diminuirVolume();
        Tv.diminuirVolume();
        Tv.diminuirVolume();
        Tv.diminuirVolume();
        System.out.println("Volume: "+Tv.volume);

        Tv.aumentarVolume();
        Tv.aumentarVolume();
        Tv.aumentarVolume();
        Tv.aumentarVolume();
        System.out.println("Volume: "+Tv.volume);

        Tv.diminuirCanal();
        Tv.diminuirCanal();
        Tv.diminuirCanal();
        Tv.diminuirCanal();
        System.out.println("Canal: "+Tv.canal);

        Tv.aumentarCanal();
        Tv.aumentarCanal();
        Tv.aumentarCanal();
        Tv.aumentarCanal();
        System.out.println("Canal: "+Tv.canal);

        Tv.mudarCanal(10);
        System.out.println("Canal: "+Tv.canal);
    }
}
