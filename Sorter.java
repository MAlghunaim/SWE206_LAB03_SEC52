import java.util.random.RandomGenerator;
import java.util.Random;
public class Sorter {

    public static void main(String[] args) {
        System.out.println("Everything is fine.\n Initializing an array of 10 random integers to be sorted.");
        int[] integers = new int[10];
        Random r = new Random();
        for(int i = 0; i < 9; i++) {
            integers[i] = r.nextInt(20);
        }
        System.out.println("The unsorted array is: ");
        for(int i = 0; i < 9; i++) {
            System.out.print(integers[i]+" ");
            
        }

    }

}