import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(1,2,3,4,5);

        //Function<T,R>; T=tipo, R=resultado; T= numero, R= numero*2;
        Function<Integer, Integer> dobrar= numero -> numero*2;

        List<Integer> numerosDobrados= numeros.stream().map(dobrar).toList();

        numerosDobrados.forEach(System.out::println);

        //metodo usando expressoes lambda (mais fácil vou usar só ele nos próximos exemplos)
        List<Integer> numerosDobradosComLambda = numeros.stream().map(n -> n*2).toList();

        numerosDobradosComLambda.forEach(System.out::println);
    }
}
