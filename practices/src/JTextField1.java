import java.awt.Color;
import java.awt.Font;

import	javax.swing.JFrame;
import	javax.swing.JLabel;
import	javax.swing.JTextField;

public class JTextField1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JLabel jlabelUser=new JLabel("User:");
		JLabel jlabelPassword=new JLabel("Password:");
		JTextField jtextfielduser=new JTextField("User");
		JTextField jtextfieldpassword=new JTextField("Password");
		Font font=new Font("Courier",Font.ITALIC | Font.BOLD,15);

		jframeObject.setTitle("JTextField");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setLayout(null);

		jlabelUser.setBounds(10,20,300,30);
		jlabelPassword.setBounds(10,70,300,30);

		jframeObject.add(jlabelUser);
		jframeObject.add(jlabelPassword);

		jtextfielduser.setBounds(120,20,300,30);
		jtextfieldpassword.setBounds(120,70,300,30);

		jframeObject.add(jtextfielduser);
		jframeObject.add(jtextfieldpassword);

		jtextfielduser.setText("usuario");
		jtextfieldpassword.setText("contraseña");
		jtextfielduser.setForeground(Color.cyan);
		jtextfieldpassword.setBackground(Color.red);
		jtextfielduser.setFont(font);
		jtextfieldpassword.setFont(font);

		jframeObject.setBounds(100,100,500,500);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
