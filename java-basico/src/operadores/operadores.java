package operadores;

public class operadores {
    static void main(String[] args) {
    // 1. Operadores Aritméticos
    int a = 10;
    int b = 3;
        System.out.println("Soma (a + b): " + (a + b));         // 13
        System.out.println("Subtração (a - b): " + (a - b));    // 7
        System.out.println("Multiplicação (a * b): " + (a * b));// 30
        System.out.println("Divisão (a / b): " + (a / b));       // 3 (inteiro)
        System.out.println("Resto (a % b): " + (a % b));        // 1

    // 2. Operadores Relacionais (Retornam verdadeiro ou falso)
    int x = 5;
    int y = 8;
        System.out.println("x é maior que y? " + (x > y));      // false
        System.out.println("x é igual a y? " + (x == y));     // false
        System.out.println("x é diferente de y? " + (x != y)); // true

    // 3. Operadores Lógicos
    boolean condicao1 = true;
    boolean condicao2 = false;
        System.out.println("E (true && false): " + (condicao1 && condicao2)); // false
        System.out.println("OU (true || false): " + (condicao1 || condicao2)); // true
        System.out.println("NÃO (!true): " + (!condicao1));
}
}