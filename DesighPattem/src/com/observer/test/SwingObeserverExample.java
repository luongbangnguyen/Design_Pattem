package com.observer.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObeserverExample {
	
	
	JFrame frame;
	JButton button;
	
	public static void main(String[] args) {
		System.out.println("into method");
		SwingObeserverExample ex = new SwingObeserverExample();
		ex.go();
	}
	
	public void go(){
		frame = new JFrame("Swing Oberserver Example");
		button = new JButton("Should I do it");
		button.setSize(100, 50);
		button.addActionListener(new AngleListenner());
		button.addActionListener(new DevilListenner());
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.pack();
		frame.setSize(500, 250);
		frame.setVisible(true);
		
	}
	
	class AngleListenner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it, you might regret it !");
			
		}
		
	}
	
	class DevilListenner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, do it !");
			
		}
		
	}
}
