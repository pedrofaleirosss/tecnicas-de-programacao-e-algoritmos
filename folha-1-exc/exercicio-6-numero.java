import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número.");
		numero = leia.nextDouble();
		
		if(numero > 0){
		    System.out.println("O número é positivo.");
		}
		else if(numero == 0){
		    System.out.println("O número é 0.");
		}
		else{
		    System.out.println("O número é negativo.");
		}
	}
}