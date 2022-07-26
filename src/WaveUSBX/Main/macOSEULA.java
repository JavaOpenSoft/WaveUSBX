package WaveUSBX.Main;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class macOSEULA extends JPanel {

	private JPanel contentPane = new JPanel();
	JInternalFrame jInternalFrame = new JInternalFrame();
	JTextArea EULA = new JTextArea();
	/**
	 * Create the frame.
	 */
	public macOSEULA() {
		setBounds(100, 100, 1000, 1000);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		if(macOS.getAgreementType().equals("Big Sur")){
			EULA.setText("");
		}
		if(macOS.getAgreementType().equals("Monterey")){
			EULA.setText("");
		}
		if(macOS.getAgreementType().equals("Catilina")){
			EULA.setText("");
		}
		if(macOS.getAgreementType().equals("Big Sur")){
			EULA.setText("");
		}
		if(macOS.getAgreementType().equals("Big Sur")){
			EULA.setText("");
		}
	}
	public JPanel getPanel() {
		return contentPane;
	}
}
