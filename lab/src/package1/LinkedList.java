package package1;

class LinkedList{
        private Node head;
        
	    public  LinkedList(){head=null;}

		public  void insert(String s1,int a)
	        {      Node temp =new Node(s1,a);
			       temp.next=head;
			       head=temp;
			}


		public  void insert_last(String s1,int a)
	        {      
					Node t2 = head;
					while(t2.next!=null)
					{
						t2 =t2.next;
					}					
					
						
						Node temp = new Node (s1,a);
						t2.next= temp;
						temp.next =null;
					
			
	        }


		public  boolean search(String s1)
	        {     
				Node temp =head;
				while(temp!=null)
				{
					// if equals(s2)
					
					if(s1.equals(temp.readname()))
					{
						
						return true;
						
					}
					
				temp=temp.next;				
				}
				return false;
	        
	        }



		public  int count(String s1)
	        {     return 0; 
	        
	        
	        }


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


   