import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="appCalc.class" height=300 width=300></applet>*/
public class appCalc extends Applat implements ActionListener
{
	TextField txt1;
	Button b1,b2,b3,b4,b5,b6;
	double op1,op2;
	char ch;
	public void init()
	{
		setLayout(null);
		txt1=newTextField(20);
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b5=new Button("compute");
		b6=new Button("clear");
		b7=new Button("=");
		txt1.setBounds(70,50,200,40);
		b1.setBounds(60,100,100,40);
		b2.setBounds(170,700,100,40);
		b3.setBounds(60,150,100,40);
		b4.setBounds(170,150,100,40);
		b5.setBounds(60,200,100,40);
		add(txt1);
		add(b1);
		add(b2);
		add(b3);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	}
	public void ActionPerformed(ActionEvent e)
	{
		try
		{
			if(e.getSource()==b1)
			{
				if(txt1.getText().trim().equals(""))
				{
					showStatus("Please enter First operand");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim());
					ch=b1.getLabel().trim().charAt(0);
					txt1.setText("");
				}
			}
			if(e.getSource()==b2)
			{
				if(txt1.getText().trim().equals(""))
				{
					showStatus("Please enter First operand");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim().charAt(0));
					ch=b2.getLabel().trim().charAt(0);
					txt1.setText("");
				}
			}
			if(e.getsource()==b3)
			{
				if(txt1.getText().trim().equals(""))
				{
					showStatus("Please enter First operand");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim().charAt(0));
					ch=b2.getLabel().trim().charAt(0);
					txt1.setText("");
				}
			}
			if(e.getSource()==b4)
			{
				
				if(txt1.getText().trim().equals(""))
				{
					showStatus("Please enter First operand");
				}
				else
				{
					op1=Double.parseDouble(txt1.getText().trim().charAt(0));
					ch=b2.getLabel().trim().charAt(0);
					txt1.setText("");
				}
		
			
			}
			if(e.getSource()==b5)
			{
				if(txt1.getText().trim().equals(""))
				{
					showStatus("Please enter Second operand");
				}
				else
				{
					op2=Double.parseDouble(txt1.getText().trim());
					switch(ch)
					{
						case '+':txt1.setText(" "+(op1+op2));
						break;
						case '-':txt1.setText(" "+(op1-op2));
						break;
						case '*':txt1.setText(" "+(op1*op2));
						break;
						case '/':
						if(op2==0)
						{
							showStatus("Divide by Zero error");
							txt1.setText("");
						}
						else
						{	
							txt1.setText(" "+(op1/op2));
						}
					}
				}
				if(e.getSource()==b6)
				{
					txt1.setText("");
					showStatus("");
				}
			}
		}
			catch(Exception a)
			{
				showStatus("Invalid entry");
			}
	}                

}
					
						
			
