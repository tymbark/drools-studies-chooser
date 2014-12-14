package com.sample;

import java.util.ArrayList;
public class QuestionPicker {

	private ArrayList<String> questions;
	private int nextQuestion;
	private boolean hasStarted;
	
	public QuestionPicker() {
		nextQuestion = -1;
		setHasStarted(false);
	}
	
	public int getNextQuestionIndex() {
		return nextQuestion;
	}
	
	public String getNextQuestionTitle() {
		return questions.get(nextQuestion);
	}
	
	public void addNextQuestion(int questionIndex) {
		nextQuestion = questionIndex;
	}
	
	public void addNextQuestion(String questionTitle) {
		nextQuestion = questions.indexOf(questionTitle);
	}

	public boolean isHasStarted() {
		return hasStarted;
	}

	public void setHasStarted(boolean hasStarted) {
		this.hasStarted = hasStarted;
	}
	
	public void setQuestionsList(ArrayList<String> _questions) {
		questions = _questions;
	}

}
