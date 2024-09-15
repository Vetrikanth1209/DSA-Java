public class binary_search {
    public static int binarysearch (int[] array , int target){
        int first = 0;
        int last = array.length -1 ;
        while(first<=last){
            int mid = (first+last) / 2; 
            if (array[mid] == target) {
                System.out.println("if block");
                return mid;
            }
            else if (array[mid]< target){
                System.out.println("if else block");
                first = mid +1;
            }
            else{
                System.out.println("else block");
                last = mid-1 ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int result = binarysearch(array,target);
        if (result == -1){
            System.out.println("element not found  ");
        }
        else{
            System.out.println("element  found at : " +result);
        }
    }
}
