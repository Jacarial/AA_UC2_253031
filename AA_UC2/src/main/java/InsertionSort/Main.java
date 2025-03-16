
package InsertionSort;

import static InsertionSort.OrdenamientoInsertion.insertionSort;
import static InsertionSort.OrdenamientoInsertion.printArray;

/**
 *
 * @author TheDa
 */
public class Main {

    /**
     * Método principal que ejecuta el algoritmo de ordenamiento por inserción.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6}; // Array de ejemplo para ordenar

        System.out.println("Array original:");
        printArray(array);

        insertionSort(array); // Llamada al método de ordenamiento por inserción

        System.out.println("Array ordenado:");
        printArray(array);
    }
    
}
