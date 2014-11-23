package com.sample;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.questions.Question1;
import com.questions.Question2;
import com.questions.Question3;
import com.questions.Question4;
import com.questions.Question5;
import com.questions.Question6;
import com.questions.StartFrame;
import com.questions.SummaryFrame;

public class AppWindow implements ChangePageListener {

	final int width = 450;
	final int height = 450;

	JFrame currentFrame;
	private ArrayList<JFrame> questionList;
	private SummaryFrame summaryFrame;
	private StartFrame startFrame;
	private DataGatherer dataGatherer;
	private QuestionPicker questionPicker;

	public AppWindow() {
		initQuestions();
		showFrame(startFrame);
	}

	private void initQuestions() {
		questionList = new ArrayList<>();
		questionList.add(new Question1(this));
		questionList.add(new Question2(this));
		questionList.add(new Question3(this));
		questionList.add(new Question4(this));
		questionList.add(new Question5(this));
		questionList.add(new Question6(this));
		summaryFrame = new SummaryFrame(this);
		startFrame = new StartFrame(this);
		if (questionList.size() != DroolsTest.NUMBER_OF_QUESTIONS) {
			System.out.println("Error: not all questions added");
			System.exit(1);
		}
	}

	private void showFrame(JFrame frame) {
		currentFrame = frame;
		currentFrame.setResizable(false);
		currentFrame.setVisible(true);
		currentFrame.setTitle("Studies helper");
	}
	
	private void hideFrame(JFrame frame) {
		frame.setVisible(false);
	}

	public void moveToNextQuestion() {
		hideFrame(currentFrame);
		final int nextQuestionIndex = questionPicker.getNextQuestion();
		switch (nextQuestionIndex) {
		case -1:
			showFrame(summaryFrame);
			break;
		default:
			showFrame(questionList.get(nextQuestionIndex));
			break;
		}
	}

	@Override
	public void start() {
		hideFrame(startFrame);
		moveToNextQuestion();
	}
	
	@Override
	public void nextPage() {
		moveToNextQuestion();
	}

	@Override
	public void exit() {
		hideFrame(summaryFrame);
	}

	public void setDataGatherer(DataGatherer _dataGatherer) {
		dataGatherer = _dataGatherer;
	}

	@Override
	public void addAnswer(int index, int data) {
		dataGatherer.addAnswer(index, data);
	}

	public void setQuestionPicker(QuestionPicker _questionPicker) {
		questionPicker = _questionPicker;
	}

}
