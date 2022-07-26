package WaveUSBX.Main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Windows extends JPanel {

	private JPanel contentPane;
	public Windows() {
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JLabel lblNewLabel = new JLabel("Choose Your Windows Version:");
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 25));
		lblNewLabel.setBounds(216, 52, 468, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("/Users/rishonjr/bootableUSBFiles/Windows/Windows_10_x32/unnamed.png"));
		btnNewButton.setBounds(6, 138, 267, 169);
		contentPane.add(btnNewButton);

		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("/Users/rishonjr/bootableUSBFiles/Windows/Windows_10_x32/unnamed.png"));
		btnNewButton_1.setBounds(378, 138, 267, 169);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Type: x86(32-Bit)");
		lblNewLabel_1.setBounds(94, 319, 130, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Type: x86_64(64-Bit)");
		lblNewLabel_1_1.setBounds(451, 319, 138, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("/Users/rishonjr/bootableUSBFiles/Windows/Windows_7_x64/windows-7-logo-png-5a3aadfcce4dc8.687624761513795068845.jpg"));
		btnNewButton_1_1.setBounds(1088, 138, 267, 169);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("/Users/rishonjr/bootableUSBFiles/Windows/Windows_7_x64/windows-7-logo-png-5a3aadfcce4dc8.687624761513795068845.jpg"));
		btnNewButton_2.setBounds(716, 138, 267, 169);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setIcon(new ImageIcon("/Users/rishonjr/bootableUSBFiles/Windows/XP_x64/rsz_windows-xp-logo-small.png"));
		btnNewButton_1_2.setBounds(733, 347, 267, 169);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("/Users/rishonjr/bootableUSBFiles/Windows/XP_x64/rsz_windows-xp-logo-small.png"));
		btnNewButton_3.setBounds(361, 347, 267, 169);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Type: x86_64(64-Bit)");
		lblNewLabel_1_1_1.setBounds(1143, 319, 138, 16);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Type: x86(32-Bit)");
		lblNewLabel_1_2.setBounds(786, 319, 130, 16);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Type: x86_64(64-Bit)");
		lblNewLabel_1_1_2.setBounds(813, 528, 138, 16);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Type: x86(32-Bit)");
		lblNewLabel_1_3.setBounds(451, 525, 282, 22);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnNewButton_4 = new JButton("Service Pack Downloads");
		btnNewButton_4.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cmd = "ls -al";
				Runtime run = Runtime.getRuntime();
				Process pr = null;
				try {
					pr = run.exec(cmd);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					pr.waitFor();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				String line = "";
				try {
					while ((line=buf.readLine())!=null) {
					System.out.println(line);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(588, 631, 315, 29);
		contentPane.add(btnNewButton_4);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(6, 937, 117, 29);
		contentPane.add(btnBack);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(1377, 937, 117, 29);
		contentPane.add(btnQuit);
		}
		public JPanel getPanel() {return contentPane;}
	}

