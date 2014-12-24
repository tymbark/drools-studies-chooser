package questions;

import java.util.ArrayList;

import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.FactHandle;

public class DataGatherer {
	
	private ArrayList<Answer> answers;
	private StatefulKnowledgeSession ksession;
	private int answerCounter = 0;
	
	public DataGatherer() {
		answers = new ArrayList<>();
	}
	
	public void addAnswerAndFire(int answerOption) {
		Answer a = new Answer(answerCounter, answerOption);
		answers.add(a);
		if (ksession != null) {
			ksession.insert(a);
			System.out.println("DG: Question:" + answerCounter + " Answer added:" + answerOption);
			System.out.println("DG: All rules launched...");
			ksession.fireAllRules();
			answerCounter++;
		} else {
			System.out.println("Error: KnowledgeSession not linked");
			System.exit(0);
		}
	}
	
	public void printAllAnswers() {
		for (Answer a : answers) {
			System.out.println("NO:" + a.qID + " answer:" + a.answer);
		}
	}
	
	public void setKnowledgeSession(StatefulKnowledgeSession _ksession) {
		ksession = _ksession;
		System.out.println("KnowledgeSession linked to data gatherer");
	}

	public void update(QuestionPicker questionPicker) {
		ksession.update(questionPicker.getHandle(), questionPicker);
	}
}
