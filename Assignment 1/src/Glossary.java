/**
 * 
 */

/**
 * @author abhin
 *
 */
//import javax.swing.Icon;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.*;

@SuppressWarnings("serial")
public class Glossary extends JFrame{
/*Create an HTML file that have the complete glossary*/
/*This particular class will have some additional functions*/
/*Create link for every word, search option, */
	public static void main(String args[])
	{
		/*Creating a Window and adding buttons and operations*/
		Glossary gui = new Glossary();
		Screen sc = new Screen();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gui.setTitle("Easy to Use Glossary");
		
		Icon start = new ImageIcon("go_tigers.JPEG");
		JButton begin = new JButton(start);
		begin.setBounds(150,100,200,200);
		begin.setIcon(start);
		gui.add(begin);
		
		begin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					gui.setVisible(false);
					sc.regularScreen();
			}
		});
		
		gui.setSize(500,500);
		gui.setLayout(null);
		gui.setVisible(true);
	}
}

