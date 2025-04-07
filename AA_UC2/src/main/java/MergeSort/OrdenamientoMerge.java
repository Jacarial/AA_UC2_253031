
package MergeSort;

/**
 *
 * @author TheDa
 */
public class OrdenamientoMerge {
    /**
     * Método principal que implementa Merge Sort.
     * 
     * @param array Array a ordenar.
     * @param left  Índice inicial del subarray.
     * @param right Índice final del subarray.
     */
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) { // 1 comparación
            int middle = (left + right) / 2; // 1 división 

            // Divide recursivamente
            mergeSort(array, left, middle);      // T(n/2)
            mergeSort(array, middle + 1, right); // T(n/2)

            // Combina las mitades ordenadas
            merge(array, left, middle, right);   // O(n)
        }
    }

    /**
     * Método para mezclar dos subarrays ordenados.
     * 
     * @param array  Array original.
     * @param left   Índice inicial.
     * @param middle Índice medio.
     * @param right  Índice final.
     */
    public static void merge(int[] array, int left, int middle, int right) {
        // Tamaños de los subarrays temporales
        int n1 = middle - left + 1; // 1 resta y 1 suma
        int n2 = right - middle;    // 1 resta

        // Arrays temporales
        int[] leftArray = new int[n1]; // 1 creación + n1 asignaciones
        int[] rightArray = new int[n2]; // 1 creación + n2 asignaciones

        // Copia datos a los arrays temporales
        for (int i = 0; i < n1; i++) { // n1 iteraciones
            leftArray[i] = array[left + i]; // n1 asignaciones
        }
        for (int j = 0; j < n2; j++) { // n2 iteraciones
            rightArray[j] = array[middle + 1 + j]; // n2 asignaciones
        }

        // Índices para mezclar
        int i = 0, j = 0, k = left; // 3 asignaciones

        // Mezcla los subarrays
        while (i < n1 && j < n2) { // Máximo n1 + n2 comparaciones
            if (leftArray[i] <= rightArray[j]) { // 1 comparación
                array[k] = leftArray[i]; // 1 asignación
                i++;
            } else {
                array[k] = rightArray[j]; // 1 asignación
                j++;
            }
            k++;
        }

        // Copia los elementos restantes de leftArray (si los hay)
        while (i < n1) { // Máximo n1 iteraciones
            array[k] = leftArray[i]; // 1 asignación
            i++;
            k++;
        }

        // Copia los elementos restantes de rightArray (si los hay)
        while (j < n2) { // Máximo n2 iteraciones
            array[k] = rightArray[j]; // 1 asignación
            j++;
            k++;
        }
    }

    /**
     * Método auxiliar para imprimir un array.
     * 
     * @param array Array a imprimir.
     * Operaciones: O(n) prints.
     */
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
