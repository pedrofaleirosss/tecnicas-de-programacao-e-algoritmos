import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double tp, área, vt;
		
		System.out.println("digite o tipo");
		tp = read.nextFloat();
		
		System.out.println("digite a área em hectáres");
		área = read.nextFloat();
		
	    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
	 
    	if (tp==1){
    	    if (área<=1000){
    	        vt= 500*área;
    	        vt= vt-(vt*0.02);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt));
    	    }else if (área<=5000){
    	        vt= 500*área;
    	        vt= vt-(vt*0.05);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt)); 
    	    }else if (área>5000){
    	        vt= 500*área;
    	        vt= vt-(vt*0.10);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt)); 
    	    }
        
        
        }else if (tp==2){
          if (área<=1000){
           vt= 350*área;
    	        vt= vt-(vt*0.02);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt));
    	    }else if (área<=5000){
    	        vt= 350*área;
    	        vt= vt-(vt*0.05);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt)); 
    	    }else if (área>5000) {
    	        vt= 350*área;
    	        vt= vt-(vt*0.10);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt)); 
    	   
}
    		
        }else if (tp==3){
          if (área<=1000){
           vt= 150*área;
    	        vt= vt-(vt*0.02);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt));
    	    }else if (área<=5000){
    	        vt= 150*área;
    	        vt= vt-(vt*0.05);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt)); 
    	    }else if (área>5000) {
    	        vt= 150*área;
    	        vt= vt-(vt*0.10);
    	        System.out.println(" o valor total a ser pago será " + df.format(vt)); 
    	   
}
	}
}
}	
