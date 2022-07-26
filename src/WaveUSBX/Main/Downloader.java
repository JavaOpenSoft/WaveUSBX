package WaveUSBX.Main;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Downloader {

	private JPanel frame = new JPanel();

	public Downloader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String site="http://www.file.url/win.zip";
		String filename="WindowsXP-KB4012583-x86-Custom-ENU.exe_.zip";
		JFrame frm=new JFrame();
		frm.getContentPane().setLayout(null);
		JProgressBar current = new JProgressBar(0, 100);
		current.setLocation(127, 5);
		current.setSize(146,20);
		current.setValue(43);
		current.setStringPainted(true);
		frm.getContentPane().add(current);
		
		JButton btnNewButton = new JButton("Quit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(6, 137, 117, 29);
		frm.getContentPane().add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(277, 137, 117, 29);
		frm.getContentPane().add(btnStop);
		frm.setVisible(true);
		frm.setSize(400, 200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			URL url=new URL(site);
			HttpURLConnection connection =
		        (HttpURLConnection) url.openConnection();
			int filesize = connection.getContentLength();
			float totalDataRead=0;
				java.io.BufferedInputStream in = new java.io.BufferedInputStream(connection.getInputStream());
				java.io.FileOutputStream fos = new java.io.FileOutputStream(filename);
				java.io.BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
				byte[] data = new byte[1024];
				int i=0;
				while((i=in.read(data,0,1024))>=0)
				{
				totalDataRead=totalDataRead+i;
				bout.write(data,0,i);
				float Percent=(totalDataRead*100)/filesize;
				current.setValue((int)Percent);
				}	
				bout.close();
				in.close();
		}
		catch(Exception e)
		{
			 javax.swing.JOptionPane.showConfirmDialog((java.awt.Component)
			         null,e.getMessage(), "Error Downloading The File",
			         javax.swing.JOptionPane.ERROR_MESSAGE);
		}
	}
	public JPanel getPanel(){
		return frame;
	}
}
