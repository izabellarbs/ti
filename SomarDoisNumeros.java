package exercício1_ti;
import java.util.*;
class SomarDoisNumeros {
	public static Scanner sc = new Scanner (System.in);

		public static void main (String args[]) {
		//declaração de variáveis
			int num1, num2, soma;
			
			//leituras
			System.out.println("Digite um número: ");
			num1 = sc.nextInt();
			System.out.println("Digite um número: ");
			num2 = sc.nextInt();
			
			//somar
			soma = num1+num2;
			
			//mostrar na tela 
			System.out.println("Soma: " +soma);
		}
}