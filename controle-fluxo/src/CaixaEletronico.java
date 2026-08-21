import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor solicitado: ");
        double valorSolicitado = sc.nextDouble();

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("------------");

        System.out.println("Digite a nota: ");
        int nota = sc.nextInt();

        String resultado = nota >= 7 ? "aprovado" : "reprovado";
        System.out.println(resultado);

        System.out.println("------------");
        System.out.println("Digite o tamanho da blusa (P, M, G): ");

        char tam = sc.next().toUpperCase().charAt(0);
        tamanhoCamisa(tam);

        sc.close();
    }

    public static void tamanhoCamisa(char tamanho) {
        switch (tamanho) {
            case 'P':
                System.out.println("Pequeno");
                break;
            case 'M':
                System.out.println("Médio");
                break;
            case 'G':
                System.out.println("Grande");
                break;
            default:
                System.out.println("Nenhum tamanho válido digitado");
                break;
        }
    }
}