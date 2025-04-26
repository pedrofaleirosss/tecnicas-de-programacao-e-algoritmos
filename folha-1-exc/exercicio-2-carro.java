import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		double fabrica, distribuidor, impostos, custo;
		
		System.out.println("Digite o custo de fábrica do carro.");
		fabrica = leia.nextDouble();
		
		distribuidor = 0.28 * fabrica;
		impostos = 0.45 * fabrica;
		custo = fabrica + distribuidor + impostos;
		
		System.out.println("O custo final do carro é R$" + custo);
	}
}