

// Handles Exception in main class i.e. try/catch

public class StepperTest {
    static int value1=2;
    
	static boolean decrement(){
		if (value1==0) return false;
		else          { value1--;
		                return true;}
		}
	
	static boolean decrementAndPrint(){
		boolean res = decrement();
		if (res==true)System.out.println("Value="+value1);
		return res;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			boolean result = decrementAndPrint();
			if (result==false)
                       {System.out.println("Value already Zero");}
		}
	}
}

