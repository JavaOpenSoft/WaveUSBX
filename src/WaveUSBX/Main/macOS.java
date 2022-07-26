package WaveUSBX.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class macOS extends JFrame {

	private static JPanel contentPane;
	private static String agreementType = "";
	public JButton btnBack = new JButton("Back");
	/**
	 * Create the frame.
	 */
	public macOS() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton mosbs = new JButton("macOS Big Sur(11.6.8)");
		mosbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agreementType = "Big Sur";
			}
		});
		JButton mosMonterey = new JButton("macOS Monterey 12.4");
		mosMonterey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agreementType = "Monterey";
			}
		});

		mosbs.setBounds(6, 52, 160, 29);
		contentPane.add(mosbs);
		
		JButton mosc = new JButton("macOS Catilina(10.15.7)");
		mosc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				agreementType = "Catilina";
			}
		});
		mosc.setBounds(6, 93, 188, 29);
		contentPane.add(mosc);
		
		JButton mosm = new JButton("macOS Mojave(10.14)");
		mosm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				agreementType = "Mojave";
			}
		});
		mosm.setBounds(6, 134, 160, 29);
		contentPane.add(mosm);
		
		JButton moshs = new JButton("macOS High Sierra(10.13)");
		moshs.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				agreementType = "High Sierra";
			}
		});
		moshs.setBounds(6, 175, 188, 29);
		contentPane.add(moshs);
		
		btnBack.setBounds(6, 337, 117, 29);
		contentPane.add(btnBack);
		
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setBounds(277, 337, 117, 29);
		contentPane.add(btnQuit);
		
		JLabel lblNewLabel = new JLabel("Choose Your macOS Version:");
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 6, 388, 34);
		contentPane.add(lblNewLabel);
	}
	public static JPanel getPanel() {
		return contentPane;
	}
	public static String getAgreementType() {
	    return agreementType;
	}
}
