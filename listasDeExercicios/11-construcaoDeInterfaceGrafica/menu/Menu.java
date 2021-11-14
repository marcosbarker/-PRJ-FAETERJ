import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;

public class Menu {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
            "https://png.pngtree.com/png-clipart/20190924/original/pngtree-menu--icon-in-trendy-style-isolated-background-png-image_4859271.jpg"));
        frame.setLocationRelativeTo(null);
        frame.setSize(450,500);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        				
		JMenuBar navBar = new JMenuBar();
        JMenu sistema = new JMenu("Sistema");
        JMenu alunos = new JMenu("Alunos");
        JMenu livros = new JMenu("Livros");
        JMenu emprestimos = new JMenu("Empréstimos");
        JMenu ajuda = new JMenu("Ajuda");
        navBar.add(sistema);
        navBar.add(alunos);
        navBar.add(livros);
        navBar.add(emprestimos);
        navBar.add(ajuda);

        JMenuItem sair = new JMenuItem("Sair");
        JMenuItem novoA = new JMenuItem("Novo");
        JMenuItem consultaA = new JMenuItem("Consulta");
        JMenuItem novoL = new JMenuItem("Novo");
        JMenuItem consultaL = new JMenuItem("Consulta");
        JMenuItem novoEmprestimo = new JMenuItem("Novo Empréstimo");
        JMenuItem novaDevolucao = new JMenuItem("Nova Devolução");
        JMenuItem consultaE = new JMenuItem("Consulta");
        JMenuItem topicosAjuda = new JMenuItem("Tópicos da ajuda");
        JMenuItem sobre = new JMenuItem("Sobre");
        sistema.add(sair);
        alunos.add(novoA);
        alunos.add(consultaA);
        livros.add(novoL);
        livros.add(consultaL);
        emprestimos.add(novoEmprestimo);
        emprestimos.add(novaDevolucao);
        emprestimos.add(consultaE);
        ajuda.add(topicosAjuda);
        ajuda.add(sobre);
        
        frame.getContentPane().add(BorderLayout.NORTH, navBar);
        frame.setVisible(true);
    }	
}