import java.util.Scanner;

class equacaoDeSegundoGrau {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Calculo de equação do segundo grau (ax² + bx + c = 0)\n");
		System.out.println(" Entre com os valores dos três coeficiantes para calcular o Delta:");
		
        System.out.print("  Entre com valor de a: ");
		double a = sc.nextDouble();

		System.out.print("  Entre com valor de b: ");
		double b = sc.nextDouble();
		
		System.out.print("  Entre com valor de c: ");
		double c = sc.nextDouble();

		double delta = b * b - 4.0 * a * c;
		System.out.println("\n b * b - 4.0 * a * c");
		System.out.println("  " + b + " * " + b + " - " + "4.0 * " + a + " * " + c);
		System.out.println("  Valor de Delta: " + delta);

		System.out.println("\n x'  = -b + √Δ / 2 * a");
		System.out.println(" x'' = -b + √Δ / 2 * a");

		if (a == 0 || delta < 0.0) {
			System.out.println("Não é possivel calcular");
		} else {
			double x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
			double x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("  x'  = %.5f%n", x1);
			System.out.printf("  x'' = %.5f%n", x2);
		}
		
		sc.close();
	}
}
