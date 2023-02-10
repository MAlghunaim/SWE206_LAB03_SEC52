import java.util.Random;
public class Sorter {

    public static void main(String[] args) {
        System.out.println("Everything is fine.\n Initializing an array of 10 random integers to be sorted.");
        int[] integers = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            integers[i] = r.nextInt(20);
        }
        System.out.println("The unsorted array is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(integers[i] + " ");
        }
        System.out.println("\nSorted array:");
        sort(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }

    }
    public static void sort(int array[]){
        selectionSort(array);
    }
    // Method that returns the given array sorted in ascending order.
    public static void selectionSort(int[] arr) {
        int indexOfMin;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[indexOfMin];
            arr[indexOfMin] = temp;
        }
        
    }
    
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}