
package mx.itson.edu.aa_uc2;

/**
 *
 * @author TheDa
 */
public class Ordenamientos {
    /**
     * Implementación del algoritmo de ordenamiento burbuja.
     * 
     * @param array El array que se desea ordenar.
     */
    
    public static void bubbleSort(int[] array) {
        int n = array.length; // 1
        boolean swapped; // 1 // Bandera para optimización 

        // Bucle externo: controla el número de pasadas
        for (int i = 0; i < n - 1; i++) { // 1 + n + n - 1
            swapped = false; // n - 1 // Inicialmente, no se ha realizado ningún intercambio en esta pasada

            // Bucle interno: realiza las comparaciones e intercambios
            for (int j = 0; j < n - 1 - i; j++) { // 1 + n + 1 + 1
                if (array[j] > array[j + 1]) { // n - 1
                    // Intercambia los elementos si están en el orden incorrecto
                    int temp = array[j]; // n - 1
                    array[j] = array[j + 1]; // n - 1
                    array[j + 1] = temp; // n - 1
                    swapped = true; // n - 1 // Marca que se ha realizado un intercambio
                }
            }

            // Si no se ha realizado ningún intercambio en la pasada, el array ya está ordenado
            if (!swapped) { // n - 1
                break; // 1
            }
        }  // 14 + 10n
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
