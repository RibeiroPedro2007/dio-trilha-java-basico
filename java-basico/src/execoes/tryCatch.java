package execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Input your name: ");
            String name = sc.nextLine();
            System.out.println("Input your last name: ");
            String lastName = sc.nextLine();
            System.out.println("Input your age: ");
            int age = sc.nextInt();
            System.out.println("Hello! My name is " + name + ", i have " + age + " years old, my last name is " + lastName);

        }catch (InputMismatchException e){//ele mostra a mensagem se essa exeção for detectada

            System.out.println("Wrong input bro");

        }

    }
}
