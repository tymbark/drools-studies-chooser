package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import questions.ChangePageListener;
import source.WindowManager;
import java.awt.Font;

public class SummaryFrame extends JFrame {

	protected JPanel contentPane;
	protected ChangePageListener onChangePageListener;
	protected JLabel questionTitle;

	public SummaryFrame (WindowManager appWindow, String _title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		onChangePageListener = appWindow;
		
		JButton btnNext = new JButton("EXIT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNext.setBounds(177, 228, 89, 23);
		contentPane.add(btnNext);
		
		questionTitle = new JLabel(_title);
		questionTitle.setHorizontalAlignment(SwingConstants.CENTER);
		questionTitle.setBounds(10, 79, 414, 14);
		contentPane.add(questionTitle);
		
		JLabel lblNewLabel = new JLabel("Tw\u00F3j kierunek to:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(163, 22, 137, 23);
		contentPane.add(lblNewLabel);
	}
}
