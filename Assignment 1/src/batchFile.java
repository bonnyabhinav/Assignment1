import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class batchFile {
	
	private String line[] = new String[1000];
	private String word[] = new String[100];
	private String meaning[] = new String[1000];
	public int ctr = 0;

	public void setLine(String file) {
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(br.readLine() != null)
			{
				ctr = ctr + 1;
				System.out.println(ctr);
			}
			//Scanner s2 = new Scanner(new File(file));
			for(int i = 0; i < ctr; i++) {
				line[i] = br.readLine();
				System.out.println(line[i]);
			}
			br.close();
		}
		
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	public String[] getLine() {
		return line;
	}
	public void separateList(String line[]) {
		int startPos;
		int endPos;
		String temp;
		try {
			for(int i = 0; i < 10; i++) {
				startPos = line[i].indexOf(':');
				endPos = line[i].indexOf('\n');
				temp = line[i];
				word[i] = temp.substring(0,startPos);
				System.out.println(word[i]);
				meaning[i] = temp.substring(startPos+1, endPos);
			}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Index is Out Of Bound");
		}
		
	}
	public String[] getWord() {
		return word;
	}
	public String[] getMeaning() {
		return meaning;
	}
}
