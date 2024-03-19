
import java.io.IOException;
import java.util.Random;

public class SelectionSort {
    public static void main(String args[]) throws IOException {
        // Constrói o array com os números de 0 a 999 de forma aleatória
        int[] vetor = new int[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(1000);
        }

        // Inicia a contagem de tempo
        long startTime = System.currentTimeMillis();

        int[] results = selectionSort(vetor);

        // Finaliza a contagem de tempo
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Imprime os resultados
        System.out.println("Trocas de posicao: " + results[0]);
        System.out.println("Comparacoes realizadas: " + results[1]);
        System.out.println("Tempo de execucao (ms): " + executionTime);
    }

    public static int[] selectionSort(int[] array) {
        int[] results = new int[2]; // Armazena o número de trocas e comparações
        results[0] = 0; // Trocas
        results[1] = 0; // Comparações

        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                results[1]++; // Incrementa o número de comparações
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
                results[0]++; // Incrementa o número de trocas
            }
        }

        return results;
    }
}
