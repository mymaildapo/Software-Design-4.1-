class Name
    {
        :
    }
public class NameTest {

	public static void main(String[] args) {
        	Name[] list=new Name[4];
        	list[0]= new Name("Athy");
        	list[1]= new UnderLine("Bally");
        	list[2]= new UpperCase("Cork");
        	list[3]= new UnderLine("Derry");
        
		for(int i=0;i<list.length;i++){
			list[i].print();
			System.out.println();
		}  
	}
}
