/**
 * A utility class that provides static methods for common array operations.
 * This class contains methods for printing arrays and shifting array elements
 * left or right from a specified index position.
 * 
 * @author Chandra Prakash Tekwani
 * @version 1.0
 */
public class arrayFunctions {
    
    /**
     * Prints all elements of an integer array to the console.
     * Elements are separated by spaces and followed by a newline.
     * 
     * @param arr the integer array to be printed
     * @throws NullPointerException if the array is null
     * 
     * @example
     * int[] numbers = {1, 2, 3, 4, 5};
     * printArray(numbers); // Output: 1 2 3 4 5
     */
    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // print a new line after printing the array
    }

    /**
     * Shifts all elements in the array to the left starting from the specified index.
     * Elements from the given index position are moved one position to the left,
     * effectively removing the element at the specified index. The last element
     * in the array is set to 0.
     * 
     * @param arr the integer array to be modified
     * @param indexValue the starting index from which to shift elements left
     * @throws ArrayIndexOutOfBoundsException if indexValue is negative or >= arr.length
     * @throws NullPointerException if the array is null
     * 
     * @example
     * int[] numbers = {1, 2, 3, 4, 5};
     * shiftLeft(numbers, 2); // Result: {1, 2, 4, 5, 0}
     */
    public static void shiftLeft(int arr[], int indexValue) {
        for (int i = indexValue; i < arr.length -1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0; // set last element to 0
    }

    /**
     * Shifts all elements in the array to the right starting from the specified index.
     * Elements from the given index position onwards are moved one position to the right,
     * creating space at the specified index position. The element at the specified
     * index is set to 0.
     * 
     * @param arr the integer array to be modified
     * @param indexValue the index position where the shift should begin
     * @throws ArrayIndexOutOfBoundsException if indexValue is negative or >= arr.length
     * @throws NullPointerException if the array is null
     * 
     * @example
     * int[] numbers = {1, 2, 3, 4, 5};
     * shiftRight(numbers, 2); // Result: {1, 2, 0, 3, 4}
     */
    public static void shiftRight(int[] arr, int indexValue) {
        for (int i = arr.length - 1;  i > indexValue; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexValue] = 0; // set the element at indexValue to 0
    }

}


