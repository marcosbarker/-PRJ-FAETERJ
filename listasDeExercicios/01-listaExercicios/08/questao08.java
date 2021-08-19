import java.util.Scanner;

class AreaDoTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cálculo da área do triângulo pela altura");

		int area = 0;	

		System.out.print("Entre com o 1ª lado: ");
		int a = sc.nextInt();

		System.out.print("Entre com o 2ª lado: ");
		int b = sc.nextInt();

		System.out.print("Entre com o 3ª lado: ");
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			area = (b * a) / 2;

		} else if (b > a && b > c) {
			area = (c * b) / 2;
	
		} else {
			area = (a * c) / 2;

		}

		System.out.println("A área do triangulo é: " + area + " m²");
	}
}
