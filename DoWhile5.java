/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE) */
package LacosRepeticao;
import java.util.Scanner;
public class DoWhile5 {
	public static void main(String[] args) {
		try(Scanner leia = new Scanner(System.in)) {
			
			int numero=0, soma=0;
			
			do {
				System.out.println("\nEntre com um valor: ");
				numero = leia.nextInt();
				soma += numero;
			} while(numero != 0);  
			System.out.println("\nSomat�rio dos valores: "+soma);
}
	}
}
