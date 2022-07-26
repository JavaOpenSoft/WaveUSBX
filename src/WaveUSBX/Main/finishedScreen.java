package WaveUSBX.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class finishedScreen extends JPanel{
    private JPanel contentPane;


    /**
     * Create the frame.
     */
    public finishedScreen() {
        setBounds(100, 100, 1000, 1000);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = new JLabel("");
        contentPane.add(lblNewLabel, BorderLayout.CENTER);
    }
    public JPanel getPanel() {
        return contentPane;
    }
}
