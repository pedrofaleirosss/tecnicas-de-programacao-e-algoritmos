import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		double numero, total = 0, conta;
		
		for(conta = 0; conta < 10; conta++){
		    System.out.println("Digite um número.");
		    numero = leia.nextDouble();
		    
		    if(numero < 40){
		        total = total + numero;
		    }
		}
		
		System.out.println("O total é " + total);
	}
}