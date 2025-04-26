import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		double horas, valorhora, extras = 0, valorextra = 0, total;
		
		System.out.println("Digite as horas trabalhadas.");
		horas = leia.nextDouble();
		
		System.out.println("Digite o valor hora.");
		valorhora = leia.nextDouble();
		
		if(horas > 40){
		    extras = horas - 40;
		    valorextra = valorhora + (valorhora * 0.50);
		}
		
		total = ((horas-extras) * valorhora) + (extras * valorextra);
		
		System.out.println("O salário final é R$" + total);
	}
}