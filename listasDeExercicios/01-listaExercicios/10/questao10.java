import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class MesesFuturos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

int mes = 12;
mesesFuturos = new java.util.ArrayList<String>

switch(mes) {
	case 1: mesesFuturos.add("Janeiro");
	case 2: mesesFuturos.add("Fevereiro");
	case 3: mesesFuturos.add("Março");
	case 4: mesesFuturos.add("Abril");
	case 5: mesesFuturos.add("Maio");
	case 6: mesesFuturos.add("Junho");
	case 7: mesesFuturos.add("Julho");
	case 8: mesesFuturos.add("Agosto");
	case 9: mesesFuturos.add("Setembro");
	case 10: mesesFuturos.add("Outubro");
	case 11: mesesFuturos.add("Novembro");
	case 12: mesesFuturos.add("Dezembro");
		break;
	default: break;
}

if(mesesFuturos.isEmpty()) {
	System.out.println("Número do mes inválido");	
}else{
    for(String mes : mesesFuturos) {
        System.out.println(mes);
    }
}
}}
