
package com.mycompany.adadad;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Adadad {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo JTestField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel label = new JLabel("Digite seu nome");
        panel.add(label);
        
        JTextField textField = new JTextField(20);
        panel.add(textField);
        
        JButton button = new JButton("Saudação");
        panel.add(button);
        
        JLabel saldacaoLabel = new JLabel();
        panel.add(saldacaoLabel);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
 String nome = textField.getText();
                
                if(!nome.isEmpty()){
                    saldacaoLabel.setText("Ola, " + nome + "!");
                    
                }else{
                    saldacaoLabel.setText("Por favor, digite seu nome");
                }
            }
            
        });
        frame.setVisible(true);
    }
}
