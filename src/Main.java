public class Main {

    //generador de arreglos con numeros aleatorios del 0 al 100
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // Funcion que ordena un arreglo de menor a mayor usando el algoritmo burbuja
    void bubbleSort(int[] arr) {
        // Obtiene la longitud del arreglo
        int n = arr.length;
        // Itera sobre el arreglo hasta que no haya más intercambios
        for (int i = 0; i < n - 1; i++) {
            // Bandera para indicar si hubo intercambios en esta iteración
            boolean swapped = false;
            // Itera sobre el arreglo, comparando elementos adyacentes e intercambiándolos si están en el orden incorrecto
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambios en esta iteración, el arreglo ya está ordenado y podemos detener el algoritmo
            if (!swapped) break;
        }
    }

    // Función que ordena un arreglo de menor a mayor usando el algoritmo de selección
    void selectionSort(int[] arr) {
        // Obtiene la longitud del arreglo
        int n = arr.length;
        // Itera sobre el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Encuentra el índice del elemento más pequeño en el subarreglo sin ordenar
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) minIndex = j;
            }
            // Intercambia el elemento más pequeño con el primer elemento del subarreglo sin ordenar
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Función que ordena un arreglo de menor a mayor usando el algoritmo de inserción
    void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; //key es el elemento a ser comparado
            int j = i - 1; //j es el índice del elemento anterior
            while (j >= 0 && arr[j] > key) {
                //move elementos de arr[0..i-1] que son mayores que key
                //a una posición delante de su posición actual
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    void printArray(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("\n\nOrdenamiento Burbuja");
        int[] arr = generateRandomArray(25);
        System.out.println("Array Original: ");
        main.printArray(arr);

        System.out.println("\nArray Ordenado: ");
        main.bubbleSort(arr);
        main.printArray(arr);

        System.out.println("\n\nOrdenamiento por seleccion");
        int[] arr2 = generateRandomArray(25);
        System.out.println("Array Original: ");
        main.printArray(arr2);


        System.out.println("\nArray Ordenado: ");
        main.selectionSort(arr2);
        main.printArray(arr2);

        System.out.println("\n\nOrdenamiento por insercion");
        int[] arr3 = generateRandomArray(25);
        System.out.println("Array Original: ");
        main.printArray(arr3);

        System.out.println("\nArray Ordenado: ");
        main.insertionSort(arr3);
        main.printArray(arr3);

    }

}