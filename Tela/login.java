
package aulatpa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaLogin extends JFrame{
    
    public TelaLogin(){
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationRelativeTo(null);
        setLayout(null);
        
        
        
        
        Label usuario = new Label("Usuário:");
        usuario.setBounds(50, 50, 70, 20);
        usuario.setFont (new Font ("Verdana", Font.BOLD, 15));
        usuario.setForeground(Color.black);
        add(usuario);
        
        TextField textuser = new TextField();
        textuser.setBounds(120, 50, 200, 25);
        add(textuser);
        
        
        Label senha = new Label("Senha:");
        senha.setBounds(50, 100, 70, 20);
        senha.setFont (new Font ("Verdana", Font.BOLD, 15));
        senha.setForeground(Color.black);
        add(senha);
        
        TextField textpassword = new TextField();
        textpassword.setBounds(120, 100, 200, 25);
        add(textpassword);
        
        
        
        Button logar = new Button("Logar");
        logar.setBounds(350, 47, 200, 75);
        add(logar);
        
        Button cancelar = new Button("Cancelar");
        cancelar.setBounds(350, 140, 200, 75);
        add(cancelar);
        
        Button lembrar = new Button("Lembrar Senha");
        lembrar.setBounds(350, 233, 200, 75);
        add(lembrar);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
       new TelaLogin();
    }
}