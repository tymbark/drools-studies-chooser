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
import com.questions.StartFrame;
import com.questions.SummaryFrame;

public class AppWindow implements ChangePageListener {

	final int width = 450;
	final int height = 450;

	JFrame frame;
	private JCheckBox chckbxBuilder;
	private JLabel lblTitle;
	private JLabel lblDescription;
	private ArrayList<JFrame> questionList;
	private SummaryFrame summaryFrame;
	private StartFrame startFrame;
	private DataGatherer dataGatherer;
	
	private int questionCounter = 0;

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
		summaryFrame = new SummaryFrame(this);
		startFrame = new StartFrame(this);
	}

	private void showFrame(JFrame frame) {
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setTitle("Studies helper");
	}
	
	
	private void hideFrame(JFrame frame) {
		frame.setVisible(false);
	}

	public void moveToNextQuestion() {
		hideFrame(questionList.get(questionCounter));
		questionCounter ++;
		if (questionCounter == questionList.size()) {
			showFrame(summaryFrame);
		} else {
			showFrame(questionList.get(questionCounter));
		}
	}

	@Override
	public void start() {
		hideFrame(startFrame);
		showFrame(questionList.get(0));
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

}
