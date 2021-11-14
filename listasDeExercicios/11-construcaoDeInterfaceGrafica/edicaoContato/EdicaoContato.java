import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EdicaoContato {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel painel = new JPanel(); 
		JButton cancelar = new JButton("Cancelar");
		JButton salvar = new JButton("Salvar");
		painel.add(cancelar);
		painel.add(salvar);
		
		painel.setBorder(new EmptyBorder(10, 100, 10, 0));
		
		JPanel painelGreen = new JPanel();
		JTextField formNome = new JTextField();
		JLabel nome = new JLabel("Nome:");
		JTextField formEmail = new JTextField(); 
		JLabel email = new JLabel("Email:");
		JTextField formCelular = new JTextField(); 
		JLabel celular = new JLabel("Celular:");

		painelGreen.add(nome);
		painelGreen.add(formNome);
		painelGreen.add(email);
		painelGreen.add(formEmail);
		painelGreen.add(celular);
		painelGreen.add(formCelular);

		painelGreen.setBackground(Color.GREEN);
		painelGreen.setBorder(new EmptyBorder(10, 10, 0, 10));

		GridLayout layOut = new GridLayout(4, 1);
		layOut.setHgap(5);
		layOut.setVgap(5);
		painelGreen.setLayout(layOut);
		
		frame.getContentPane().add(BorderLayout.SOUTH, painel);
		frame.getContentPane().add(BorderLayout.CENTER, painelGreen);
		frame.setVisible(true);
		frame.pack();
	}
}