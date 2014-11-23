package com.sample;

import java.util.ArrayList;

public class DataGatherer {
	
	private ArrayList<Answer> answers;
	
	public DataGatherer() {
		answers = new ArrayList<>();
	}
	
	public void addAnswer(int questionIndex, int answer) {
		answers.add(new Answer(questionIndex, answer));
	}
	
	public void printAllAnswers() {
		for (Answer a : answers) {
			System.out.println("NO:" + a.questionIndex + " answer:" + a.answer);
		}
	}
	
	private class Answer {

		int questionIndex;
		int answer;
		
		public Answer(int _questionIndex, int _answer) {
			questionIndex = _questionIndex;
			answer = _answer;
		}
	}
}
