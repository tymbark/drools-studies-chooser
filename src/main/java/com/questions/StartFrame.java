package com.questions;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sample.AppWindow;
import com.sample.ChangePageListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StartFrame extends JFrame {

	protected JPanel contentPane;
	protected ChangePageListener onChangePageListener;
	protected JLabel questionTitle;

	public StartFrame (AppWindow appWindow ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		onChangePageListener = appWindow;
		
		JButton btnNext = new JButton("START");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				onChangePageListener.start();
			}
		});
		btnNext.setBounds(174, 150, 89, 23);
		contentPane.add(btnNext);
		
		questionTitle = new JLabel("Test na wyb\u00F3r kierunku studi\u00F3w");
		questionTitle.setHorizontalAlignment(SwingConstants.CENTER);
		questionTitle.setBounds(10, 90, 414, 14);
		contentPane.add(questionTitle);
	}
}
