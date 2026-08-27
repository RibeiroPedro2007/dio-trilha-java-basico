import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static void main(String[] args) {
        List<Integer> numeros= Arrays.asList(1,2,3,4,5);

        //BunaryOperator<T>; sempre retorna um valor do mesmo tipo do tipo. T= num1,num2; R= num1+num2;
        BinaryOperator<Integer> somar= (num1, num2) -> num1 + num2;

        int resultado= numeros.stream().reduce(0, somar);
        System.out.println(resultado);

        //Alternativa com Lambda
        int resultadoComLambda= numeros.stream().reduce(0, (num1,num2)->num1+num2);
        System.out.println(resultadoComLambda);

        //Lambda + metodo reference (aí tá de sacanagem kskskskskks)
        int resultadoComLambdaComReference= numeros.stream().reduce(0, Integer::sum);
        System.out.println(resultadoComLambdaComReference);
    }
}
