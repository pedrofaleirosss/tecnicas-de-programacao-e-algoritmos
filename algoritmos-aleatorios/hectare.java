import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
	double VH, AH, TP, PD, DC, VF;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o tipo do hectare.");
	TP = leia.nextDouble();
	
	System.out.println("Digite a área.");
	AH = leia.nextDouble();
	
	if(TP == 1){
	    VH = 500;
	    
	    if(AH <= 1000){
	    PD = 2/100;
	}else if(AH > 1000 && AH <= 5000){
	    PD = 5/100;
	}else{
	    PD = 10/100;
	}
	    
	    
	}else if(TP == 2){
	    VH = 350;
	    
	    if(AH <= 1000){
	    PD = 2/100;
	}else if(AH > 1000 && AH <= 5000){
	    PD = 5/100;
	}else{
	    PD = 10/100;
	}
	    
	    
	}else{
	    VH = 150;
	    
	    if(AH <= 1000){
	    PD = 2/100;
	}else if(AH > 1000 && AH <= 5000){
	    PD = 5/100;
	}else{
	    PD = 10/100;
	}
	    
	}
	
	VH * AH * PD = DC;
	VH * AH - DC = VF;
	
	System.out.println("O tipo do hectare é:" + TP);
	System.out.println("A área da fazenda é:" + AH);
	System.out.println("O valor a pagar é:" + VF);
	
	}
}