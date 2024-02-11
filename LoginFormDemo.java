import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends JFrame implements ActionListener
{
	JPanel newPanel;
	JButton b1,b2;
	JLabel userLabel,passLabel;
	JTextField TextField1,TextField2;
	
	LoginForm()
	{
		newPanel = new JPanel(new GridLayout(3,1));
		userLabel = new JLabel();
		userLabel.setText("Username");
		passLabel = new JLabel();
		passLabel.setText("Password");
		TextField1 = new JTextField(15);
		TextField2 = new JPasswordField(15);
		b1 = new JButton("SUBMIT");
		b2 = new JButton("RESET");
		newPanel.add(userLabel);
		newPanel.add(TextField1);
		newPanel.add(passLabel);
		newPanel.add(TextField2);
		newPanel.add(b1);
		newPanel.add(b2);
		add(newPanel,BorderLayout.CENTER);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setTitle("LOGIN FORM");
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.charAt(0)=='S')
		{
			String userValue = TextField1.getText();
			String passValue = TextField2.getText();
			if(userValue.equals("admin") && passValue.equals("pass@123"))
			{
				NewPage page = new NewPage();
				page.setVisible(true);
				JLabel wel_label = new JLabel("Welcome: "+userValue);
				page.getContentPane().add(wel_label);
			}
			else
			{
				System.out.println("Please Enter Valid Username and Password");
			}
		}
		else
		{
			TextField1.setText("");
			TextField2.setText("");
		}
	}
}
class NewPage extends JFrame
{
	NewPage()
	{
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Welcome");
		setSize(400,200);
	}
}
class LoginFormDemo
{
	public static void main(String args[])
	{
		try
		{
			LoginForm form = new LoginForm();
			form.setSize(600,200);
			form.setVisible(true);
		}
		catch(Exception e)
		{
		}
	}
}
