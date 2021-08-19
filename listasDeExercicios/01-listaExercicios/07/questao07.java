import java.util.Scanner;

class RaioDeUmCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora de área de um circulo a partir do raio em cm");
        System.out.print("Raio: ");
		
        double pi = 3.14159;
		double r = sc.nextDouble();
		
        r = pi * Math.pow(r, 2);
		      
		System.out.printf("A área do circulo é %.1f%s", r , "cm²");
		
		sc.close();
	}
}
