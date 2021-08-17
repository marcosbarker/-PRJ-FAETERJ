import java.util.Scanner;

class Programa {
	public static void main(String[] args) {
		System.out.println("Qual o seu nome?");
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();
		System.out.println("Olá, " + nome);
	}
}
