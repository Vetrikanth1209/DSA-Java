import java.util.Arrays;
public class Merge_sort {

    public static void mergesort(int[] arr, int left, int right) {
        if (right-left == 1) 
            return ;
            int mid = (left + right) / 2;  
            mergesort(arr, left, mid);
            mergesort(arr, mid, right);
            merge(arr, left, mid, right); 
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int [] joined = new int[right-left] ;
        int  i = left ;
        int j = mid;
        int k = 0;

        while(i<mid && j<right){
            if(arr[i]<arr[j]){ 
                joined[k] = arr[i] ;
                k++;
                i++;
            }else{
                joined[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<mid){
            joined[k] = arr[i];
            k++;
            i++;
        }
        while(j<right){
            joined[k] = arr[j];
            k++;
            j++;
        }

        for(k=0;k<joined.length;k++){
            arr[left+k] = joined[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,10,-9,3};
        Merge_sort.mergesort(arr, 0,arr.length);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(arr));
    }
}
