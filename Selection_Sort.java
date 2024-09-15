import java.util.Arrays;  // Import statement for Arrays
public class Selection_Sort {
    // Make the method static so it can be called without an instance
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            // Swap the found minimum element with the first element
            int sort = arr[temp];
            arr[temp] = arr[i];
            arr[i] = sort;
        }
    } 

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;  // Automatically calculate the length of the array
        // Call selectionSort function
        Selection_Sort.sort(arr, n);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
