package com.faeterj.pav;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Principal {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chat Frame");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		
	

		// Creating the panel at bottom and adding components
		JPanel panel = new JPanel(); // the panel is not visible in output

		JButton adicionar = new JButton("Adicionar");
		JButton editar = new JButton("Editar");
		JButton remover = new JButton("Remover");
		JButton pesquisar = new JButton("Pesquisar");
		JButton sair = new JButton("Sair");
		panel.add(adicionar);
		panel.add(editar);
		panel.add(remover);
		panel.add(pesquisar);
		panel.add(sair);
		panel.setLayout(new GridLayout(5, 1));
		panel.setBorder(new EmptyBorder(10, 10, 100, 10));
		GridLayout l = new GridLayout(5, 1);
		l.setHgap(5);
		l.setVgap(5);
		panel.setLayout(l);

		
		

		// Text Area at the Center
		JTextArea ta = new JTextArea();
		ta.setAutoscrolls(true);
		ta.setLineWrap(true);
		ta.setBorder(new EmptyBorder(20, 20, 20, 20));
	

		// Adding Components to the frame.
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setVisible(true);
	}
}