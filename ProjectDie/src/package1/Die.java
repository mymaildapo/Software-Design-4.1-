package package2;

public class Die {
	private int vlaue;
	
	public Die(int v1 )
	{
		int value =v1;
		
	}
	public void roll() {
		
		
		double  res = Math.random();
		vlaue = 1 + (int) (res * 1000) % 6;
	}
	public int getValue() {
		// TODO Auto-generated method stub
		return vlaue;
	}

}