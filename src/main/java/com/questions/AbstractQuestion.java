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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public abstract class AbstractQuestion extends JFrame {

	protected JPanel contentPane;
	protected AppWindow onChangePageListener;
	protected JLabel questionTitle;
	protected JLabel questionSubtitle;

	public AbstractQuestion(AppWindow appWindow ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		onChangePageListener = appWindow;
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (getData() == -1) {
					return;
				}
				onChangePageListener.nextPage();
				System.out.println("sel:" + getData());
			}
		});
		btnNext.setBounds(335, 228, 89, 23);
		contentPane.add(btnNext);
		
		questionTitle = new JLabel("title");
		questionTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		questionTitle.setBounds(10, 11, 101, 23);
		contentPane.add(questionTitle);
		
		questionSubtitle = new JLabel("subtitle");
		questionSubtitle.setBounds(10, 45, 414, 14);
		contentPane.add(questionSubtitle);
		setTitle();
		setSubtitle();
	}
	
	abstract void setTitle();
	
	abstract void setSubtitle();
	
	abstract int getData();
}
