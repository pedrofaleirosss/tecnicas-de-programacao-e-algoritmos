
package aulinha_pre_prova;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Aulinha_pre_prova extends JFrame{

    public Aulinha_pre_prova(){
        setLayout(new FlowLayout());
        setSize(250,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        Container c = getContentPane();
        c.setBackground(Color.PINK);
        
        
        JLabel usuario = new JLabel("Usuário:");
        add(usuario);
        
        JTextField txtusuario = new JTextField(15);
        add(txtusuario);
        
        
        JLabel senha = new JLabel("Senha:   ");
        add(senha);
        
        JPasswordField txtsenha = new JPasswordField(15);
        add(txtsenha);
        
        
        Button cancelar = new Button("Cancelar");
        add(cancelar);
        
        Button logar = new Button("  Logar  ");
        add(logar);
        
        logar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if(txtusuario.getText().equals("Pedro") && String.valueOf(txtsenha.getPassword()).equals("12319")){
                    setVisible(false);
                    new TelaPrincipal();
                }else{
                   JOptionPane.showMessageDialog(null, "Se lascou!");
                   System.exit(0);
                }
            }
        });
        
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Aulinha_pre_prova();
            }
        });
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new Aulinha_pre_prova();
    }
}
