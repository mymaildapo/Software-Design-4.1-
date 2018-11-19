



class Flight extends Journey{
	
	private Time departure_time;
	public Flight next;
	public Flight(String dest,int h, int m){
		super(dest);
		departure_time=new Time(h,m);}

	
	public String readTime(){return departure_time.toString();}
	
	public void resetFlight(int h,int m){
		departure_time.reset(h,m);
	}
	public void print(){
		System.out.print("["+super.readDestination()+ " : "+ departure_time+"]->");
	}
}