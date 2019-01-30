import javax.swing.JOptionPane; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField ;
import javax.swing.JPanel ;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
	
	
 public class mar extends JFrame implements ActionListener {

	 private JTextField t1;
	 private JPanel p1 ,p2 ;
	 private JButton view ;
	 public mar () {
		 super("view");
		
		view =new JButton("view");
	view.addActionListener(this);
	    t1 = new JTextField (10);
	    t1.setEditable(true);
	    p1 = new JPanel (new GridBagLayout());
	    GridBagConstraints c =new GridBagConstraints();
	    c.insets = new Insets(10,10,10,10);
	    c.gridx=0 ;
	    c.gridy =0 ;
	    p1.add(t1,c);
	    c.gridx=0 ;
	    c.gridy =1 ;
	    p2 = new JPanel();
	    p2.add (view);
	    add(p1,BorderLayout.NORTH);
	    add(p2,BorderLayout.CENTER);
	   setSize(500,500);
	   setResizable(false);
	 }
	@Override
	public void actionPerformed(ActionEvent event) {
	
		 if (event.getSource()==view) {
		JOptionPane.showMessageDialog(null, t1.getText());
		 }
			 
	   }
 public static void main (String[]args) {
	mar inf =new mar();
		 inf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 inf.setVisible(true);
	 }
	}


