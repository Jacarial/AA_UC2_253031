
package SelectionSort;


import static SelectionSort.OrdenamientoSelect.printArray;
import static SelectionSort.OrdenamientoSelect.selectionSort;

/**
 *
 * @author TheDa
 */
public class Main {

   /**
     * Método principal que ejecuta el algoritmo de ordenamiento por selección.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11}; // Array de ejemplo para ordenar

        System.out.println("Array original:");
        printArray(array);

        selectionSort(array); // Llamada al método de ordenamiento por selección

        System.out.println("Array ordenado:");
        printArray(array);
    }
}
