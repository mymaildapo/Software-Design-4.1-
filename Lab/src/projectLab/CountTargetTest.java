package projectLab;


//to be finish


//RECURSVIE
public class CountTargetTest {

    public static int countTarget(int value,int target)
    {
    	
    	if (value < 10) 
    	{

    		if (value == target)
    		{
    			return 1;
    		}
    		else
    		{
    			return 0;
    		}
    		
    	}
    	
    	else
    	{
    		int rest;
    		rest = value  / 10; // value from the methor countTarget
    		int last = value % 10;

    	}
    	
    	
    	
    	

    	
    	
    	
    	
    	
    	
    	
    	return 0;
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ countTarget(number,target));
    }
}

