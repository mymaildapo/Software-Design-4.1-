package package2;

class PairDice {
	
	private Die d1,d2;
	
	public PairDice (int v1,int v2)
	{
		Die d1= new Die(v1);
		Die d2= new Die(v2);	
	}
	
	
	public void rollDice()
	{
		d1.roll();
		d2.roll();	
	}
	
	public int getSumDicesValue()
	{
		return d1.getValue() + d2.getValue();	
		
	}
	
	public boolean valueEquasl()
	{
		if (d1.getValue() == d1.getValue())
			return true;
		else
			return false;
	}
	
	
	// to be finish ..add testdice and my frame

}
