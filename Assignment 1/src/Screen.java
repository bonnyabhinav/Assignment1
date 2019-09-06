import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen {
	private int flag = 0;
	private JLabel lb1[] = new JLabel[20];
	private JPanel lbp = new JPanel();
	
	public void defaultScreen() {
		int x = 50,y = 50, counter = 25;
		Brief b1 = new Brief();
		DefaultWords dw = new DefaultWords();
		String keyWords[] = new String[100];
		
		keyWords = dw.getWords();
		JFrame win1 = new JFrame("Gloss World");
		
		
		System.out.println("Got here");
		/*Making it more General*/
		for(int i = 0; i < keyWords.length; i++) {

			lb1[i] = new JLabel();
			lb1[i].setText(keyWords[i]);
			lb1[i].setBounds(x,y,1000,100);
			lb1[i].setForeground(Color.BLUE.darker());
			lb1[i].setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			
        	System.out.println("index = "+i);
			y = y + counter;

			lb1[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					onMouseClicked(e);
				}
				});
		}
		
		for(int i = 0; i < keyWords.length; i++) {
			lbp.add(lb1[i]);
		}
			
			
		/*Making it more General*/
		win1.add(lbp);
		win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//win1.pack();
		win1.setSize(500,500);
		win1.setLayout(null);
		win1.setVisible(true);
		System.out.println("Just a test1");
		
	}
	public JLabel[] getLabel() {
		return lb1;
	}
	 private void onMouseClicked(MouseEvent e) {
	        for (int i = 0; i < 10; i++) {
            	if (e.getSource() == lb1[i]) {
	                System.out.println("Label " + i + " was clicked");
	            }
	        }
	            
	    }
}
