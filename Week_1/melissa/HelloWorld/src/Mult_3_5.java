
import java.util.ArrayList;


public class Mult_3_5{

	public static void main(String[] args){		
		ArrayList<Integer> numbers_to_sum = new ArrayList<Integer>();
                for(int i=0; i<1000; i++) {                   	//number to do math on	

                    if( i % 3 == 0 || i % 5 == 0){
                    
                        numbers_to_sum.add(i);
                    } 
                }
                int start = 0;    
                
                for (Integer iNum : numbers_to_sum){            // adding numbers in list together
                     start = start + iNum;
                }
                
                System.out.println(start);
        }
}
