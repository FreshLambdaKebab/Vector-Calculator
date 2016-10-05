package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameWork implements ActionListener{

	//window
	private JFrame frame;
	private boolean done;
	
	//input values
	private JTextField number1;
	private JTextField number2;
	private JTextField answerText;
	
	//buttons
	JButton additionButton = new JButton("+");
	JButton subtractionButton = new JButton("-");
	JButton multiplicationButton = new JButton("*");
	JButton divisionButton = new JButton("/");
	JLabel answerLabel = new JLabel("The Answer is: ");

	public FrameWork() {
		done = false;
		
		
	}

	public void run(){
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		number1 = new JTextField();
		number1.setBounds(10, 29, 183, 32);
		frame.getContentPane().add(number1);
		number1.setColumns(10);
		
		number2 = new JTextField();
		number2.setColumns(10);
		number2.setBounds(10, 72, 183, 32);
		frame.getContentPane().add(number2);			
			
		additionButton.setBounds(10, 115, 41, 32);
		frame.getContentPane().add(additionButton);
		
		subtractionButton.setBounds(56, 115, 41, 32);
		frame.getContentPane().add(subtractionButton);
					
		multiplicationButton.setBounds(104, 115, 41, 32);
		frame.getContentPane().add(multiplicationButton);
		
		divisionButton.setBounds(152, 115, 41, 32);
		frame.getContentPane().add(divisionButton);
		
		answerText = new JTextField();
		answerText.setBounds(498, 207, 181, 32);
		frame.getContentPane().add(answerText);
		answerText.setColumns(10);
		
		answerLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		answerLabel.setBounds(372, 205, 116, 35);
		frame.getContentPane().add(answerLabel);
		
		createActionListeners();
		
	}
	
	private void createActionListeners(){
		//set action listeners
		additionButton.addActionListener((ActionListener) this);
		subtractionButton.addActionListener((ActionListener) this);
		multiplicationButton.addActionListener((ActionListener) this);
		divisionButton.addActionListener((ActionListener) this);
	}
	
	private void update(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		    //add and get an answer for the two inputed values
			int num1,num2,ans;
			
			if(src == additionButton)
			{
				num1 = Integer.parseInt(number1.getText());
				num2 = Integer.parseInt(number2.getText());
				
				ans = num1+num2;
				
				answerText.setText(Integer.toString(ans));
		    }
			
			
			if(src == subtractionButton){
				num1 = Integer.parseInt(number1.getText());
				num2 = Integer.parseInt(number2.getText());
				
				ans = num1-num2;
				
				answerText.setText(Integer.toString(ans));
			}
			
			if(src == multiplicationButton){
				num1 = Integer.parseInt(number1.getText());
				num2 = Integer.parseInt(number2.getText());
				
				ans = num1*num2;
				
				answerText.setText(Integer.toString(ans));
			}
			
			if(src == divisionButton){
				num1 = Integer.parseInt(number1.getText());
				num2 = Integer.parseInt(number2.getText());
				
				ans = num1/num2;
				
				answerText.setText(Integer.toString(ans));
			}
			
		}
     
}
