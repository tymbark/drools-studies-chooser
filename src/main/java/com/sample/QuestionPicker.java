package com.sample;

public class QuestionPicker {

	public int questionCounter = 0;
	
	public int getNextQuestion() {
		System.out.println("NO"+questionCounter);
		if (questionCounter >= DroolsTest.NUMBER_OF_QUESTIONS) {
			return -1;
		}
		return questionCounter++;
	}

}
