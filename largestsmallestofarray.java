
import java.util.Scanner;

public class largestsmallestofarray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize largest and smallest
        int largest = array[0];
        int smallest = array[0];

        // Find largest and smallest elements
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        // Close the scanner
        scanner.close();
    }
}