/**
 * 
 */

/**
 * @author abhin
 *
 */

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		//batchFile bt = new batchFile();
		Screen sc = new Screen();
		//DiffScreens sc = new DiffScreens();
		DefaultWords dw = new DefaultWords();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gui.setTitle("Easy to Use Glossary");
		
		Icon start = new ImageIcon("giphy.gif");
		JButton begin = new JButton(start);
		
		begin.setIcon(start);
		begin.setBounds(150,100,200,200);
		begin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//JFrame glossary = new JFrame("Easy to Use Glossary");
				//bt.setLine("C:\\Users\\abhin\\Desktop\\word_list");
				//bt.separateList(bt.getLine());
				
				//System.out.println("list of words");
				//System.out.println();
				//for(int i = 0; i<10;i++)
				//{
				//	System.out.println(bt.getWord()[i]);
				//}
				for(int i = 0; i < dw.getSize(); i++)
				{
					sc.defaultScreen();
				}
			}
		});
		gui.add(begin);
		gui.setSize(500,500);
		gui.setLayout(null);
		gui.setVisible(true);
	}
}
