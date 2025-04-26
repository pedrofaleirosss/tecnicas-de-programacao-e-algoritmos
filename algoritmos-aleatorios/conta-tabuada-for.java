import java.util.Scanner;
public class Main

{
	public static void main(String[] args){
	    
	    Scanner leia = new Scanner(System.in);
	    
	    int numero, resultado, conta;
	    
	    System.out.println("Digite um número.");
	    numero = leia.nextInt();
	    
	    for(conta=0; conta<11; conta++){
            	resultado = numero * conta;
            	System.out.println(""+numero+"x"+conta+"="+resultado+"");
	    }
	    
	    System.out.println("Fim da Tabuada");
    }
}