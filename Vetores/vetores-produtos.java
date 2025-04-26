import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		String produtos[] = new String[10];
		String validade[] = new String[10];
		Double vprodutos[] = new Double[10];
		Double vdescontos[] = new Double[10];
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0; i<10; i++){
		    System.out.println("Qual produto?");
		    produtos[i] = leia.next();
		    
		    System.out.println("Qual valor?");
		    vprodutos[i] = leia.nextDouble();
		    
		    System.out.println("Qual é a data de validade?");
		    validade[i] = leia.next();
		}
		for(int y=0; y<10; y++){
		    if(vprodutos[y] <= 50){
		        vdescontos[y] = vprodutos[y] - (vprodutos[y] * 0.02);
		    }
		    else if(vprodutos[y] > 50 && vprodutos[y] <= 70){
		        vdescontos[y] = vprodutos[y] - (vprodutos[y] * 0.05);
		    }
		    else{
		        vdescontos[y] = vprodutos[y] - (vprodutos[y] * 0.10);
		    }
		}
		for(int x=0; x<10; x++){
		    System.out.println(produtos[x] + "custava R$" + vprodutos[x] + ", com desconto ficou R$" + vdescontos[x] + " e a data de validade é: " + validade[x]);
		}
	}
}