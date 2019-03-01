/*
 * RemoteDebuggerConverter - Converter for RemoteDebugger library
 * Autor: Joao Lopes
 * File: Main Java Code
 *
 * Versions:
 * ---------------------------------
 * 0.9.0 Beta 1 - 2019-02-29
 */

package net.joaolopesf.remotedebugggerconverter;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import net.joaolopesf.util.UtilSwing;
import net.joaolopesf.util.Utilities;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RemoteDebuggerConverter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					UtilSwing.lookAndFell_Metal();

					RemoteDebuggerConverter window = new RemoteDebuggerConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RemoteDebuggerConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Panel of convertion

		ConvertPanel panel = new ConvertPanel();

		// Frame

		frame = new JFrame();
		frame.setBounds(0, 0, panel.width, panel.height + 45);
		frame.setTitle(panel.tittle);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		JLabel lblImgRemoteDebugger = new JLabel("");
		lblImgRemoteDebugger.setIcon(new ImageIcon(
				RemoteDebuggerConverter.class.getResource("/net/joaolopesf/remotedebugggerconverter/images/remotedebugger.png")));
		lblImgRemoteDebugger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Utilities.openWebPage("https://github.com/JoaoLopesF/RemoteDebugger");
			}
		});
		lblImgRemoteDebugger.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(lblImgRemoteDebugger, BorderLayout.NORTH);

		// Center it

		UtilSwing.centerFrame(frame);

	}

}
