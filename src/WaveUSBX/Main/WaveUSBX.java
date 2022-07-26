package WaveUSBX.Main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class WaveUSBX extends JFrame {

    static WaveUSBX frame = new WaveUSBX();
    CardLayout layout = new CardLayout();
    private final JPanel contentPane;

    /**
     * Create the frame.
     */
    public WaveUSBX() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(100, 100, 1000, 1000);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBounds(0, 0, 1000, 1000);
        contentPane.setLayout(null);


        JButton macOSButton = new JButton("");
        macOSButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                macOS mchooser = new macOS();
                mchooser.setLocationRelativeTo(null);
                mchooser.setVisible(true);
                mchooser.btnBack.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        macOS mchooser = new macOS();
                        mchooser.setVisible(false);


                    }
                });
            }
        });
        contentPane.setLayout(null);
        macOSButton.setIcon(new ImageIcon("/Users/rishonjr/Downloads/Unknown.png"));
        macOSButton.setBounds(6, 427, 280, 254);
        contentPane.add(macOSButton);

        JButton WindowsButton = new JButton("");
        WindowsButton.setIcon(new ImageIcon("/Users/rishonjr/bootableUSBFiles/win11.png"));
        WindowsButton.setBounds(357, 427, 261, 254);
        contentPane.add(WindowsButton);
        WindowsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Windows wchooser = new Windows();
                wchooser.setVisible(true);


            }
        });

        JButton LinuxButton = new JButton("");
        LinuxButton.setIcon(new ImageIcon("/Users/rishonjr/Downloads/win11 - Custom dimensions.png"));
        LinuxButton.setBounds(711, 427, 261, 254);
        contentPane.add(LinuxButton);

        JLabel typeOS = new JLabel("Choose The Type Of OS You Want To Create:");
        typeOS.setFont(new Font("Arial", Font.PLAIN, 20));
        typeOS.setBounds(259, 93, 416, 24);
        contentPane.add(typeOS);

        JLabel macOS = new JLabel("macOS");
        macOS.setBounds(122, 693, 61, 16);
        contentPane.add(macOS);

        JLabel Windows = new JLabel("Windows");
        Windows.setBounds(466, 693, 61, 16);
        contentPane.add(Windows);

        JLabel suppMacOS = new JLabel("Supported: 10.13 To 11");
        suppMacOS.setBounds(73, 721, 160, 16);
        contentPane.add(suppMacOS);

        JLabel suppWin = new JLabel("Supported: XP,7 and 10.");
        suppWin.setBounds(404, 721, 170, 16);
        contentPane.add(suppWin);

        JLabel Linux = new JLabel("Linux");
        Linux.setBounds(835, 693, 35, 16);
        contentPane.add(Linux);

        JLabel suppLinux = new JLabel("Supported: Ubuntu 16.04 To 21.04 And Few Other Distros");
        suppLinux.setBounds(618, 721, 376, 31);
        contentPane.add(suppLinux);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(6, 0, 1000, 22);
        contentPane.add(menuBar);


        JButton btnNewButton = new JButton("Quit");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton.setBounds(410, 918, 117, 29);
        contentPane.add(btnNewButton);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
