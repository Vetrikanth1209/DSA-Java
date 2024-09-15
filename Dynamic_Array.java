import java.util.Iterator;

public class Dynamic_Array <T> implements Iterable<T>{//Generic logic to accept any kind of data for array from the user <T> Iteratable<T> used to traves the generic data type because it is not predefined data type
    private static int initialCapacity = 16 ; // why static ? Because it is not changing in any time
    private int size ;
    private int capacity ;
    private T arr [] ;

    @SuppressWarnings("unchecked")
    Dynamic_Array(){
        size = 0 ;
        arr = (T[]) new Object [initialCapacity] ;
        capacity = initialCapacity ;
    }
    private void AddCapacity() {
        capacity = capacity * 2;
        arr = java.util.Arrays.copyOf(arr, capacity) ;
    }

    public void Add (T val) {
        if(size == capacity){
            AddCapacity();
        }
        arr[size] = val ;
        size++ ;
    }

    public void Delete (int pos){
        for(int i = pos +1 ; i <size ;i++){
            arr[i-1] = arr [i];
            size--;
        }
    }

    public void Update (T val , int pos){
        if(size == capacity){
            AddCapacity();
        }
        
        arr[pos] = val ;
        }


    public void display() {
		System.out.println("\nElements in the list: ");
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
	}
   
    public Iterator<T> iterator(){
		return new Iterator<T>(){
			
			int index = 0;
			
			public T next() {
				return arr[index++];
			}
			
			public boolean hasNext() {
				return index < size;
			}
		};
    }
    
    public static void main(String[] args) {
        Dynamic_Array <Integer> list = new Dynamic_Array<Integer>() ;
        list.Add(1); 
        list.Add(5); 
        list.Add(7); 
        list.Add(9);
        
        list.display();

        list.Delete(2);

        list.display();

        list.Update(10, 2);

        list.display();
    }
}

