import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		float total, brancos, nulos, pvalidos, pbrancos, pnulos;
		
		System.out.println("Digite o número total de eleitores.");
		total = leia.nextFloat();
		
		System.out.println("Digite o número de votos brancos.");
		brancos = leia.nextFloat();
		
		System.out.println("Digite o número de votos nulos.");
		nulos = leia.nextFloat();
		
        	pbrancos = (brancos / total) * 100;
		pnulos = (nulos / total) * 100;
		pvalidos = 100 - pbrancos - pnulos;
		
		System.out.println("A porcentagem de votos brancos é: " + pbrancos + "%");
		System.out.println("A porcentagem de votos nulos é: " + pnulos + "%");
		System.out.println("A porcentagem de votos válidos é: " + pvalidos + "%");
	}
}