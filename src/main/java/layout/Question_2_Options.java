package layout;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

import main.WindowManager;
import questions.DataHelper.Question;

public class Question_2_Options extends AbstractQuestion {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton option0;
	private JRadioButton option1;
	private String title;
	private String option0_text;
	private String option1_text;

	public Question_2_Options(WindowManager appWindow, Question question) {
		super(appWindow);
		option0_text = question.option0;
		option1_text = question.option1;
		title = question.title;
		
		option0 = new JRadioButton();
		buttonGroup.add(option0);
		option0.setBounds(6, 72, 315, 23);
		getContentPane().add(option0);
		
		option1 = new JRadioButton();
		buttonGroup.add(option1);
		option1.setBounds(6, 98, 315, 23);
		getContentPane().add(option1);
		setTitle();
	}

	@Override
	void setTitle() {
		questionSubtitle.setText(title);
		option0.setText(option0_text);
		option1.setText(option1_text);
	}
	
	@Override
	int getData() {
		if (option0.isSelected()) {
			return 0;
		} else if (option1.isSelected()) {
			return 1;
		} else {
			return -1;
		}
	}
}
