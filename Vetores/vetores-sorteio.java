import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Random sorteio = new Random();
		
		int desena1[] = new int[6];
		int desena2[] = new int[6];
		int desena3[] = new int[6];
		
    	for(int i=0; i<6; i++){
    		desena1[i] = sorteio.nextInt(60);
		}
		for(int i=0; i<6; i++){
    		desena2[i] = sorteio.nextInt(60);
		}
		for(int i=0; i<6; i++){
    		desena3[i] = sorteio.nextInt(60);
		}
		
		System.out.println("Desena 1:");
		for(int x=0; x<6; x++){
		    System.out.println(desena1[x]);
		}
		System.out.println("Desena 2:");
		for(int x=0; x<6; x++){
		    System.out.println(desena2[x]);
		}
		System.out.println("Desena 3:");
		for(int x=0; x<6; x++){
		    System.out.println(desena3[x]);
		}
	}
}