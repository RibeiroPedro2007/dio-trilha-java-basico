import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    static void main(String[] args) {
        List<String> palavras= Arrays.asList("cinco", "maisQueCinco");

        //Predicate<T>; sempre retorna um booleano, pore isso não declara no <>; T= palavra, R= false ou true de palavra.length()>5;
        Predicate<String> maisDeCincoLetras= palavra -> palavra.length() >5;
        palavras.stream().filter(maisDeCincoLetras).forEach(System.out::println);

        //alternativa com lambda. Muito menor
        palavras.stream().filter(p -> p.length() >5).forEach(System.out::println);


    }
}
