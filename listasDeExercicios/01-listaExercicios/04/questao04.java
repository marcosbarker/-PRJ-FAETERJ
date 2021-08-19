import java.util.Scanner;

class MaiorDosNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Maior dos três números");

		System.out.print("Entre com o 1ª nuemro: ");
		float a = sc.nextFloat();

		System.out.print("Entre com o 2ª nuemro: ");
		float b = sc.nextFloat();

		System.out.print("Entre com o 3ª nuemro: ");
		float c = sc.nextFloat();

		if (a > b && a > c) {
			System.out.println("O maior dos três números é = " + a);

		} else if (b > c) {
			System.out.println("O maior dos três números é = " + b);

		} else {
			System.out.println("O maior dos três números é = " + c);

		}

		sc.close();
	}
}
