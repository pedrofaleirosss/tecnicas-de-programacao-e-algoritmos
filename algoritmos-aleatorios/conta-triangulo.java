import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
    int ladoA, ladoB, ladoC;  
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("Escreva o valor do ladoA");
    ladoA = leia.nextInt();
    
    System.out.println("Escreva o valor do ladoB");
    ladoB = leia.nextInt();
    
    System.out.println("Escreva o valor do ladoC");
    ladoC = leia.nextInt();
    
    if (ladoA <= (ladoB+ladoC) && ladoB <= (ladoA+ladoC) && ladoC <= (ladoB+ladoA) ){
    
        if (ladoA==ladoB && ladoB==ladoC){
            System.out.println("Seu triângulo é equilatero");
        }
            
        else if (ladoA!=ladoB && ladoB!=ladoC && ladoC!=ladoA){
            System.out.println("Seu triângulo é escaleno");
        }
                
        else{
            System.out.println("Seu triângulo é isosceles");
        }
    
    }
    
    else{
        System.out.println("Não é um triângulo");
        
    }
    
    }
}