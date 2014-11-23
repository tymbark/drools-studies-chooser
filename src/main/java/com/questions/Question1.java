package com.questions;

import javax.swing.JLabel;

import com.sample.AppWindow;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

public class Question1 extends AbstractQuestion {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnHumnist;
	private JRadioButton rdbtnUmyscisy;
	private JRadioButton rdbtnNieWiem;

	public Question1(AppWindow appWindow) {
		super(appWindow);
		
		rdbtnHumnist = new JRadioButton("humanist\u0119");
		buttonGroup.add(rdbtnHumnist);
		rdbtnHumnist.setBounds(6, 72, 109, 23);
		getContentPane().add(rdbtnHumnist);
		
		rdbtnUmyscisy = new JRadioButton("umys\u0142 \u015Bcis\u0142y");
		buttonGroup.add(rdbtnUmyscisy);
		rdbtnUmyscisy.setBounds(6, 98, 109, 23);
		getContentPane().add(rdbtnUmyscisy);
		
		rdbtnNieWiem = new JRadioButton("nie wiem");
		buttonGroup.add(rdbtnNieWiem);
		rdbtnNieWiem.setBounds(6, 124, 109, 23);
		getContentPane().add(rdbtnNieWiem);
	}

	@Override
	void setTitle() {
		questionTitle.setText("Pytanie 1");
	}

	@Override
	void setSubtitle() {
		questionSubtitle.setText("Uwa\u017Casz si\u0119 bardziej za:");
	}
	
	@Override
	int getData() {
		if (rdbtnHumnist.isSelected()) {
			return 0;
		} else if (rdbtnUmyscisy.isSelected()) {
			return 1;
		} else if (rdbtnNieWiem.isSelected()){
			return 2;
		} else {
			return -1;
		}
	}

}
