package questions;

import java.util.ArrayList;

import org.drools.runtime.rule.FactHandle;

public class QuestionPicker {

	private String nextQuestionTitle;
	private boolean hasStarted;
	private boolean hasEnded;
	private boolean hasPicked;
	private int level;
	private DataGatherer dataGatherer;
	private FactHandle handle;
	
	public QuestionPicker() {
		nextQuestionTitle = "";
		setHasStarted(false);
		setHasEnded(false);
		setHasPicked(false);
		setLevel(0);
	}
	
	public String getQuestionTAG() {
		return nextQuestionTitle;
	}
	
	private void update() {
		dataGatherer.update(this);
	}
	
	public String move() {
		setHasPicked(false);
		update();
		final String temp = nextQuestionTitle;
		nextQuestionTitle = "";
		return temp;
	}
	
	public void addNextQuestion(String questionTAG) {
		System.out.println("QP: next question added: " + questionTAG);
		nextQuestionTitle = questionTAG;
		setLevel(getLevel() + 1);
		setHasPicked(true);
		System.out.println("QP: level:"+getLevel());
		update();
	}

	public boolean isHasStarted() {
		return hasStarted;
	}

	public void setHasStarted(boolean hasStarted) {
		this.hasStarted = hasStarted;
	}

	public boolean isHasEnded() {
		return hasEnded;
	}

	public void setHasEnded(boolean hasEnded) {
		this.hasEnded = hasEnded;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void addDataGatherer(DataGatherer dataGatherer) {
		this.dataGatherer = dataGatherer;
	}

	public FactHandle getHandle() {
		return handle;
	}
	
	public void setHandle(FactHandle handle) {
		this.handle = handle;
		dataGatherer.update(this);
	}

	public boolean isHasPicked() {
		return hasPicked;
	}

	public void setHasPicked(boolean hasPicked) {
		this.hasPicked = hasPicked;
	}

}
