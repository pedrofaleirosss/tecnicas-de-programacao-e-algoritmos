import java.util.Scanner;
import java.text.DecimalFormat;
public class Main

 {
	public static void main(String[] args){
	    
	    Scanner leia = new Scanner(System.in);
	    
	    double peso, altura, altura2, resultado;
	    
	    System.out.println("Digite seu peso.");
	    peso = leia.nextDouble();
	    
	    System.out.println("Digite sua altura.");
	    altura = leia.nextDouble();
	    
	    altura2 = altura * altura;
	    resultado = peso/altura2;
	    
	   System.out.println("Seu imc é de "+resultado);
	    
	        if(resultado < 18.5){
	            System.out.println("Você está abaixo do peso normal.");
	        }
	        else if(resultado >= 18.5 && resultado < 24.9){
	            System.out.println("Seu peso é normal.");
	        }
	        else if(resultado >= 25 && resultado < 29.9){
	            System.out.println("Você está com obesidade grau I");
	        }
	        else{
	            System.out.println("Você está com muita obesidade.");
	        }
	}
 }	    
	    