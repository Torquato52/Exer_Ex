import classes.Aritmetica;
import classes.Conta;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setAgencia(1234);
        conta.setCodigo(5678);
        conta.setSaldo(1000);
        conta.setLimite(500);
        
        System.out.println("Saldo: " + conta.getSaldo());
        
        try {
            conta.deposita(500);
            System.out.println("Saldo: " + conta.getSaldo());
            
            conta.saca(200);
            System.out.println("Saldo: " + conta.getSaldo());
            
            conta.saca(2000);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        Aritmetica ari = new Aritmetica();

        try {
            int resultadoPar = ari.operacaoValor(4);
            System.out.println("Resultado para número par: " + resultadoPar);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            int resultadoImpar = ari.operacaoValor(3);
            System.out.println("Resultado para número ímpar: " + resultadoImpar);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            int resultadoNegativo = ari.operacaoValor(-5);
            System.out.println("Resultado para número negativo: " + resultadoNegativo);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
