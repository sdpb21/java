import	javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import	javax.swing.JButton;
import	javax.swing.JPanel;
import javax.swing.border.BevelBorder;


public class JPanel1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JButton button1,button2,button3,button4,button5;
		JPanel jpanelObject;

		jframeObject.setTitle("JPanel");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setLayout(null);

		button1=new JButton("One");
		button2=new JButton("Two");
		button3=new JButton("Three");
		button4=new JButton("Four");
		button5=new JButton("Five");
		button1.setBounds(10,10,50,50);
		button2.setBounds(10,70,50,50);
		button3.setBounds(10,130,50,50);
		button4.setBounds(10,190,50,50);
		button5.setBounds(10,250,50,50);

		jpanelObject=new JPanel();
		//jpanelObject.setLayout(null);
		//jpanelObject.setLayout(new FlowLayout());
		jpanelObject.setLayout(new GridLayout(4,2));
		jpanelObject.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		jpanelObject.setBounds(10,10,180,180);
		jpanelObject.add(button1);
		jpanelObject.add(button2);
		jpanelObject.add(button3);
		jpanelObject.add(button4);
		jpanelObject.add(button5);

		jframeObject.add(jpanelObject);
		jframeObject.setBounds(100,100,220,220);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
