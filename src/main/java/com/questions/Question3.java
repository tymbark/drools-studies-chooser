package com.questions;

import java.awt.BorderLayout;

import com.sample.AppWindow;

public class Question3 extends AbstractQuestion {

	public Question3(AppWindow appWindow) {
		super(appWindow);
	}

	@Override
	void setTitle() {
		questionTitle.setText("Pytanie 3");
	}

	@Override
	void setSubtitle() {
		questionSubtitle.setText("3");
	}

	@Override
	int getData() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}