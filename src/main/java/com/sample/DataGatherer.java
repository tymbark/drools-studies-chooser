package com.sample;

import java.util.ArrayList;

import org.drools.runtime.StatefulKnowledgeSession;

public class DataGatherer {
	
	private ArrayList<Answer> answers;
	private StatefulKnowledgeSession ksession;
	
	public DataGatherer() {
		answers = new ArrayList<>();
	}
	
	public void addAnswer(int questionIndex, int answer) {
		Answer a = new Answer(questionIndex, answer);
		answers.add(a);
		if (ksession != null) {
			ksession.insert(a);
			System.out.println("Answer added:"+answer+" "+questionIndex);
			System.out.println("All rules launched...");
			ksession.fireAllRules();
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
}
