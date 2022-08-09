/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */
package LacosRepeticao;
import java.util.Scanner;
public class WHILE3 {
	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
		
		int idade=0,idade21=0,idade50=0;
		
		while(idade!= -99) {
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			if(idade<21 && idade>0) {idade21=idade21+1;}
			if(idade>50) {idade50=idade50+1;}
		}
		System.out.println("Quantidade de vezes que menor de 21 é: "+idade21);
		System.out.println("Quantidade de vezes que maior de 50 é: "+idade50);
	}

}
}