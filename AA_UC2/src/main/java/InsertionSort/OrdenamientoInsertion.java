
package InsertionSort;

/**
 *
 * @author TheDa
 */
public class OrdenamientoInsertion {
    /**
     * Implementación del algoritmo de ordenamiento por inserción.
     * 
     * @param array El array que se desea ordenar.
     */
    public static void insertionSort(int[] array) {
        int n = array.length; // 1 // Longitud del array

        // Bucle externo: recorre el array desde el segundo elemento hasta el final
        for (int i = 1; i < n; i++) { // 1 + n + n - 1
            int key = array[i]; // n - 1 // Elemento actual a insertar en su posición correcta
            int j = i - 1; // n - 1 // Índice del último elemento del subarray ordenado

            // Bucle interno: mueve los elementos mayores que key una posición adelante
            while (j >= 0 && array[j] > key) { //
                array[j + 1] = array[j]; // Desplaza el elemento hacia la derecha
                j--; // Decrementa el índice para comparar con el siguiente elemento
            }

            // Inserta key en su posición correcta
            array[j + 1] = key; // n - 1
        }
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
