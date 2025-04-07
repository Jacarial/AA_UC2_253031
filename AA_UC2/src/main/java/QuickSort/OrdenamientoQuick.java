
package QuickSort;

/**
 *
 * @author TheDa
 */
public class OrdenamientoQuick {
    
    /**
     * Método principal que implementa Quicksort.
     * 
     * @param array Array a ordenar.
     * @param low   Índice inicial del subarray.
     * @param high  Índice final del subarray.
     */
    
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Obtiene el índice del pivote después de la partición
            int pivotIndex = partition(array, low, high);

            // Ordena recursivamente los subarrays antes y después del pivote
            quickSort(array, low, pivotIndex - 1); // Subarray izquierdo
            quickSort(array, pivotIndex + 1, high); // Subarray derecho
        }
    }
    /**
     * Método de partición: selecciona un pivote y coloca los elementos menores a la izquierda
     * y los mayores a la derecha.
     * 
     * @param array Array a particionar.
     * @param low   Índice inicial.
     * @param high  Índice final.
     * @return      Índice del pivote.
     */
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Elegimos el último elemento como pivote
        int i = low - 1; // Índice del menor elemento

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j); // Intercambia elementos
            }
        }

        // Coloca el pivote en su posición correcta
        swap(array, i + 1, high);
        return i + 1; // Retorna el índice del pivote
    }

    /**
     * Método auxiliar para intercambiar dos elementos en un array.
     * 
     * @param array Array donde se realiza el intercambio.
     * @param i     Primer índice.
     * @param j     Segundo índice.
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Método auxiliar para imprimir un array.
     * 
     * @param array Array a imprimir.
     */
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
