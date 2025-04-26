import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
	    float y, x;
        float cordenadas[][] = new float[1][2];
		
		System.out.println("Digite o valor de y.");
		y = leia.nextFloat();
		
		System.out.println("Digite o valor de x.");
		x = leia.nextFloat();
		
		cordenadas[0][0] = y;
		cordenadas[0][1] = x;
		
		if(cordenadas[0][0] == 0 && cordenadas[0][1] != 0){
		    System.out.println("Eixo y");
		}
		else if(cordenadas[0][1] == 0 && cordenadas[0][0] != 0){
		    System.out.println("Eixo x");
		}
		else if(cordenadas[0][0] == 0 && cordenadas[0][1] == 0){
		    System.out.println("Origem");
		}
		else if(cordenadas[0][0] > 0 && cordenadas[0][1] < 0){
		    System.out.println("Q4");
		}
		else if(cordenadas[0][0] > 0 && cordenadas[0][1] > 0){
		    System.out.println("Q1");
		}
		else if(cordenadas[0][0] < 0 && cordenadas[0][1] > 0){
		    System.out.println("Q2");
		}
		else{
		    System.out.println("Q3");
		}
	}
}