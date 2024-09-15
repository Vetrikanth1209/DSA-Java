import java.util.Arrays;

public class Insertion_sort {
    public static void sort(int[] arr) { // Make the method static
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for(int j = i+1; j>0 ; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9};
        Insertion_sort.sort(data); // No error now, since sort() is static
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
