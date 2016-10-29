package mysmallProjects;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AwtHello implements ActionListener{

	JFrame frame;
	JLabel label1, label2, label3;
	JTextField txt1, txt2, txt3;
	JButton btn1,btn2;

	private void calc() {
		frame = new JFrame("Hare krishna");
		
		label1 = new JLabel("Give Input 1");
		label2 = new JLabel("Give Input 2");
		label3 = new JLabel("Result");
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		btn1 = new JButton("Add");
		btn2 = new JButton("ReSet");
		
		label1.setBounds(30,40,80,30);
		label2.setBounds(30,75,80,30);
		label3.setBounds(30,105,80,30);
		txt1.setBounds(130,40,80,30);
		txt2.setBounds(130,75,80,30);
		txt3.setBounds(130,105,80,30);
		btn1.setBounds(210,120,80,80);
		btn2.setBounds(180,120,80,80);
		

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(txt1);
		frame.add(txt2);
		frame.add(txt3);
		

		frame.add(btn1);
		frame.add(btn2);
		// frame.pack();
		frame.setVisible(true);
		frame.setSize(300, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	

	public static void main(String[] args) {
		AwtHello ah = new AwtHello();
		ah.calc();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1){
			txt3.setText(txt1.getText() + txt2.getText());
		}
		if(e.getSource()==btn2){
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
		}
	}

}
