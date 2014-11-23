package com.questions;

import java.awt.BorderLayout;

import com.sample.AppWindow;

public class Question4 extends AbstractQuestion {

	public Question4(AppWindow appWindow) {
		super(appWindow);
	}

	@Override
	void setTitle() {
		questionTitle.setText("Pytanie 4");
	}

	@Override
	void setSubtitle() {
		questionSubtitle.setText("4");
	}

	@Override
	int getData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getIndex() {
		// TODO Auto-generated method stub
		return 4;
	}
	
}