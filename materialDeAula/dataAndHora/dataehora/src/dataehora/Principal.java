package dataehora;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();		
		System.out.println("hoje: " + hoje);
				
		hoje = hoje.plusDays(5);
		System.out.println("hoje: " + hoje);
	}
	
}
