//package ch1;

public class Counter {
	private int value;
    
	public Counter(){value=0;}
	public Counter(int v){value=v;}
	public void increment(){
		this.value++;
	}
	public void decrement(){
		this.value--;
	}
	public int read_value(){
		return this.value;
	}
}
