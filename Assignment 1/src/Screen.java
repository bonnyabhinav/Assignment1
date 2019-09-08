import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Screen {

	private JLabel lb1[] = new JLabel[20];
	private JFrame win1 = new JFrame("Gloss World");
	private JButton jb1, jb2;
	private JPanel panel = new JPanel();
	private Brief b1 = new Brief();
	private JLabel heading = new JLabel();
	private JSeparator sep1 = new JSeparator(SwingConstants.HORIZONTAL);
	private Border clear = BorderFactory.createLineBorder(Color.black);
	private Box box1 = Box.createVerticalBox(), box2 = Box.createVerticalBox();
	private boolean flag = true, flag1 = true;
	private int sc = 0;
	
	
	public void defaultScreen() {
		int x = 50,y = 50, counter = 25;
		flag = false;
		flag1 = true;
		sc = 1;
		System.out.println("screen value: "+sc);
		
		System.out.println("What should I Do Now");
		System.out.println("screen value: "+sc);
		DefaultWords dw = new DefaultWords();
		String keyWords[] = new String[30];
		
		keyWords = dw.getWords();
		
		System.out.println("Got here");
		/*Making it more General*/
		for(int i = 0; i < dw.getSize(); i++) {

			lb1[i] = new JLabel();
			lb1[i].setText(keyWords[i]);
			lb1[i].setAlignmentX(Component.LEFT_ALIGNMENT);
			box1.add(lb1[i]);
			
			lb1[i].setBounds(x,y,1000,20);
			lb1[i].setForeground(Color.BLUE.darker());
			lb1[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
			y = y + counter*i;

			lb1[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					onMouseClicked(e);
				}
				});
		}

		/*Making it more General*/
		
		box1.setBounds(30,100,250,250);
		box1.setBorder(clear);
		
	}
	public JLabel[] getLabel() {
		return lb1;
	}
	 private void onMouseClicked(MouseEvent e) {
	        for (int i = 0; i < 10; i++) {
            	if (e.getSource() == lb1[i]) {
	                System.out.println("Label " + i + " was clicked");
	                win1.setVisible(false);
	                b1.briefMeaning(i);
	            }
	        }     
	    }
	 public void regularScreen() {
		 heading.setText("EASY-PEASY");
         heading.setAlignmentX(Component.CENTER_ALIGNMENT);
		 heading.setFont(new Font("Times New Roman",50,50));
		 heading.setBounds(100,10,310,50);
		 jb1 = new JButton("All");
		 jb2 = new JButton("Category");

			 
			 jb1.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 if(flag == true)
					 {
						 box1.setVisible(true);
						 defaultScreen();
						 box2.setVisible(false);
					 }
				 }
			 }); 
			 
			 jb2.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e) {
					 if(flag1 == true)
					 {
						 box2.setVisible(true);
						 alphaScreen();
						 box1.setVisible(false);
					 }
				 }
			 });
		 
	     System.out.println("Check 2");
		 panel.add(jb1);
		 panel.add(jb2);
		 panel.setBounds(40,60,200,30);
		 heading.setBorder(clear);
		 win1.add(heading);
		 win1.add(sep1);
		 win1.add(panel);
		 win1.add(box1);
		 win1.add(box2);
			 
		 win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 win1.setSize(500,500);
		 win1.setLayout(null);
		 win1.setVisible(true);
		 
	 }
	 public void alphaScreen() {
		 DefaultWords dw = new DefaultWords();
		 String keyWords[] = new String[30];

		 flag1 = false;
		 flag = true;
		 int x = 50,y = 50, counter = 25;
		 keyWords = dw.getWords();
		 Arrays.sort(keyWords);
		 System.out.println("Got where");
		 
		 for(int i = 0; i < dw.getSize(); i++) {

				lb1[i] = new JLabel();
				lb1[i].setText(keyWords[i]);
				lb1[i].setAlignmentX(Component.LEFT_ALIGNMENT);
				box2.add(lb1[i]);
				
				lb1[i].setBounds(x,y,1000,20);
				lb1[i].setForeground(Color.BLUE.darker());
				lb1[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				y = y + counter*i;

				lb1[i].addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						onMouseClicked(e);
					}
					});
		 }
		 	box2.setBounds(30,100,250,250);
			box2.setBorder(clear);
}
}
