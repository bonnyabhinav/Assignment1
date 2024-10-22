

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Brief {
	private String meaning[] = new String[100];
	private String word[] = new String[20];
	private JFrame mean1 = new JFrame("Meaning");
	//private JFrame mean2 = new JFrame("Meaning");
	private JLabel lb2,lb1,lb3 = new JLabel();
	private int key = 0;
	
	public void briefMeaning(int i) {
		DefaultWords dw = new DefaultWords();

		System.out.println("Value = "+i);
		word = dw.getWords();
		meaning = dw.getMean();
		Screen sc = new Screen();
		
		
		JButton jb1 = new JButton("BACK");
		
		
		jb1.setBounds(250,400,100,40);
		
		
		if(word[i] == "Prodigal")
		{
			lb1 = new JLabel(word[i]);
			lb1.setFont(new Font("Times New Roman",350,100));
			lb1.setBounds(50,50,1000,100);
			
			
			if(meaning[i].contains("extravagant"))
				lb3.setText("Extravagant");
			
			for(int j = 0; j < dw.getSize(); j++)
			{
				if(word[i] == "Extravagant")
					key = j;
			}
				
			
			lb3.setFont(new Font("Times New Roman",20,20));
			lb3.setBounds(100,200,1000,100);
			mean1.add(lb3);
			lb3.setForeground(Color.BLUE.darker());
			lb3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
			lb3.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					onMouseClicked(e);
				}
				});
			
			lb2 = new JLabel(meaning[i]);
			lb2.setFont(new Font("Times New Roman",100,20));
			lb2.setBounds(100,150,1000,100);
			
			lb1.setForeground(new Color(120, 90, 40));
		}
		else if(word[i] == "Laudable")
		{
			lb1 = new JLabel(word[i]);
			lb1.setFont(new Font("Times New Roman",350,100));
			lb1.setBounds(50,50,1000,100);
			if(meaning[i].contains("commendation"))
				lb3 = new JLabel("Commendation");
			
			for(int j = 0; j < dw.getSize(); j++)
			{
				if(word[i] == "Commendation")
					key = j;
			}
			
			lb3.setFont(new Font("Times New Roman",20,20));
			lb3.setBounds(100,200,1000,100);
			lb3.setForeground(Color.BLUE.darker());
			lb3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
			mean1.add(lb3);
			
			lb2 = new JLabel(meaning[i]);
			lb2.setFont(new Font("Times New Roman",100,20));
			lb2.setBounds(100,150,1000,100);
			
			lb1.setForeground(new Color(120, 90, 40));
		}
		else
		{
			lb1 = new JLabel(word[i]);
			lb1.setFont(new Font("Times New Roman",350,100));
			lb1.setBounds(50,50,1000,100);
			lb2 = new JLabel(meaning[i]);
			lb2.setFont(new Font("Times New Roman",100,20));
			lb2.setBounds(100,150,1000,100);
			
			lb1.setForeground(new Color(120, 90, 40));
		}
		
		mean1.add(lb1);
		mean1.add(lb2);
		mean1.add(jb1);
		
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					mean1.setVisible(false);
					sc.regularScreen();
			}
		});
		
		mean1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mean1.setSize(700,500);
		mean1.setLayout(null);
		mean1.setVisible(true);
	}
	
	private void onMouseClicked(MouseEvent e) {
         	if (e.getSource() == lb3) {
	                briefMeaning(key);
	            }
	    }
	
}
