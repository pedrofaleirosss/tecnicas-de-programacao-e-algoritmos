import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		double atual, maxima, minima, media;
		
		System.out.println("Digite a quantidade atual em estoque.");
		atual = leia.nextDouble();
		
		System.out.println("Digite a quantidade máxima em estoque.");
		maxima = leia.nextDouble();
		
		System.out.println("Digite a quantidade mínima em estoque.");
		minima = leia.nextDouble();
		
		media = (maxima + minima) / 2;
		
		if(atual >= media){
		    System.out.println("Não efetuar compra.");
		}
		else{
		    System.out.println("Efetuar compra.");
		}
	}
}