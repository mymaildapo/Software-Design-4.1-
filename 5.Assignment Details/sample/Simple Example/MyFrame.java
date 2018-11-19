
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Flight  Application  ");
	private JLabel l1 = new JLabel("Destination ");
	private JTextField t1=new JTextField("",8);
	private JLabel l2 = new JLabel("Time (HH:MM)");
	private JTextField t2=new JTextField("", 8);

	private JButton b1 = new JButton("Next");
	private JButton b2 = new JButton("First");
	private JButton b3 = new JButton("Init List");
	private JButton b4 = new JButton("print List");
	private JButton b5 = new JButton("Clear Text");
	private JButton b6 = new JButton("Add Element");
	private JButton b7 = new JButton("Delete All");
	private JButton b8 = new JButton("Exit");
	private JPanel p1= new JPanel();
	private int index=0;

	private LinkedList list=new LinkedList();

	public MyFrame(String s){
		super(s);
		//init_Flight_list();
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(6,2));
		l0.setFont(f);  
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(b3); p1.add(b4);
		p1.add(b1); p1.add(b2);
		p1.add(b5); p1.add(b6);
		p1.add(b7); p1.add(b8);

		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
		b3.addActionListener(this);   
		b4.addActionListener(this); 
		b5.addActionListener(this);   
		b6.addActionListener(this); 
		b7.addActionListener(this);   
		b8.addActionListener(this); 		
		setSize(260,300);    setVisible(true);}

	public void actionPerformed(ActionEvent e)
	{
		 Object target=e.getSource();
		 if (target==b1){
			         if (index<list.count())index++;
			         Flight curr=list.readFlight(index);
	 	             t1.setText(curr.readDestination());
	 	             t2.setText(curr.readTime());
		             }
		             
          if (target==b2){
        	     if (list.count()==0) t1.setText("List Empty");
        	     else { index=1;
		                Flight curr=list.readFlight(index);
	 	                t1.setText(curr.readDestination());
	 	                t2.setText(curr.readTime());}}
          if (target==b3){
        	              init_Flight_list();
        	              Flight curr=list.readFlight(index);
     	 	             t1.setText(curr.readDestination());
     	 	             t2.setText(curr.readTime());}
          if (target==b4){
                 list.printlist();}
          if (target==b5){
                      t1.setText("");
                      t2.setText("");}
         if (target==b6){
                        String dest=t1.getText();
                        String time=t2.getText();
                        int indexOf=time.indexOf(":");
    	 		        String part1=time.substring(0,indexOf);
    	 		        String part2=time.substring(indexOf+1);
    	 		        int h1=Integer.parseInt(part1);
    	 		        int m1=Integer.parseInt(part2);   
    	 		        list.insert(dest, h1, m1);
                        }
          if (target==b7){
        	  			list.delete_all();
        	  			t1.setText("");
        	  			t2.setText("");}
         if (target==b8){
               System.exit(0);
               }          
	}
	
	public void init_Flight_list(){
		list.insert("Paris",9,15);list.insert("Cork",10,30);
		list.insert("London",11,45);list.insert("Madrid",13,15);
		list.insert("Leeds",15,00);list.insert("Rome",17,45);
		index=1;
		
	}

}