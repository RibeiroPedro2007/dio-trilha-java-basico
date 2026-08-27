import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    static void main(String[] args) {
        Supplier<String> saudacao= ()->"Olá";

        List<String> listaSaudacoes= Stream.generate(saudacao).limit(5).toList();

        //expresão lambda
        listaSaudacoes.forEach(s-> System.out.println(s));
        //
        System.out.println();
        //metodo reference
        listaSaudacoes.forEach(System.out::println);
    }
}
