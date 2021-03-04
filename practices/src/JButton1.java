import	javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

import	javax.swing.JButton;

public class JButton1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JButton jbuttonAccept, jbuttonCancel;

		jframeObject.setBounds(100,100,400,400);
		jframeObject.setLocationRelativeTo(null);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
		jframeObject.setTitle("JButton");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setLayout(null);

		jbuttonAccept=new JButton("Accept");
		jbuttonAccept.setBounds(30,310,100,30);

		jbuttonCancel=new JButton("Cancel");
		jbuttonCancel.setBounds(270,310,100,30);

		jframeObject.add(jbuttonAccept);
		jframeObject.add(jbuttonCancel);

		jbuttonAccept.setForeground(Color.blue);
		jbuttonCancel.setBackground(Color.red);

		Font fontObject=new Font("Courier",Font.ITALIC | Font.BOLD,15);
		jbuttonAccept.setFont(fontObject);
	}
}
