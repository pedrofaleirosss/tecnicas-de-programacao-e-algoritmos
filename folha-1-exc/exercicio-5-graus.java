import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		double fahrenheit, celsius;
		
		System.out.println("Quantos graus Fahrenheit?");
		fahrenheit = leia.nextDouble();
		
		celsius = (fahrenheit - 32) / 1.8;
		
		System.out.println("Isso corresponde a " + celsius + " graus Celsius.");
	}
}