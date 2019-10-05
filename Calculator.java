import java.awt.*;
import java.awt.event.*;
//import java.Math.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;
class Calculator implements ActionListener
{
	JButton b[] = new JButton[10];
	JFrame f ;JTextField tf;
	Calculator()
	{
		f=new JFrame("Calculator");
		tf = new JTextField(50);
		f.add(tf);
		for(int i=0;i<10;i++)
		{
			b[i]=new JButton(Integer.toString(i));
			f.add(b[i]);
			b[i].addActionListener(this);
			//b[i].setSize(30,30);
			b[i].setPreferredSize(new Dimension(45, 45));
		}
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(550,550);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Heaven's Hell");
	}
	public static void main(String args[])
	{
		Calculator c = new Calculator();
	}

}
