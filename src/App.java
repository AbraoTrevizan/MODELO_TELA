package Tela; 

import javax.swing.*; // Importa as classes que preciso para a GUI.
import java.awt.*; // Importa classes para layouts.

public class AWTTestSwing { // classe principal
    
    public static void main(String[] args) { 
        
        // cria a janela
        JFrame frame = new JFrame("AWT Test"); 
        
        // Fecha o codigo quando fecha o programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // escolher o tamnaho que sera a janela
        frame.setSize(400, 200); 
        
        
        frame.setLayout(new BorderLayout()); 

        JLabel label1 = new JLabel("Label1"); 
        
        // cria o campo de texto.
        JTextField textField1 = new JTextField(15); 

        // faz um painel que fica em cima 
        JPanel topPanel = new JPanel(); 
        
        // layout de fluxo alinhado
        topPanel.setLayout(new FlowLayout()); 
        
        // faz um rotulo ao painel
        topPanel.add(label1); 
        
        topPanel.add(textField1); 

        // cria o botao primario
        JButton button1 = new JButton("Button 1"); 
        
        // cria o botao secundario
        JButton button2 = new JButton("Button 2"); 
        
        // cria o 3 botao
        JButton button3 = new JButton("Button 3"); 

        // faz o painel para os botoes
        JPanel buttonPanel = new JPanel(); 
        
        // Layout de botoes
        buttonPanel.setLayout(new FlowLayout()); 
        
        // coloca o primeiro botao
        buttonPanel.add(button1); 
        
        // coloca o segundo botao
        buttonPanel.add(button2); 
        
        // coloca o terceiro botao
        buttonPanel.add(button3); 

        // coloca o painel la em cima da janela
        frame.add(topPanel, BorderLayout.NORTH); 
        
        // coloca o  painel de botoes s janela
        frame.add(buttonPanel, BorderLayout.CENTER); 

        // vai exibir a janela
        frame.setVisible(true); 
    }
}
