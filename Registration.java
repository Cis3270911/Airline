import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class Registration extends Frame implements ActionListener{

	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	Choice c;
	Button b1,b2,b3;
	GridBagLayout gbl;
	GridBagConstraints gbc; 
	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	int count;
	Font f,f1;
	
	Registration()
	{
		setBackground(Color.cyan);
		f = new Font("TimesRoman",Font.BOLD,20);
		f1= new Font("TimesRoman",Font.BOLD,50);
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		setLayout(gbl);
		
		l10 = new Label("REGISTRATION PAGE");
		l10.setFont(f1);
		l15 = new Label("User Name");
		l15.setFont(f);
		l8= new Label("Pasword");
		l8.setFont(f);
		l9= new Label("Confirm password");
		l9.setFont(f);
		l1 = new Label("Admin code");
		l1.setFont(f);
		l2 = new Label("FName");
		l2.setFont(f);
		l3 = new Label("LName");
		l3.setFont(f);
		l4 = new Label("Email Address");
		l4.setFont(f);
		l17 = new Label("Your Security Question");
		l17.setFont(f);
		l5 = new Label("your answer");
		l5.setFont(f);
		l6 = new Label("Address");
		l6.setFont(f);
		l7 = new Label("Phone");
		l7.setFont(f);
		
		c = new Choice();
		
		t15 = new TextField(20);
		t10 = new TextField(20);
		t8 = new TextField(20);
		t8.setEchoChar('*');
		t9 = new TextField(20);
		t9.setEchoChar('*');
		t2 = new TextField(20);
		t3 = new TextField(20);
		t4 = new TextField(20);
		t5 = new TextField(20);
		t6 = new TextField(20);
		t7 = new TextField(20);
		t1 = new TextField(20);
		t1.setEchoChar('*');
		
		c.add("What's your mother maiden name ");
		c.add("What's your first car model");
		c.add("What's your first university");
		c.add("What's your first car model");
		c.add("What's your first girlfriend name");
	
		
		b1 = new Button("Submit");
		
	
        b3 = new Button("Close");
	   
		
		l11 = new Label("");
		l12 = new Label("");
		l13 = new Label("");
		l14 = new Label("");
		
		gbc.gridx=2;
		gbc.gridy=0;
		gbl.setConstraints(l10,gbc);
		add(l10);
					
		
		
		gbc.gridx=0;
		gbc.gridy=2;
		gbl.setConstraints(l13,gbc);
		add(l13);

		gbc.gridx=2;
		gbc.gridy=2;
		gbl.setConstraints(l14,gbc);
		add(l14);
		
		gbc.gridx=0;
		gbc.gridy=6;
		gbl.setConstraints(l15,gbc);
		add(l15);

		gbc.gridx=2;
		gbc.gridy=6;
		gbl.setConstraints(t15,gbc);
		add(t15);
	
		gbc.gridx=0;
		gbc.gridy=8;
		gbl.setConstraints(l2,gbc);
		add(l2);
		
		gbc.gridx=2;
		gbc.gridy=8;
		gbl.setConstraints(t2,gbc);
		add(t2);

		gbc.gridx=0;
		gbc.gridy=10;
		gbl.setConstraints(l3,gbc);
		add(l3);

		gbc.gridx=2;
		gbc.gridy=10;
		gbl.setConstraints(t3,gbc);
		add(t3);

		gbc.gridx=0;
		gbc.gridy=12;
		gbl.setConstraints(l4,gbc);
		add(l4);

		gbc.gridx=2;
		gbc.gridy=12;
		gbl.setConstraints(t4,gbc);
		add(t4);
		
		gbc.gridx=0;
		gbc.gridy=14;
		gbl.setConstraints(l17,gbc);
		add(l17);

		gbc.gridx=2;
		gbc.gridy=14;
		gbl.setConstraints(c,gbc);
		add(c);
		
		gbc.gridx=0;
		gbc.gridy=16;
		gbl.setConstraints(l5,gbc);
		add(l5);

		gbc.gridx=2;
		gbc.gridy=16;
		gbl.setConstraints(t5,gbc);
		add(t5);

		gbc.gridx=0;
		gbc.gridy=18;
		gbl.setConstraints(l6,gbc);
		add(l6);

		gbc.gridx=2;
		gbc.gridy=18;
		gbl.setConstraints(t6,gbc);
		add(t6);

		gbc.gridx=0;
		gbc.gridy=20;
		gbl.setConstraints(l7,gbc);
		add(l7);

		gbc.gridx=2;
		gbc.gridy=20;
		gbl.setConstraints(t7,gbc);
		add(t7);

		gbc.gridx=0;
		gbc.gridy=22;
		gbl.setConstraints(l8,gbc);
		add(l8);

		gbc.gridx=2;
		gbc.gridy=22;
		gbl.setConstraints(t8,gbc);
		add(t8);

		gbc.gridx=0;
		gbc.gridy=24;
		gbl.setConstraints(l9,gbc);
		add(l9);

		gbc.gridx=2;
		gbc.gridy=24;
		gbl.setConstraints(t9,gbc);
		add(t9);

		
		
		gbc.gridx=0;
		gbc.gridy=26;
		gbl.setConstraints(l1,gbc);
		add(l1);

		gbc.gridx=2;
		gbc.gridy=26;
		gbl.setConstraints(t1,gbc);
		add(t1);
		
		gbc.gridx=0;
		gbc.gridy=28;
		gbl.setConstraints(l11,gbc);
		add(l11);

		gbc.gridx=2;
		gbc.gridy=28;
		gbl.setConstraints(l12,gbc);
		add(l12);

		gbc.gridx=0;
		gbc.gridy=30;
		gbl.setConstraints(b1,gbc);
		add(b1);

		
			     
		gbc.gridx=4;
		gbc.gridy=30;
		gbl.setConstraints(b3,gbc);
		add(b3);

                               
                b1.addActionListener(this);

                b3.addActionListener(this); 
                addWindowListener(new W());
}

	


	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==b3) System.exit(0);
		if(ae.getSource()==b1)
		{
			User b = new User("a","a","a","a","a","a","a","a","a", true);
			Login.s.add(b);
			boolean ad;
			if (t1.getText().equals("1111")) ad = true;
			else ad= false;
			User a = new User(t2.getText(),t3.getText(),t4.getText(),c.getSelectedItem(),t5.getText(),t6.getText(),t7.getText(),t15.getText(),t9.getText(),ad); 
			if (t8.getText().equals(t9.getText()))
			if (Search(a)) 	Login.s.add(a);
			else {MessageBox mb = new MessageBox(this, "User already exist");
			mb.setLocation(200,200);
			mb.setVisible(true);
			}
			else {MessageBox mb = new MessageBox(this, "Password doesn't match with Confirm Password");
			mb.setLocation(200,200);
			mb.setVisible(true);
			}
                
		}
}
	public boolean Search( User a){
		for(int i =0; i< Login.s.size(); i++)
			
			if (Login.s.get(i).UserName.equals( a.UserName)) return false;
		return true;
		
	}
	
	class W extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			setVisible(true);
			dispose();
			
		}
	}
	public static void main(String args[])
	{

		Registration r = new Registration();
		r.setSize(800,600);
		r.setVisible(true);
		r.setTitle("Create User Screen");


	}
}
