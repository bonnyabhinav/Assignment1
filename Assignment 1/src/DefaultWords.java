
public class DefaultWords {
	private static final String w1[] = {"Abate", "Chicanery", "Chivalery","Trivial"}; 
	private static final String m1[] = {"become less in amount or intensity","the use of trick to deceive someone"};
	public String[] getWords() {
		return w1;
	}
	public String[] getMean() {
		return m1;
	}
	public int getSize() {
		return w1.length;
	}
}