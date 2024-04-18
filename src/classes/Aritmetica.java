package classes;
public class Aritmetica {
    public int operacaoValor(int numero) {
        if (numero < 0) {
            throw new ArithmeticException("O parâmetro não pode ser negativo");
        }

        return numero % 2 == 0 ? numero * numero : numero * numero * numero;
    }
}
