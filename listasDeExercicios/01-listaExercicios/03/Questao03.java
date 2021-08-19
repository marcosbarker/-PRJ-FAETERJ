import java.util.Scanner;

class MinhaClasse {
	public static void main(String[] args) {
		System.out.println("Método main da classe MinhaClasse");

        System.out.println("Digite dois números: ");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        float media = (a+b)/2;

        System.out.println("Média: " + media);
	}
}
