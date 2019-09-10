import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WordMeaning {
	
	public void abate() {
		String html = "<div><h1>Abate : </h1><p>become less in amount or intensity</p></div>";
		File f = new File("C:\\HTML\\abate.html");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write(html);
			bw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
