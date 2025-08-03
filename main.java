/**
 * Main class that demonstrates the usage of arrayFunctions utility methods.
 * This program shows how to use array shifting operations to insert elements
 * at specific positions in an array.
 * 
 * The program creates an array, populates it with initial values, and then
 * demonstrates inserting a new value at a specific index using the shiftRight
 * method from the arrayFunctions class.
 * 
 * @author Chandra Prakash Tekwani
 * @version 1.0
 */
class Main{
    
    /**
     * The main method that serves as the entry point for the program.
     * This method demonstrates array manipulation operations including:
     * 1. Creating and initializing an integer array
     * 2. Displaying the original array contents
     * 3. Using shiftRight to make space for a new element
     * 4. Inserting a new value at the specified position
     * 5. Displaying the modified array
     * 
     * Expected output:
     * Array before insertion: 1 2 3 4 5 0
     * Array after inserting 6 at index 4: 1 2 3 4 6 5
     * 
     * @param args command line arguments (not used in this program)
     */
    public static void main(String[] args){
       // Create an array of size 6 to hold 5 initial values plus one insertion
       int arr[] = new int[6];
       
       // Initialize the first 5 elements of the array
       arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
       
       // Display the array before any modifications
       System.out.println("Array before insertion:");
       arrayFunctions.printArray(arr);

       // Define the index where we want to insert the new value
       int indexValue = 4;
       
       // Shift elements to the right from index 4 onwards to make space
       arrayFunctions.shiftRight(arr, indexValue);
       
       // Insert the new value (6) at the specified index
       arr[indexValue] = 6; // inserting 6 at index 4
       
       // Display the array after insertion
       System.out.println("Array after inserting 6 at index " + indexValue + ":");
       arrayFunctions.printArray(arr);
    }
}
