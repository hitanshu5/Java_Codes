import javax.swing.*;   
import java.awt.event.*;
import java.awt.*;
    
class UserDetails extends JFrame implements ActionListener  
{   
    JPanel newPanel;  
    JButton b1,b2; 
    JLabel nLabel, gLabel,iLabel,fLabel,dLabel,blankLabel,blankLabel1,blankLabel2;  
    JTextField  nText, dText;  
    JRadioButton gMButton,gFButton;
    JCheckBox mTB,sTB;
    JComboBox favCB;
    ButtonGroup rBG;
    
       
    UserDetails()
    {    
	String s1[]={"Mumbai","Pune","Shimla","Manali"};
        newPanel = new JPanel(new GridLayout(7, 3)); 
	blankLabel = new JLabel();
	blankLabel1 = new JLabel();
	blankLabel2 = new JLabel();
   	nLabel = new JLabel();  
        nLabel.setText("Name:"); 
        gLabel = new JLabel();  
        gLabel.setText("Gender:"); 
   	iLabel = new JLabel();  
        iLabel.setText("Interest:"); 
        fLabel = new JLabel();  
        fLabel.setText("Favourite Place:");
        dLabel = new JLabel();  
        dLabel.setText("Details:");   
        nText = new JTextField(15);    
        dText = new JTextField(100);
	dText.setEditable(false);  
        b1 = new JButton("Submit"); 
        b2 = new JButton("Exit");  
 	gMButton = new JRadioButton("Male");
 	gFButton = new JRadioButton("Female");
	mTB = new JCheckBox("Music");
	sTB = new JCheckBox("Swimming");
	favCB = new JComboBox(s1);
	rBG = new ButtonGroup();
	rBG.add(gMButton);
	rBG.add(gFButton);

        newPanel.add(nLabel);  
        newPanel.add(nText); 
	newPanel.add(blankLabel); 
        newPanel.add(gLabel);   
        newPanel.add(gMButton); 
        newPanel.add(gFButton); 
        newPanel.add(iLabel);
        newPanel.add(mTB);
        newPanel.add(sTB);
        newPanel.add(fLabel);
        newPanel.add(favCB);
	newPanel.add(blankLabel1);
        newPanel.add(dLabel);
        newPanel.add(dText);
	newPanel.add(blankLabel2);
        newPanel.add(b1);
        newPanel.add(b2);   
        add(newPanel, BorderLayout.CENTER); 
        b1.addActionListener(this); 
        b2.addActionListener(this); 
        setTitle("User Details"); 
    }  

    public void actionPerformed(ActionEvent ae) 
    {  
        String s=ae.getActionCommand();
	if(s.charAt(0)=='S')
	{
		String userName = nText.getText();  
	        String Gender = (gMButton.isSelected())?"Male":"Female";
		String Minterest =  (mTB.isSelected())?"Music":"";
		String Sinterest =  (sTB.isSelected())?"Swimming":"";
		String Fav = (String)favCB.getSelectedItem();
        	dText.setText("Name:"+userName+"\nGender:"+Gender+"\nInterest:"+Minterest+"  "+Sinterest+"\nFavourite Place:"+Fav);

	}
	else
	{
 	        this.dispose();
	}
    }  
}   
class UserDemo  
{  
    public static void main(String arg[])  
    {  
        try  
        {  
            UserDetails form = new UserDetails();  
            form.setSize(600,500); 
            form.setVisible(true); 
        }  
        catch(Exception e)  {  }  
    }  
}