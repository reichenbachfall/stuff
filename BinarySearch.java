import java.util.Scanner;


public class BinarySearch{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input array length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i=0; i< array.length; i++){

            System.out.println("Input sorted array entry: ");
            int entry = scanner.nextInt();
            array[i] = entry;

        } 

        System.out.println(array.toString());

        System.out.println("Enter the element to search: ");

        int target = scanner.nextInt();
        
        int index = binarySearch(target, array);        
        
        System.out.println("The target index is: " + index);

        scanner.close();
    }

    public static int binarySearch(int target, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2; // Update middle based on current left and right

            if (array[middle] == target) {
                return middle;
            } else if (array[middle] > target) {
                right = middle - 1; // Search the left half
            } else {
                left = middle + 1; // Search the right half
            }
        }

        return -1; // Target not found
    }
}
