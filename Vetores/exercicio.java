import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int numeros[] = new int[10];
		int resultados[] = new int[10];
		int B = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int A = 0; A <=9; A++){
		    System.out.println("Digite o número " + (A+1) + ".");
		    numeros[A] = leia.nextInt();
		    
		    if(numeros[A] % 2 != 0){
		        for(B = B; B <= 9; B++){
		            resultados[B] = numeros[A] + 5;
		            break;
		        }
		    }
		    else{
		        for(B = B; B <= 9; B++){
		            resultados[B] = numeros[A] * 5;
		            break;
		        }
		    }
		}
		System.out.println(numeros[A]);
		
		    
	}
}