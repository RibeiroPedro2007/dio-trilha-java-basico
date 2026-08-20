package javaDoc;

/**
 * A classe Calculadora fornece operações matemáticas básicas para cálculos acadêmicos e comerciais.
 * <p>
 * Esta classe foi desenvolvida para demonstrar boas práticas de documentação
 * de código e tratamento de exceções em Java.
 * </p>
 *
 * @author RibeiroPedro
 * @version 1.0
 * @since 2026-08-20
 */
public class Calculadora {

    /**
     * Construtor padrão da classe Calculadora.
     */
    public Calculadora() {
        // Construtor explícito para fins de documentação Javadoc
    }

    /**
     * Realiza a soma de dois números reais.
     *
     * @param numero1 O primeiro termo da soma.
     * @param numero2 O segundo termo da soma.
     * @return O resultado da soma entre numero1 e numero2.
     */
    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /**
     * Realiza a subtração de dois números reais.
     *
     * @param numero1 O valor do minuendo.
     * @param numero2 O valor do subtraendo.
     * @return O resultado da subtração (diferença).
     */
    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    /**
     * Realiza a multiplicação de dois números reais.
     *
     * @param numero1 O primeiro fator.
     * @param numero2 O segundo fator.
     * @return O produto da multiplicação.
     */
    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    /**
     * Realiza a divisão entre dois números reais.
     * <p>
     * Este método inclui uma validação de segurança para impedir a divisão por zero,
     * o que resultaria em uma indeterminação matemática.
     * </p>
     *
     * @param dividendo O número que será dividido.
     * @param divisor O número pelo qual o dividendo será dividido.
     * @return O quociente da divisão.
     * @throws IllegalArgumentException Se o divisor informado for igual a zero.
     */
    public double dividir(double dividendo, double divisor) throws IllegalArgumentException {
        if (divisor == 0) {
            throw new IllegalArgumentException("Erro: Não é possível dividir por zero.");
        }
        return dividendo / divisor;
    }
}
