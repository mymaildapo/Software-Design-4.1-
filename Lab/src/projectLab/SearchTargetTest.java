package projectLab;

public class SearchTargetTest {

    public static boolean searchTarget(int value,int target)// this can also return String searchTarge
    
    {
    	if (value < 10)
    	{
			if (value == target)
			{
				return true;
			}
			else 
			{
				
				return false;
			}
	    	
    	}
    	else
    	{
    		int rest = value /10;
    		int last = value % 10;
    		if (last == target)
    		{
    			
    			return true;
    		}
    		else 
    		{
    			return searchTarget(rest,target);
    		}
    		
    	}
    	
    	
    	//return false;
    }
    public static void main(String[] args) {
	  int number=Console.readInt("Enter Value:");
          int target=Console.readInt("Enter Target:");
      System.out.println("Res= "+ searchTarget(number,target));
    }
}

