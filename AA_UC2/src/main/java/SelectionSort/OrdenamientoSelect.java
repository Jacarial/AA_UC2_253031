
package SelectionSort;

/**
 *
 * @author TheDa
 */
public class OrdenamientoSelect {
    
    /**
     * Implementación del algoritmo de ordenamiento por selección.
     * 
     * @param array El array que se desea ordenar.
     */
    public static void selectionSort(int[] array) {
        int n = array.length; //1 // Longitud del array

        // Bucle externo: recorre el array para encontrar el mínimo en cada iteración
        for (int i = 0; i < n - 1; i++) { // 1 + n + n - 1
            // Suponemos que el primer elemento no ordenado es el mínimo
            int minIndex = i; // n - 1

            // Bucle interno: busca el elemento mínimo en el subarray no ordenado
            for (int j = i + 1; j < n; j++) { // n - 1 + n - 1
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Actualiza el índice del mínimo
                }
            }

            // Intercambia el elemento mínimo con el primer elemento no ordenado
            if (minIndex != i) { // n - 1
                int temp = array[i];  // n - 1
                array[i] = array[minIndex];  // n - 1
                array[minIndex] = temp; // n - 1
            }
        } // 8n + 10    0(n)
    }

    /**
     * Método auxiliar para imprimir el contenido de un array.
     * 
     * @param array El array que se desea imprimir.
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
