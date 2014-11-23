package com.questions;

import java.awt.BorderLayout;

import com.sample.AppWindow;

public class Question6 extends AbstractQuestion {

	public Question6(AppWindow appWindow) {
		super(appWindow);
	}

	@Override
	void setTitle() {
		questionTitle.setText("Pytanie 6");
	}

	@Override
	void setSubtitle() {
		questionSubtitle.setText("6");
	}

	@Override
	int getData() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}