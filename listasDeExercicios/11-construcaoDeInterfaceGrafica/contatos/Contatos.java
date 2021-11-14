import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Contatos {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(500,300);
		
		JPanel panel = new JPanel(); 
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

		GridLayout layOut = new GridLayout(5, 1);
		layOut.setHgap(7);
		layOut.setVgap(7);
		panel.setLayout(layOut);

		JTextArea menu = new JTextArea();
		menu.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.getContentPane().add(BorderLayout.CENTER, menu);
		frame.setVisible(true);
	}
}