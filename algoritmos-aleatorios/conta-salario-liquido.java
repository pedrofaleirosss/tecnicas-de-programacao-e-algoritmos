import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
        double VH, HT, SB, PD, TD,SL;
    	
        Scanner leia = new Scanner(System.in);
    	 
        System.out.println("Digite o valor hora aula");
        VH = leia.nextDouble();
    
        System.out.println("Digite as horas trabalhadas");
        HT = leia.nextDouble();
    
        SB = VH * HT;
        
        System.out.println("Seu salário bruto é: R$ " + (SB));
        
        PD = 0;
        
        if(SB>1250 && SB<2500) PD = 7;
    
        TD = (PD / 100) * SB;
        SL = SB - TD;
    
        System.out.println("Seu salário líquido é: R$ " + (SL));
        
     /*   if(SL > 50)System.out.println("Você é rico!");
        if(SL < 50)System.out.println("Você é pobre!");
        if(SL == 50)System.out.println("Você está na média!"); */
	}
}
