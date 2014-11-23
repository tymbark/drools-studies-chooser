package com.questions;

import java.awt.BorderLayout;

import com.sample.AppWindow;

public class Question5 extends AbstractQuestion {

	public Question5(AppWindow appWindow) {
		super(appWindow);
	}

	@Override
	void setTitle() {
		questionTitle.setText("Pytanie 5");
	}

	@Override
	void setSubtitle() {
		questionSubtitle.setText("5");
	}

	@Override
	int getData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getIndex() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}