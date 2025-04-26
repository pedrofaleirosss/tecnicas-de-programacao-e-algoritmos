import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		double fixo, carros, valorcarro, totalcarro, vendas, totalvendas, total;
		
		System.out.println("Digite o valor do salário fixo.");
		fixo = leia.nextDouble();
		
		System.out.println("Digite o número de carros vendidos.");
		carros = leia.nextDouble();
		
		System.out.println("Digite o valor por carro vendido.");
		valorcarro = leia.nextDouble();
		
		System.out.println("Digite o valor das vendas.");
		vendas = leia.nextDouble();
		
		totalcarro = carros * valorcarro;
		totalvendas = vendas * 0.05;
		total = fixo + totalcarro + totalvendas;
		
		System.out.println("O salário final é R$" + total);
	}
}