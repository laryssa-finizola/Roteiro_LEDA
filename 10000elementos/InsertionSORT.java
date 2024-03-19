import java.util.Random;

public class InsertionSORT {
    public static void main(String[] args) {
        // Constrói o array com 10000 numeros
        int[] vetor = new int[10000];
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            vetor[i] = random.nextInt(10000); // Gera um número aleatório entre 0 e 9999
        }

        // Inicia a contagem de tempo
        long startTime = System.currentTimeMillis();

        int[] resultados = insertionSort(vetor);

        // Finaliza a contagem de tempo
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Imprime os resultados
        System.out.println("Trocas de posicao: " + resultados[0]);
        System.out.println("Comparacoes realizadas: " + resultados[1]);
        System.out.println("Tempo de execucao (ms): " + executionTime);
    }

    public static int[] insertionSort(int[] arr) {
        int trocas = 0;
        int comparacoes = 0;
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i -= 1;
                trocas++;
                comparacoes++;
            }
            arr[i + 1] = key;
            comparacoes++;
        }
        return new int[] { trocas, comparacoes };
    }
}
