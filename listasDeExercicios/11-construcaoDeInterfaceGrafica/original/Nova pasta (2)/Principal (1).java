package com.faeterj.pav;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Principal {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chat Frame");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
	

		// Creating the panel at bottom and adding components
		JPanel panel = new JPanel(); // the panel is not visible in output

		JButton send = new JButton("Cancelar");
		JButton reset = new JButton("Salvar");
		panel.add(send);
		panel.add(reset);
		
		panel.setBorder(new EmptyBorder(10, 200, 10, 0));
		

		// Text Area at the Center
		JPanel ta = new JPanel();
		JTextField tf = new JTextField(); // accepts upto 10 characters
		JLabel label = new JLabel("Nome:");
		JTextField tf1 = new JTextField(); // accepts upto 10 characters
		JLabel label1 = new JLabel("Email:");
		JTextField tf2 = new JTextField(); // accepts upto 10 characters
		JLabel label2 = new JLabel("Celular:");
		ta.add(label);
		ta.add(tf);
		ta.add(label1);
		ta.add(tf1);
		ta.add(label2);
		ta.add(tf2);
		ta.setBackground(Color.green);
		ta.setLayout(new GridLayout(4, 1));
		ta.setBorder(new EmptyBorder(10, 10, 10, 10));

		GridLayout l = new GridLayout(4, 1);
		l.setHgap(10);
		l.setVgap(10);
		ta.setLayout(l);

		// Adding Components to the frame.
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}
}