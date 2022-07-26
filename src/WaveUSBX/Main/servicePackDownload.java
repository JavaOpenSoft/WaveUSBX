package WaveUSBX.Main;

import java.awt.EventQueue;

import javax.swing.*;

public class servicePackDownload {

	private JPanel frame;


	public servicePackDownload() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame.setLayout(null);

		JLabel lblNewLabel = new JLabel("Choose The Service Pack(note that xp Is only included & windows \n7 can update it for you).\n");
		lblNewLabel.setBounds(6, 6, 575, 33);
		frame.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Service Pack 1");
		btnNewButton.setBounds(0, 45, 117, 29);
		frame.add(btnNewButton);
		
		JButton btnServicePack = new JButton("Service Pack 2");
		btnServicePack.setBounds(0, 86, 117, 29);
		frame.add(btnServicePack);
		
		JButton btnServicePack_1 = new JButton("Service Pack 3");
		btnServicePack_1.setBounds(0, 127, 117, 29);
		frame.add(btnServicePack_1);
	}
	public JPanel getPanel() {
		return frame;
	}
}
