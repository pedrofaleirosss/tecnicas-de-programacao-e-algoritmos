package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Olá, escolha a operação.\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão"));
        int valores = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos valores?","Pergunta",3));
        float numero[] = new float[10];
        float resultado = 0;
        
        
        if(valores > 10){
            JOptionPane.showMessageDialog(null,"Valores demais!" ,"Aviso",2);
            System.exit(0);
        }

	for(int x=0; x<valores; x++){
            numero[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
        }

        switch(opcao){
            case 1:
                for(int x=0; x<valores; x++){
        		resultado = resultado + numero[x];
                }
                JOptionPane.showMessageDialog(null,"O resultado é " + resultado ,"Mensagem",1);
                break;
            case 2:
                for(int x=0; x<valores; x++){
                    if(x==0){
                        resultado = numero[x];
                    }
                    if(x!=0){
                        resultado = resultado - numero[x];
                    }
                }
                JOptionPane.showMessageDialog(null,"O resultado é " + resultado ,"Mensagem",1);
                break;
            case 3:
                for(int x=0; x<valores; x++){
                    if(x==0){
                        resultado = 1;
                    }
                    resultado = resultado * numero[x];
                }
                JOptionPane.showMessageDialog(null,"O resultado é " + resultado ,"Mensagem",1);
                break;
            case 4:
                for(int x=0; x<valores; x++){
                    if(x==0){
                        resultado = numero[x];
                    }
                    if(x!=0){
                        resultado = resultado / numero[x];
                    }
                }
                JOptionPane.showMessageDialog(null,"O resultado é " + resultado ,"Mensagem",1);
                break;
        }
    }
}
