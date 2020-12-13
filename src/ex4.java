import java.util.Scanner;

public class ex4 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numero,contador = 0,menor = 9999;
				
		do {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			
			if(numero < menor) {
				menor = numero;
			}
					
		contador++;
		}while(contador < 4);
		System.out.println("O menor número é: " + menor);
		
		
	} 
}
