
package projectLab;

//RECURSVIE
public class AddEvenTest {

	int num ;
    public static int addEven(int value){
    	
    	if (value <10)
    	{
    		
    		if (value %2 ==0)
    		{
    			
    			return value;
    		}
    		else return 0;
    		
    		
    	}
    	else
    	{
    		int rest = value / 10;
    		int last = value %10;
    		if (last%2==0)
    		{
    			return last + addEven(rest);
    			
    		}
    		else
    				
    		return 0 + addEven(rest);
    	}
    	
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ addEven(number));
    }
    
    
    
    
}

