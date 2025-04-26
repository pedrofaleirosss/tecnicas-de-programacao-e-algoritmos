import java.util.Scanner;
public class Main

 {
	public static void main(String[] args){
	    
	    Scanner leia = new Scanner(System.in);
	    
	    int numero, resultado, conta=0;
	   
	    System.out.println("Digite um número.");
	    numero = leia.nextInt();
	    
	    while(conta<11){
	        resultado = numero * conta;
	        System.out.println(""+numero+"x"+conta+"="+resultado+"");
	        conta++;
	    }
	    
	    System.out.println("Fim da Tabuada");
    }
}