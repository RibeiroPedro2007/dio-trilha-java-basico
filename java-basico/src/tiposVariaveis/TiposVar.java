package tiposVariaveis;

public class TiposVar {
    static void main(String[] args) {
                // 1. Tipo Byte (Inteiro de 8 bits)
                byte vByte = 127;

                // 2. Tipo Short (Inteiro de 16 bits)
                short vShort = 32767;

                // 3. Tipo Int (Inteiro de 32 bits)
                int vInt = 2147483647;

                // 4. Tipo Long (Inteiro de 64 bits) - usa 'L' no fim
                long vLong = 9223372036854775807L;

                // 5. Tipo Float (Decimal de 32 bits) - usa 'f' no fim
                float vFloat = 3.4028235E38f;

                // 6. Tipo Double (Decimal de 64 bits)
                double vDouble = 1.7976931348623157E308;

                // 7. Tipo Char (Caractere Unicode de 16 bits)
                char vChar = 'A';

                // 8. Tipo Boolean (Lógico: verdadeiro/falso)
                boolean vBoolean = true;

                // 9. Tipo final (não permite modificar o valor da variável (sempre escita em caixa alta))
                final double VALOR_PI = 3.14;

                // Exibindo limites máximos e mínimos via classes Wrapper
                System.out.println("--- LIMITES DOS TIPOS PRIMITIVOS EM JAVA ---");
                System.out.println("BYTE   -> Mín: " + Byte.MIN_VALUE   + " | Máx: " + Byte.MAX_VALUE);
                System.out.println("SHORT  -> Mín: " + Short.MIN_VALUE  + " | Máx: " + Short.MAX_VALUE);
                System.out.println("INT    -> Mín: " + Integer.MIN_VALUE  + " | Máx: " + Integer.MAX_VALUE);
                System.out.println("LONG   -> Mín: " + Long.MIN_VALUE   + " | Máx: " + Long.MAX_VALUE);
                System.out.println("FLOAT  -> Mín: " + Float.MIN_VALUE  + " | Máx: " + Float.MAX_VALUE);
                System.out.println("DOUBLE -> Mín: " + Double.MIN_VALUE + " | Máx: " + Double.MAX_VALUE);
                System.out.println("CHAR   -> Mín: (int)" + (int) Character.MIN_VALUE + " | Máx: (int)" + (int) Character.MAX_VALUE);
                System.out.println("BOOLEAN -> Apenas 'true' ou 'false' (Sem limite numérico)");
                System.out.println("FINAL -> Variáveis de valores não modiicaveis" + VALOR_PI);

    }
}
