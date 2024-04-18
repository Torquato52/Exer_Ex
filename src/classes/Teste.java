package classes;
public class Teste {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do vetor");
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() throws ArrayIndexOutOfBoundsException {
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    public static void metodo2() throws ArrayIndexOutOfBoundsException {
        System.out.println("Inicio do método 2");
        int[] vetor = new int[10];
        for (int i = 0; i <= 15; i++) {
            try {
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    int vlr = vetor[i] / vetor[0];
                    System.out.println(vlr);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Índice fora dos limites do vetor");
            }
        }
        System.out.println("Fim do método 2");
    }
}
