import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
		
		int x, y, x2;
		
		for(x = 0; x < 60; x++){
		    System.out.print("+");
		    
		    if(x == 59){
		        System.out.println(" "); //coloquei isso para não pular uma linha, acho q estava bugando
		    }
		}
		
		for(y = 0; y < 8; y++){
		    System.out.println("+                                                          +");
		}
		
		for(x2 = 0; x2 < 60; x2++){
		    System.out.print("+");
		}
	}
}