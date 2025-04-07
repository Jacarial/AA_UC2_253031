
package QuickSort;

import static QuickSort.OrdenamientoQuick.printArray;
import static QuickSort.OrdenamientoQuick.quickSort;

/**
 * Implementación del algoritmo Quicksort en Java.
 * Quicksort es un algoritmo de ordenamiento eficiente que utiliza divide y vencerás.
 * Complejidad promedio: O(n log n), Peor caso: O(n²).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5}; // Array de ejemplo
        System.out.println("Array original:");
        printArray(array);

        quickSort(array, 0, array.length - 1); // Llamada al método Quicksort

        System.out.println("Array ordenado:");
        printArray(array);
    }
}
