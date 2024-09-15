/*
  ************************OUTPUT*********************************
  element  found 0
 */

 /*
  ************************WORKING*********************************
  STEP 1:Declare a array
  STEP 2:Define the target value to identified
  STEP 3:Define a integer function which accpets two parameters(array and target value)
  STEP 4:Initialize a loop and start the i from 0
  STEP 5:Set the condition for i as array length to traverse the whole array elements
  STEP 6:Create a if statement and give condition as value of traversing array using the loop shuld be equal to target value
  STEP 7:If it is true return the index value of the target value
  STEP 8:If the condition becomes false return -1
  */

public class linear_search{
    public static int linearsearch(int [] array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i] == target)
            return i;
        }
        return -1;
    }

    public static void main(String args[]){
        int [] array = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        int result = linearsearch(array,target);
        if (result == -1){
            System.out.println("element not found at ");
        }
        else{
            System.out.println("element  found " +result);
        }
    }
}