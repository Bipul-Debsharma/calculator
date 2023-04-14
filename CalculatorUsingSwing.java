package com.ty;



	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.Font;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class CalculatorUsingSwing {

		private JFrame frame;
		

		private JTextField textField;
		private JTextField txtCalculatorByBipul;

		double first;
		double second;
		double result;
		String operation;
		String answer;
		
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CalculatorUsingSwing window = new CalculatorUsingSwing();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		
		public CalculatorUsingSwing() {
			initialize();
		}

		
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 309, 464);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.BOLD, 18));
			textField.setBounds(10, 27, 278, 73);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			txtCalculatorByBipul = new JTextField();
			txtCalculatorByBipul.setFont(new Font("Tahoma", Font.BOLD, 12));
			txtCalculatorByBipul.setText("Calculator by bipul");
			txtCalculatorByBipul.setBounds(10, 10, 122, 19);
			frame.getContentPane().add(txtCalculatorByBipul);
			txtCalculatorByBipul.setColumns(10);
			
			JButton btnAc = new JButton("AC");
			btnAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(null);
				}
			});
			btnAc.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAc.setBounds(10, 110, 60, 60);
			frame.getContentPane().add(btnAc);
			
			final JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn7.getText();
					textField.setText(number);
					
				}
			});
			btn7.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn7.setBounds(10, 170, 60, 60);
			frame.getContentPane().add(btn7);
			
			final JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn4.getText();
					textField.setText(number);
					
				}
			});
			btn4.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn4.setBounds(10, 231, 60, 60);
			frame.getContentPane().add(btn4);
			
			final JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn1.getText();
					textField.setText(number);
					
				}
			});
			btn1.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn1.setBounds(10, 293, 60, 60);
			frame.getContentPane().add(btn1);
			
			final JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn0.getText();
					textField.setText(number);
					
				}
			});
			btn0.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn0.setBounds(10, 355, 60, 60);
			frame.getContentPane().add(btn0);
			
			JButton btnBack = new JButton("\uF0E7");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String back=null;
					if (textField.getText().length()>0) {
						StringBuilder str= new StringBuilder(textField.getText());
						str.deleteCharAt(textField.getText().length()-1);
						back= str.toString();
						textField.setText(back);
					}
				}
			});
			btnBack.setFont(new Font("wingdings", Font.BOLD, 17));
			btnBack.setBounds(80, 110, 60, 60);
			frame.getContentPane().add(btnBack);
			
			final JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn8.getText();
					textField.setText(number);
					
				}
			});
			btn8.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn8.setBounds(80, 170, 60, 60);
			frame.getContentPane().add(btn8);
			
			final JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn5.getText();
					textField.setText(number);
					
				}
			});
			btn5.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn5.setBounds(80, 231, 60, 60);
			frame.getContentPane().add(btn5);
			
			final JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn2.getText();
					textField.setText(number);
					
				}
			});
			btn2.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn2.setBounds(80, 293, 60, 60);
			frame.getContentPane().add(btn2);
			
			final JButton btnDot = new JButton(".");
			btnDot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btnDot.getText();
					textField.setText(number);
					
				}
			});
			btnDot.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnDot.setBounds(80, 355, 60, 60);
			frame.getContentPane().add(btnDot);
			
			JButton btnPercent = new JButton("%");
			btnPercent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="%";
				}
			});
			btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnPercent.setBounds(150, 110, 60, 60);
			frame.getContentPane().add(btnPercent);
			
			final JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn9.getText();
					textField.setText(number);
					
				}
			});
			btn9.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn9.setBounds(150, 170, 60, 60);
			frame.getContentPane().add(btn9);
			
			final JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn6.getText();
					textField.setText(number);
					
				}
			});
			btn6.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn6.setBounds(150, 231, 60, 60);
			frame.getContentPane().add(btn6);
			
			final JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number= textField.getText()+btn3.getText();
					textField.setText(number);
					
				}
			});
			btn3.setFont(new Font("Tahoma", Font.BOLD, 10));
			btn3.setBounds(150, 293, 60, 60);
			frame.getContentPane().add(btn3);
			
			JButton btnEqual = new JButton("=");
			btnEqual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 
					String answer;
					second=Double.parseDouble(textField.getText());
					if (operation=="+") {
						result=first+second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if (operation=="-") {
						result=first-second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if (operation=="*") {
						result=first*second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if (operation=="/") {
						result=first/second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
					else if (operation=="%") {
						result=first%second;
						answer=String.format("%.2f", result);
						textField.setText(answer);
					}
				}
			});
			btnEqual.setFont(new Font("Tahoma", Font.BOLD, 62));
			btnEqual.setBounds(150, 355, 131, 60);
			frame.getContentPane().add(btnEqual);
			
			JButton btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="/";
				}
			});
			btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
			btnDiv.setBounds(221, 110, 60, 60);
			frame.getContentPane().add(btnDiv);
			
			JButton btnMulti = new JButton("*");
			btnMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="*";
				}
			});
			btnMulti.setFont(new Font("Tahoma", Font.BOLD, 25));
			btnMulti.setBounds(220, 170, 60, 60);
			frame.getContentPane().add(btnMulti);
			
			JButton btnMin = new JButton("-");
			btnMin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="-";
				}
			});
			btnMin.setFont(new Font("Tahoma", Font.BOLD, 25));
			btnMin.setBounds(220, 231, 60, 60);
			frame.getContentPane().add(btnMin);
			
			JButton btnplus = new JButton("+");
			btnplus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					first=Double.parseDouble(textField.getText());
					textField.setText("");
					operation="+";
				}
			});
			btnplus.setFont(new Font("Tahoma", Font.BOLD, 25));
			btnplus.setBounds(220, 293, 60, 60);
			frame.getContentPane().add(btnplus);
		}
	}


