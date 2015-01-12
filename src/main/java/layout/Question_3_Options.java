package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import main.WindowManager;
import questions.DataHelper.Question;

public class Question_3_Options extends AbstractQuestion {

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton option0;
	private JRadioButton option1;
	private JRadioButton option2;
	private String title;
	private String option0_text;
	private String option1_text;
	private String option2_text;

	public Question_3_Options(WindowManager appWindow, Question question) {
		super(appWindow);
		option0_text = question.option0;
		option1_text = question.option1;
		option2_text = question.option2;
		title = question.title;
		
		option0 = new JRadioButton();
		buttonGroup.add(option0);
		option0.setBounds(6, 72, 109, 23);
		getContentPane().add(option0);
		
		option1 = new JRadioButton();
		buttonGroup.add(option1);
		option1.setBounds(6, 98, 109, 23);
		getContentPane().add(option1);
		
		option2 = new JRadioButton();
		buttonGroup.add(option2);
		option2.setBounds(6, 124, 109, 23);
		getContentPane().add(option2);
		setTitle();
	}

	@Override
	void setTitle() {
		questionSubtitle.setText(title);
		option0.setText(option0_text);
		option1.setText(option1_text);
		option2.setText(option2_text);
	}
	
	@Override
	int getData() {
		if (option0.isSelected()) {
			return 0;
		} else if (option1.isSelected()) {
			return 1;
		} else if (option2.isSelected()) {
			return 2;
		} else {
			return -1;
		}
	}
}