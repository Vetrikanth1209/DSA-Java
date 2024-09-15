import java.util.Arrays;
public class Bubble_sort {
    static void sort (int array[])
    {
        int size = array.length ;
        int i ,j ;
        for(i =0 ; i <(size-1); i++){
            boolean swap = false ;
            for(j=0 ; j <(size -i -1); j++){
                if(array[j] > array [j + 1]){
                    int temp = array [j] ;
                    array [j] = array [ j + 1] ;
                    array [j + 1] = temp ;
                    swap = true ;
                }
            }
            if(!swap){
                break ;
            }
        }
    }
    public static void main (String args []){
         int[] data = { -2, 45, 0, 11, -9 };
         Bubble_sort.sort(data);
         System.out.println("Sorted Array in Ascending Order:");
         System.out.println(Arrays.toString(data));
    }
}
