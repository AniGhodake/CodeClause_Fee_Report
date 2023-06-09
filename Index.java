
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.sql.*;

public class Index extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JButton bt1,bt2;
	JPanel p1,p2;
	Font f,f1;
	Index()
	{
		super("Home Page");
		setLocation(100,100);
		setSize(500,200);
		
		l1=new JLabel("Fee Report");
		l2=new JLabel("Admin Login");
		l3=new JLabel("Accountant Login");
		
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(Color.BLUE);
		
		bt1=new JButton("Login");
		bt2=new JButton("Login");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		f=new Font("Arial",Font.BOLD,24);
		f1=new Font("Arial",Font.BOLD,16);
		
		l1.setFont(f);
		l2.setFont(f1);
		l3.setFont(f1);
		bt1.setFont(f1);
		bt2.setFont(f1);
		
		p1=new JPanel();
		p1.setLayout(new GridLayout(1,1,10,10));
		p1.add(l1);
		
		p2=new JPanel();
		p2.setLayout(new GridLayout(2,2,10,10));
		p2.add(l2);
		p2.add(bt1);
		p2.add(l3);
		p2.add(bt2);
		
		setLayout(new BorderLayout(0,0));
		add(p1,"North");
		add(p2,"Center");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bt1) {
			new Admin().setVisible(true);
			this.setVisible(false);
		}
		if(e.getSource()==bt2)
		{
			new Accountant().setVisible(true);
			this.setVisible(false);
		}
	}
	public static void main(String[] args)
	{
		new Index().setVisible(true);
	}
}
