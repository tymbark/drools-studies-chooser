package questions;

import java.util.ArrayList;

public class DataHelper {

	public ArrayList<Data> dataList;

	public DataHelper() {
		dataList = new ArrayList<>();

		dataList.add(new Question("START_QUESTION", "Uwa¿asz siê bardziej za... ?", "umys³ œcis³y", "humanistê" , "nie wiem"));

		dataList.add(new Question("SCI_LEVEL1_Q1",	"Czy lubisz pracowaæ z elektronik¹ lub komputerami?"));
		dataList.add(new Question("SCI_LEVEL2_Q1",	"Interesuje Ciê budowa wewnêtrzna komputerów?")); // 0 - bardzo, 1 -troche
		dataList.add(new Question("SCI_LEVEL2_Q2",	"Czy lubisz rozpatrywaæ problemy teoretyczne?"));
		dataList.add(new Question("SCI_LEVEL3_Q1",	"Projektowanie uk³adów scalonych, czy oprogramowania?"));
		dataList.add(new Question("SCI_LEVEL3_Q2",	"Czy chcesz wymyœlaæ nowe algorytmy dla DNA?"));
		dataList.add(new Question("SCI_LEVEL3_Q3",	"Czy lubisz patrzyæ w gwiazdy?"));
		dataList.add(new Question("SCI_LEVEL3_Q4",	"Czy lubisz pracê w terenie?"));

		dataList.add(new Question("HUM_LEVEL1_Q1", "Czy chcesz tworzyæ?"));
		dataList.add(new Question("HUM_LEVEL2_Q1",	"Czy potrafisz rysowaæ albo malowaæ?"));
		dataList.add(new Question("HUM_LEVEL2_Q2",	"Czy interesuj¹ Ciê jêzyki?"));
		dataList.add(new Question("HUM_LEVEL3_Q1",	"Czy uwa¿asz siê za artystê?"));
		dataList.add(new Question("HUM_LEVEL3_Q2",	"Czy potrafisz graæ na jakimœ instrumencie?"));
		dataList.add(new Question("HUM_LEVEL3_Q3",	"Czy znasz jakiœ biegle jakiœ jêzyk poza polskim?"));
		dataList.add(new Question("HUM_LEVEL3_Q4",	"Czy interesuje Ciê mózg cz³owieka?"));

		dataList.add(new Question("NON_LEVEL1_Q1",	"Jak szybko potrafisz wch³aniaæ wiedzê?"));
		dataList.add(new Question("NON_LEVEL2_Q1",	"Czy interesuje Ciê leczenie istot?"));
		dataList.add(new Question("NON_LEVEL2_Q2",	"Czy interesuje Ciê przyroda?"));
		dataList.add(new Question("NON_LEVEL3_Q1",	"Czy chcesz pomagaæ ludziom doraŸnie?"));
		dataList.add(new Question("NON_LEVEL3_Q2",	"Czy interesuj¹ Ciê dzieje ludzkoœci?"));
		dataList.add(new Question("NON_LEVEL3_Q3",	"Czy przyroda interesuje Ciê z punku widzenia nauki?")); // naukowego, osobistego
		dataList.add(new Question("NON_LEVEL3_Q4",	"Interesuj¹ Ciê polityka?"));
		dataList.add(new Question("NON_LEVEL4_Q1",	"Czy interesuj¹ ciê narz¹dy wewnêtrzne cz³owieka?"));
		dataList.add(new Question("NON_LEVEL4_Q2",	"Czy chcesz leczyæ zwierzêta?"));
		dataList.add(new Question("NON_LEVEL4_Q3", "Czy masz znajomoœci?"));
		dataList.add(new Question("NON_LEVEL4_Q4",	"Interesuje Ciê gospodarka?"));
		dataList.add(new Question("NON_LEVEL4_Q5", "Ciekawi Ciê struktura istot ¿ywych?"));
		dataList.add(new Question("NON_LEVEL4_Q6",	"Czy chcesz chroniæ przyrodê za wszelk¹ cenê?"));
		dataList.add(new Question("NON_LEVEL4_Q7", "Czy fascynuje Ciê UE?"));
		dataList.add(new Question("NON_LEVEL4_Q8", "Lubisz rz¹dzæ ludŸmi?"));

		dataList.add(new Study("SCI_EIT", "Eletronika i Telekomunikacja"));
		dataList.add(new Study("SCI_AUTOMATYKA", "Automatyka"));
		dataList.add(new Study("SCI_BIOINF", "Bioinformatyka"));
		dataList.add(new Study("SCI_INFORMATYKA", "Informatyka"));
		dataList.add(new Study("SCI_FIZYKA", "Fizyka"));
		dataList.add(new Study("SCI_MATEMATYKA", "Matematyka"));
		dataList.add(new Study("SCI_BUDOWNICTWO", "Budownictwo"));
		dataList.add(new Study("SCI_MECHANIKA",	"Mechanika i budowa maszyn"));
		
		dataList.add(new Study("HUM_MALARSTWO",	"Malarstwo"));
		dataList.add(new Study("HUM_ARCHITEKTURA", "Architektura"));
		dataList.add(new Study("HUM_MUZYKA", "Muzyka"));
		dataList.add(new Study("HUM_RZEZBA", "RzeŸba"));
		dataList.add(new Study("HUM_FILOLOGIA_X", "Filologia obca"));
		dataList.add(new Study("HUM_FILOLOGIA_PL",	"Filologia polska"));
		dataList.add(new Study("HUM_PSYCHOLOGIA", "Psychologia"));
		dataList.add(new Study("HUM_FILOZOFIA", "Filozofia"));
		
		dataList.add(new Study("NON_MEDYCYNA", "Medycyna"));
		dataList.add(new Study("NON_FIZJOTERAPIA", "Fizjoterapia"));
		dataList.add(new Study("NON_WETERYNARIA", "Weterynaria"));
		dataList.add(new Study("NON_FARMACJA", "Farmacja"));
		dataList.add(new Study("NON_PRAWO", "Prawo"));
		dataList.add(new Study("NON_HISTORIA", "Historia"));
		dataList.add(new Study("NON_EKONOMIA", "Ekonomia"));
		dataList.add(new Study("NON_CHEMIA", "Chemia"));
		dataList.add(new Study("NON_BIOLOGIA", "Biologia"));
		dataList.add(new Study("NON_GEOGRAFIA", "Geografia"));
		dataList.add(new Study("NON_EKOLOGIA", "Ekologia"));
		dataList.add(new Study("NON_ROLNICTWO", "Rolnictwo"));
		dataList.add(new Study("NON_EUROPEISTYKA", "Europeistyka"));
		dataList.add(new Study("NON_STOSUNKI", "Stosunki miêdzynarodowe"));
		dataList.add(new Study("NON_ZARZADZANIE", "Zarz¹dzanie"));
		dataList.add(new Study("NON_SOCJOLOGIA", "Socjologia"));
		
	}

	public Data get(String TAG) {
		for (Data q : dataList) {
			if ((q.TAG).equals(TAG)) {
				return q;
			}
		}
		System.out.println("ERROR: not found question:" + TAG);
		System.exit(0);
		return null;
	}

	public abstract class Data {
		public String TAG;
		public String title;
		public abstract boolean isStudy();
	}
	
	public class Study extends Data {
		public Study(String _TAG, String _title) {
			TAG = _TAG;
			title = _title;
		}

		@Override
		public boolean isStudy() {
			return true;
		}
	}
	
	public class Question extends Data {
		public String option0;
		public String option1;
		public String option2;
		private int options;

		public Question(String _TAG, String _title) {
			TAG = _TAG;
			title = _title;
			option0 = "tak";
			option1 = "nie";
			setOptions(2);
		}

		public Question(String _TAG, String _title, String _option0, String _option1) {
			TAG = _TAG;
			title = _title;
			option0 = _option0;
			option1 = _option1;
			setOptions(2);
		}

		public Question(String _TAG, String _title, String _option0, String _option1,
				String _option2) {
			TAG = _TAG;
			title = _title;
			option0 = _option0;
			option1 = _option1;
			option2 = _option2;
			setOptions(3);
		}

		public int getOptions() {
			return options;
		}

		public void setOptions(int options) {
			this.options = options;
		}

		@Override
		public boolean isStudy() {
			return false;
		}

	}
}
