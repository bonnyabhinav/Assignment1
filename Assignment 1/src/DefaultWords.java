
public class DefaultWords {
	private static final String w1[] = {"Abate", "Chicanery", "Chivalery","Trivial", "Prodigal", "Equivocal",
			"Precipitate", "Opaque", "Fervid", "Extravagant", "Gullible","Laudable","Pedant","Vacillate","Loquacious",
			"Mitigate","Misanthrope","Deride","Bolster","Commendation"}; 
	private static final String m1[] = {"become less in amount or intensity","the use of trick to deceive someone",
			"courteous behavior, especially that of a man toward women","of little value or importance",
			"wastefully extravagant", "not easily understood or explained", "to cause to happen quickly or suddenly",
			"not easily understood", "intensely enthusiastic or passionate", 
			"lacking restraint in spending money or using resources","easily persuaded to believe something",
			"deserving praise and commendation","a person who makes an excessive display of learning",
			"alternate or waver between different opinions or actions", "tending to talk a great deal",
			"make less severe, serious or painful", "a person who dislikes humankind",
			"to express contempt for, ridicule","to support or strengthen", "praise"};
	
	private static final String c1[][] = {{"Abate","become less in amount or intensity"},
			{"Chicanery","the use of trick to deceive someone"},
	{"Chivalery","courteous behavior, especially that of a man toward women"},
	{"Trivial","of little value or importance"},
	{"Prodigal","wastefully extravagant"},
	{"Equivocal","not easily understood or explained"},
	{"Precipitate","to cause to happen quickly or suddenly"},
	{"Opaque","not easily understood"},
	{"Fervid","intensely enthusiastic or passionate"},
	{"Extravagant","lacking restraint in spending money or using resources"},
	{"Gullible","easily persuaded to believe something"},
	{"Laudable","deserving praise and commendation"},
	{"Pedant","a person who makes an excessive display of learning"},
	{"Vacillate","alternate or waver between different opinions or actions"},
	{"Loquacious","tending to talk a great deal"},
	{"Mitigate","make less severe, serious or painful"},
	{"Misanthrope","a person who dislikes humankind"},
	{"Deride","to express contempt for, ridicule"},
	{"Bolster","to support or strengthen"},
	{"Commendation","praise"}
	};
	
	
	
	
	public String[] getWords() {
		return w1;
	}
	public String[] getMean() {
		return m1;
	}
	public String[][] getList(){
		return c1;
	}
	public int getSize() {
		return w1.length;
	}
}
