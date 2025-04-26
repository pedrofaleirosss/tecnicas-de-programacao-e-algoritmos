package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Olá, escolha a operação.\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão"));
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número."));
        int resultado;
        
        switch(opcao){
            case 1:
                resultado = n1+n2;
                JOptionPane.showMessageDialog(null,n1 + " + " + n2 + " = " + resultado,"Mensagem",1);
                break;
            case 2:
                resultado = n1-n2;
                JOptionPane.showMessageDialog(null,n1 + " - " + n2 + " = " + resultado,"Mensagem",1);
                break;
            case 3:
                resultado = n1*n2;
                JOptionPane.showMessageDialog(null,n1 + " x " + n2 + " = " + resultado,"Mensagem",1);
                break;
            case 4:
                resultado = n1/n2;
                JOptionPane.showMessageDialog(null,n1 + " / " + n2 + " = " + resultado,"Mensagem",1);
                break;
        }
    }
}