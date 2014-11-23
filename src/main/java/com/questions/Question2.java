package com.questions;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sample.AppWindow;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Question2 extends AbstractQuestion {

	public Question2(AppWindow appWindow) {
		super(appWindow);
	}

	@Override
	void setTitle() {
		questionTitle.setText("Pytanie 2");
	}

	@Override
	void setSubtitle() {
		questionSubtitle.setText("2");
	}

	@Override
	int getData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getIndex() {
		// TODO Auto-generated method stub
		return 2;
	}
}