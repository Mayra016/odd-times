import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println(findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
	}
	
 	public static int findIt(int[] a) {
 	    int[] odd;
 	    List<Integer> numbers = new ArrayList<>();
 	    for ( int number : a) {
 	        
 	        long times = Arrays.stream(a)
 	            .filter(n -> n == number)
 	            .count();
 	            
 	        if (times %2 != 0) {
 	            numbers.add(number);
 	        }
 	    }
 	    
 	    odd = numbers.stream().mapToInt(Integer::intValue).toArray();
 	    
  	    return odd.length <= 0 ? 0 : odd[0];
    }
}     
