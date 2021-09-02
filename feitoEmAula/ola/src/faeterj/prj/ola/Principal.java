package faeterj.prj.ola;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		char uf;

		System.out.print("Escreva seu nome: ");
		nome = sc.next();
		
		System.out.print("Qual sua  UF: ");
		uf = sc.next().charAt(0);
		
		System.out.println("Seu nome é: " + nome + " e sua UF é " + uf);

	sc.close();
	
	}
}