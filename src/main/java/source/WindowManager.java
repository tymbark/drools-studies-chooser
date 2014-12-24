package source;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.drools.runtime.rule.FactHandle;

import questions.ChangePageListener;
import questions.DataGatherer;
import questions.QuestionPicker;
import questions.DataHelper;
import questions.DataHelper.Question;
import layout.Question_2_Options;
import layout.Question_3_Options;
import layout.StartFrame;
import layout.SummaryFrame;

public class WindowManager implements ChangePageListener {

	final int width = 450;
	final int height = 450;

	JFrame currentFrame;
	private ArrayList<JFrame> questionList;
	private SummaryFrame summaryFrame;
	private StartFrame startFrame;
	private DataGatherer dataGatherer;
	private QuestionPicker questionPicker;
	private DataHelper questionsHelper;

	public WindowManager() {
		initQuestions();
		showFrame(startFrame);
		questionsHelper = new DataHelper();
	}

	private void initQuestions() {
		questionList = new ArrayList<>();
		summaryFrame = new SummaryFrame(this);
		startFrame = new StartFrame(this);
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
		final String nextQuestionTitle = questionPicker.move();
		final Question question = (Question) questionsHelper.get(nextQuestionTitle);
		prepareAndDisplayFrame(question);
	}

	private void prepareAndDisplayFrame(Question question) {
		switch(question.getOptions()) {
		case 2:
			showFrame(new Question_2_Options(this, question));
			break;
		case 3:
			showFrame(new Question_3_Options(this, question));
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
		hideFrame(currentFrame);
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
	public void addAnswer(int data) {
		dataGatherer.addAnswerAndFire(data);
		
	}

	public void setQuestionPicker(QuestionPicker _questionPicker) {
		questionPicker = _questionPicker;
	}

}
