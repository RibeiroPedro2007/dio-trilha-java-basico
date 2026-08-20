import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor digite o seu número da sua conta: ");
        int numero = sc.nextInt();
        sc.nextLine(); // LIMPA O "ENTER" QUE FICOU NO BUFFER

        System.out.println("Por favor digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
