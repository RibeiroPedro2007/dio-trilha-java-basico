package execoes;

public class FormatadorDeCep {
    static void main(String[] args) {
        try {
            String Cep= formatarCep("23345065");
            System.out.println(Cep);
        } catch (CepInvalidoException e) {
            throw new RuntimeException(e);
        }


    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length()!=8){
            throw new CepInvalidoException();

        }
        return "23.345-065";//exemplo de cep formatado
    }
}
