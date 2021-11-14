//package com.faeterj.pav;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
		
		
		JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Sistema");
        JMenu m2 = new JMenu("Alunos");
        JMenu m3 = new JMenu("Livros");
        JMenu m4 = new JMenu("Empréstimo");
        JMenu m5 = new JMenu("Ajuda");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        JMenuItem m11 = new JMenuItem("Sair");
        JMenuItem m21 = new JMenuItem("Novo");
        JMenuItem m22 = new JMenuItem("Consulta");
        JMenuItem m31 = new JMenuItem("Novo");
        JMenuItem m32 = new JMenuItem("Consulta");
        JMenuItem m41 = new JMenuItem("Novo Empréstimo");
        JMenuItem m42 = new JMenuItem("Nova Devolução");
        JMenuItem m43 = new JMenuItem("Consulta");
        JMenuItem m51 = new JMenuItem("Tópicos da ajuda");
        JMenuItem m52 = new JMenuItem("Sobre");
        m1.add(m11);
        m2.add(m21);
        m2.add(m22);
        m3.add(m31);
        m3.add(m32);
        m4.add(m41);
        m4.add(m42);
        m4.add(m43);
        m5.add(m51);
        m5.add(m52);
        
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.setVisible(true);
    }	
}