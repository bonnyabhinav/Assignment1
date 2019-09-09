
public class DefaultWords {
	private static final String w1[] = {"Abate", "Chicanery", "Chivalery","Trivial", "Prodigal", "Equivocal",
			"Precipitate", "Opaque", "Fervid", "Extravagant", "Gullible","Laudable","Pedant","Vacillate","Loquacious",
			"Mitigate","Misanthrope","Deride","Bolster","commendation"}; 
	private static final String m1[] = {"become less in amount or intensity","the use of trick to deceive someone",
			"courteous behavior, especially that of a man toward women","of little value or importance",
			"wastefully extravagant", "not easily understood or explained", "to cause to happen quickly or suddenly",
			"not easily understood", "intensely enthusiastic or passionate", 
			"lacking restraint in spending money or using resources","easily persuaded to believe something",
			"deserving praise and commendation","a person who makes an excessive display of learning",
			"alternate or waver between different opinions or actions", "tending to talk a great deal",
			"make less severe, serious or painful", "a person who dislikes humankind",
			"to express contempt for, ridicule","to support or strengthen", "praise"};
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
