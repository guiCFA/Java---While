import java.util.Scanner;

public class ex6 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 1, numero;
		
		System.out.println("Digite um numero");
		numero = teclado.nextInt();
		
		do {
			System.out.println(contador);
			contador = contador * 2;
			
		}while(contador <= numero);
		
	}
}
