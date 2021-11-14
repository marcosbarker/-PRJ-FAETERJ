package bigdecimal;

import java.math.BigDecimal;

public class Principal {

	
//	public static void main(String[] args) {
//		double total = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			total += 0.1;
//		}
//		
//		System.out.println(total);
//	}
	
//	public static void main(String[] args) {
//		float value = 0;			
//		for (int i = 0; i < 11; i++) {
//			System.out.println(new BigDecimal(value));
////			System.out.println(BigDecimal.valueOf(value));
//			value += 0.1;
//		}
//	}
	
	public static void main(String[] args) {
		BigDecimal value = new BigDecimal("0");
		BigDecimal incremento = new BigDecimal("0.1");
		for (int i = 0; i < 11; i++) {
			System.out.println(value);
			value = value.add(new BigDecimal("0.25"));
		}
	}
		
//	public static void main(String[] args) {
//		double value = 0.585;
//		System.out.println(new BigDecimal(value));
//		System.out.println(BigDecimal.valueOf(value));
//		
//		double d = 0;
//		for (int i = 1; i <= 10; i++) {
//		    d += 0.1;
//		}
//		System.out.println(d); 
//	}

}
