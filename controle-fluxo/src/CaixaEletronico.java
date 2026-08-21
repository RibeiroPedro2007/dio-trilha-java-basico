import java.util.Scanner;

public class CaixaEletronico {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo= sc.nextDouble();

        System.out.println("Digite o valor solicitado: ");
        double valorSolicitado= sc.nextDouble();

        if(valorSolicitado < saldo){
            saldo= saldo -valorSolicitado;
            System.out.println(saldo);
        }else{
            System.out.println("Valor insuficiente");
        }
        sc.close();
    }
}
