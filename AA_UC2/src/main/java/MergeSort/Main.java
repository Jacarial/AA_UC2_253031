
package MergeSort;

import static MergeSort.OrdenamientoMerge.mergeSort;
import static MergeSort.OrdenamientoMerge.printArray;

/**
 *
 * @author TheDa
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7}; // Array de ejemplo
        System.out.println("Array original:");
        printArray(array);

        mergeSort(array, 0, array.length - 1); // Llamada al método Merge Sort

        System.out.println("Array ordenado:");
        printArray(array);
    }

    
}
