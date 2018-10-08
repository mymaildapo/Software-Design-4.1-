package projectLab;

public class MaxTest {

    public static int max(int value)
    {
    	

		if(value  < 10) //e.g 9 that  mean it only one number so cant be % of 10
		{	
			return value;	
		}// if should be easy, else should have deatil on what to do because if got ( argument )
		else
		{
			int rest = value /10;
			int last = value %10;
			if(last> max(rest))
			{
				
				return last;
			}
			else
			{
				return max(rest);
			}
			
		}
		
		//return 0; //return at the end of code
    }
    public static void main(String[] args) 
    {
	  int number=Console.readInt("Enter Value:");
          System.out.println("Res= "+ max(number));
          
    }
}

