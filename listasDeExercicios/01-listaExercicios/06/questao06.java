import java.util.Scanner;

class NumeroPrimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com um número para saber se é Primo: ");

        int numero = in.nextInt();
                
            if(numero % 2 != 0 && numero != 1 || numero == 2){
                System.out.println("É primo");
           } else {
                System.out.println("Não é primo");
           }
    }
}
