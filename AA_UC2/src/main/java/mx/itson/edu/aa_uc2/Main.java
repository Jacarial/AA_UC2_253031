
package mx.itson.edu.aa_uc2;

import static mx.itson.edu.aa_uc2.Ordenamientos.bubbleSort;
import static mx.itson.edu.aa_uc2.Ordenamientos.printArray;

/**
 *
 * @author TheDa
 */
public class Main {
    /**
     * Método principal que ejecuta el algoritmo de ordenamiento burbuja.
     * 
     * @param args Argumentos de la línea de comandos 
     */
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Array de ejemplo para ordenar

            System.out.println("Array original:");
            printArray(array);

            bubbleSort(array); // Llamada al método de ordenamiento burbuja

            System.out.println("Array ordenado:");
            printArray(array);    
    }
}
