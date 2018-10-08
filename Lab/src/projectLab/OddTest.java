package projectLab;
public class OddTest {

	//RECURSVIE
    public static int countOdd(int value)
    {
    	
    	if (value <10) //check first 1st number if <10
    	{
    		if (value %2 == 1) //if it odd 
	    	{
	    		return 1 ;
	    	}	
    		
    	}
    	
    	
	    else
	    {
	    
	    	int rest = value / 10; //initalize it, put = bla bla
    		int last = value %10;
	    	
	    	if (last %2 ==1)
	    	{
	    		return 1 + countOdd(rest);
	    		
	    	}
	    	else
		
	    	return 0 + countOdd(rest); //if it is not odd
	    }
    	
	    	
	 
	    return 0; // for otter else
    }
    
    public static void main(String[] args)
    {
	  int number=Console.readInt("Enter Value:");
      System.out.println("Res= "+ countOdd(number));
    }
}

