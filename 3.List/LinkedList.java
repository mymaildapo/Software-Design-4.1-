

class LinkedList{
        private Node head;
        
	    public  LinkedList(){head=null;}

		public  void insert(String s1,int a)
	        {      Node temp =new Node(s1,a);
			       temp.next=head;
			       head=temp;}


		public  void insert_last(String s1,int a)
	        {      }


		public  boolean search(String s1)
	        {     return true; }



		public  int count(String s1)
	        {     return 0; }


		public String delete_first()
	       {         if (head==null)return null;
		             String res=head.readname();
		             head = head.next;
		             return res;
                  }



	     public void printlist()
	                        {
		               Node temp=head;
		               System.out.println("\nList:");
		               System.out.print("HEAD->");
			           while(temp!=null) {
			               temp.print();
			               temp=temp.next;}
			               
			            System.out.print("NULL");   
			               
			            }
   }


   