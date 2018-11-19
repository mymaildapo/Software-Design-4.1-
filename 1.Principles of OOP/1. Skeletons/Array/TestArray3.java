class Polls{
		private int[] values;
		public Polls(int [] arr){
				values=arr;}

		public int sum(){               // to be completed
                         return 0.0;}
		public int highest_figure(){   // to be completed
			             return 0;}
		public boolean greater_than_50(){   // to be completed
			                // are all elements in array greater than 50
            return true;}
	    
		}




public class TestArray3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]poll={36,56,59,47,43};
		Polls p=new Polls(poll);
		System.out.println("Sum: "+ p.sum());
		System.out.println("Highest Figure: "+ p.highest_figure());
		System.out.println("all Greater Than 50%: "+ p.greater_than_50());
	}

}
