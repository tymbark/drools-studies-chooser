package questions;

import java.util.ArrayList;

public class DataHelper {

	public ArrayList<Data> dataList;

	public DataHelper() {
		dataList = new ArrayList<>();

		dataList.add(new Question("START_QUESTION", "Uwa�asz si� bardziej za... ?", "umys� �cis�y", "humanist�" , "nie wiem"));

		dataList.add(new Question("SCI_LEVEL1_Q1",	"Czy lubisz pracowa� z elektronik� lub komputerami?"));
		dataList.add(new Question("SCI_LEVEL2_Q1",	"Interesuje Ci� budowa wewn�trzna komputer�w?")); // 0 - bardzo, 1 -troche
		dataList.add(new Question("SCI_LEVEL2_Q2",	"Czy lubisz rozpatrywa� problemy teoretyczne?"));
		dataList.add(new Question("SCI_LEVEL3_Q1",	"Projektowanie uk�ad�w scalonych, czy oprogramowania?"));
		dataList.add(new Question("SCI_LEVEL3_Q2",	"Czy chcesz wymy�la� nowe algorytmy dla DNA?"));
		dataList.add(new Question("SCI_LEVEL3_Q3",	"Czy lubisz patrzy� w gwiazdy?"));
		dataList.add(new Question("SCI_LEVEL3_Q4",	"Czy lubisz prac� w terenie?"));

		dataList.add(new Question("HUM_LEVEL1_Q1", "Czy chcesz tworzy�?"));
		dataList.add(new Question("HUM_LEVEL2_Q1",	"Czy potrafisz rysowa� albo malowa�?"));
		dataList.add(new Question("HUM_LEVEL2_Q2",	"Czy interesuj� Ci� j�zyki?"));
		dataList.add(new Question("HUM_LEVEL3_Q1",	"Czy uwa�asz si� za artyst�?"));
		dataList.add(new Question("HUM_LEVEL3_Q2",	"Czy potrafisz gra� na jakim� instrumencie?"));
		dataList.add(new Question("HUM_LEVEL3_Q3",	"Czy znasz jaki� biegle jaki� j�zyk poza polskim?"));
		dataList.add(new Question("HUM_LEVEL3_Q4",	"Czy interesuje Ci� m�zg cz�owieka?"));

		dataList.add(new Question("NON_LEVEL1_Q1",	"Jak szybko potrafisz wch�ania� wiedz�?"));
		dataList.add(new Question("NON_LEVEL2_Q1",	"Czy interesuje Ci� leczenie istot?"));
		dataList.add(new Question("NON_LEVEL2_Q2",	"Czy interesuje Ci� przyroda?"));
		dataList.add(new Question("NON_LEVEL3_Q1",	"Czy chcesz pomaga� ludziom dora�nie?"));
		dataList.add(new Question("NON_LEVEL3_Q2",	"Czy interesuj� Ci� dzieje ludzko�ci?"));
		dataList.add(new Question("NON_LEVEL3_Q3",	"Czy przyroda interesuje Ci� z punku widzenia nauki?")); // naukowego, osobistego
		dataList.add(new Question("NON_LEVEL3_Q4",	"Interesuj� Ci� polityka?"));
		dataList.add(new Question("NON_LEVEL4_Q1",	"Czy interesuj� ci� narz�dy wewn�trzne cz�owieka?"));
		dataList.add(new Question("NON_LEVEL4_Q2",	"Czy chcesz leczy� zwierz�ta?"));
		dataList.add(new Question("NON_LEVEL4_Q3", "Czy masz znajomo�ci?"));
		dataList.add(new Question("NON_LEVEL4_Q4",	"Interesuje Ci� gospodarka?"));
		dataList.add(new Question("NON_LEVEL4_Q5", "Ciekawi Ci� struktura istot �ywych?"));
		dataList.add(new Question("NON_LEVEL4_Q6",	"Czy chcesz chroni� przyrod� za wszelk� cen�?"));
		dataList.add(new Question("NON_LEVEL4_Q7", "Czy fascynuje Ci� UE?"));
		dataList.add(new Question("NON_LEVEL4_Q8", "Lubisz rz�dz� lud�mi?"));

		dataList.add(new Study("NON_LEVEL1_Q1",	"Jak szybko potrafisz wch�ania� wiedz�?"));
		dataList.add(new Study("NON_LEVEL2_Q1",	"Czy interesuje Ci� leczenie istot?"));
		dataList.add(new Study("NON_LEVEL2_Q2",	"Czy interesuje Ci� przyroda?"));
		dataList.add(new Study("NON_LEVEL3_Q1",	"Czy chcesz pomaga� ludziom dora�nie?"));
		dataList.add(new Study("NON_LEVEL3_Q2",	"Czy interesuj� Ci� dzieje ludzko�ci?"));
		dataList.add(new Study("NON_LEVEL3_Q3",	"Czy przyroda interesuje Ci� z punku widzenia nauki?")); // naukowego, osobistego
		dataList.add(new Study("NON_LEVEL3_Q4",	"Interesuj� Ci� polityka?"));
		dataList.add(new Study("NON_LEVEL4_Q1",	"Czy interesuj� ci� narz�dy wewn�trzne cz�owieka?"));
		dataList.add(new Study("NON_LEVEL4_Q2",	"Czy chcesz leczy� zwierz�ta?"));
		dataList.add(new Study("NON_LEVEL4_Q3", "Czy masz znajomo�ci?"));
		dataList.add(new Study("NON_LEVEL4_Q4",	"Interesuje Ci� gospodarka?"));
		dataList.add(new Study("NON_LEVEL4_Q5", "Ciekawi Ci� struktura istot �ywych?"));
		dataList.add(new Study("NON_LEVEL4_Q6",	"Czy chcesz chroni� przyrod� za wszelk� cen�?"));
		dataList.add(new Study("NON_LEVEL4_Q7", "Czy fascynuje Ci� UE?"));
		dataList.add(new Study("NON_LEVEL4_Q8", "Lubisz rz�dz� lud�mi?"));
		
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
	}
	
	public class Study extends Data {
		public Study(String _TAG, String _title) {
			TAG = _TAG;
			title = _title;
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

	}
}
