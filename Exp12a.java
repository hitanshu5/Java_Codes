import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp12a extends JFrame implements ActionListener
{
	public static JButton jb,jb2;
	static JLabel jl,jl2;
	static JPanel jp1;
	static JTextField jtf1, jtf2, jtf3;

    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==jb){
            jtf3.setText("login id: "+jtf1.getText()+" password: "+jtf2.getText());
            jtf3.setVisible(true);  
        }
        if(e.getSource().equals(jb2)){
            jtf1.setText("");
            jtf2.setText("");
            jtf3.setVisible(false); 
        }
}  
	

	Exp12a()
	{
		jb = new JButton("OK");
		jb.setSize(new Dimension(100,50));
		jb.setFont(new Font("Candara", Font.BOLD, 25));
        jb2 = new JButton("Reset");
		jb2.setSize(new Dimension(100,50));
		jb2.setFont(new Font("Candara", Font.BOLD, 25));

		jl = new JLabel("Login: ");
		jl.setSize(50,100);
		jl.setVisible(true);
        jl2 = new JLabel("Password: ");
		jl2.setSize(50,100);
		jl2.setVisible(true);

		jp1 = new JPanel();
		jtf1 = new JTextField(20);
        jtf2=new JTextField(20);
        jtf3=new JTextField(30);
        jtf3.setVisible(false);
        
		jb.setBounds(350,230,100,40);

        jb.addActionListener(this);  

        jb2.addActionListener(this); 

        jp1.add(jl);
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		jp1.add(jb);   
		jp1.add(jb2);
        jp1.add(jtf3);
		this.add(jp1, BorderLayout.CENTER);

		this.setTitle("Login");
		this.setSize(800,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		Exp12a e = new Exp12a();
	}
}