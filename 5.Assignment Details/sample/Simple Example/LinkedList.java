

class LinkedList{
        private Flight head;
        
	    public  LinkedList(){head=null;}

		public  void insert(String s1,int h,int m)
	        {      Flight temp =new Flight(s1,h,m);
			       temp.next=head;
			       head=temp;}
       
		public  Flight readFlight(int el)
        {      if (head==null|| this.count()<el)
        	                 return null;
			   Flight temp=head;
               int current=1;
               while(current!=el) {
                       current++;
                       temp=temp.next;}
               return temp; } 


		public  int count()
	        {      Flight temp=head;
                   int res=0;
	               while(temp!=null) {
                          res++;
	                      temp=temp.next;}
	               
	               return res; }


		public String delete_first()
	       {         if (head==null)return null;
		             String res=head.readDestination();
		             head = head.next;
		             return res;
                  }
		public void delete_all()
	       {         head=null;
               }


	     public void printlist()
	                        {
		               Flight temp=head;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			           while(temp!=null) {
			               temp.print();
			               temp=temp.next;}
			               
			            System.out.print("NULL");   
			               
			            }
   }


   