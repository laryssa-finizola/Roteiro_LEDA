import java.util.Random;

public class BubbleSORT {
    public static void main(String[] args) {
        // Constrói o array com os números de 0 a 9999 de forma aleatória
        int[] vetor = new int[10000];
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            vetor[i] = random.nextInt(10000); // Gera um número aleatório entre 0 e 9999
        }

        long startTime = System.currentTimeMillis();
        int[] resultados = bubbleSort(vetor);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Trocas de posicao: " + resultados[0]);
        System.out.println("Comparacoes realizadas: " + resultados[1]);
        System.out.println("Tempo de execucao (ms): " + executionTime);
    }

    private static int[] bubbleSort(int vetor[]) {
        int trocas = 0;
        int comparacoes = 0;
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                comparacoes++;
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    trocas++;
                    troca = true;
                }
            }
        }
        return new int[] { trocas, comparacoes };
    }

    private static String arrayToString(int[] vetor) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < vetor.length; i++) {
            sb.append(vetor[i]);
            if (i < vetor.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
