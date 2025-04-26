import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Random sorte = new Random();
		
		int n1, n2, n3, n4, n5, n6, temp;
		
		for(int sort=1; sort==1;){
		    n1 = sorte.nextInt(100);
		    n2 = sorte.nextInt(100);
		    n3 = sorte.nextInt(100);
		    n4 = sorte.nextInt(100);
		    n5 = sorte.nextInt(100);
		    n6 = sorte.nextInt(100);
		    
		if(n1 == n2 || n1 == n3 || n1 == n4 || n1 == n5 || n1 == n6){
	            sort=1;
	        }else if(n2 == n3 || n2 == n4 || n2 == n5 || n2 == n6){
	            sort=1;
	        }else if(n3 == n4 || n3 == n5 || n3 == n6){
	            sort=1;
	        }else if(n4 == n5 || n4 == n6){
	            sort=1;
	        }else if(n5 == n6){
	            sort=1;
	        }else{
	            System.out.println(n1);
	            System.out.println(n2);
    	            System.out.println(n3);
	            System.out.println(n4);
	            System.out.println(n5);
    	            System.out.println(n6);
    	            sort++;
	        }
	    }
	}
}