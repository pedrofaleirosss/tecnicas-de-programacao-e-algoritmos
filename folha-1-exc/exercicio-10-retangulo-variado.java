import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		int x, y, a, b, c, d, f;
		String e="";
		
		System.out.println("Digite o valor de x.");
		x = leia.nextInt();
		
		System.out.println("Digite o valor de y.");
		y = leia.nextInt();
		
		for(a = 0; a < x; a++){
		    System.out.print("+ ");
		}
		
		f = (x * 2) - 3;
		
		System.out.print("\n");
		
		for(d = 0; d < f; d++){
		    e = e + " ";
		}
		
		for(b = 2; b < y; b++){
		    System.out.println("+" + e + "+");
		}
		
		for(c = 0; c < x; c++){
		    System.out.print("+ ");
		}
	}
}