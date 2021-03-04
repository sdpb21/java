import	javax.swing.JRadioButton;
import	javax.swing.JFrame;
import	javax.swing.ButtonGroup;

public class JRadioButton1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JRadioButton radioButton1,radioButton2,radioButton3;
		ButtonGroup buttonGroup;

		jframeObject.setTitle("JRadioButton");
		jframeObject.setLayout(null);

		buttonGroup=new ButtonGroup();

		radioButton1=new JRadioButton("1st option");
		radioButton1.setBounds(10,20,200,30);
		jframeObject.add(radioButton1);
		buttonGroup.add(radioButton1);

		radioButton2=new JRadioButton("2nd option");
		radioButton2.setBounds(10,70,200,30);
		jframeObject.add(radioButton2);
		buttonGroup.add(radioButton2);

		radioButton3=new JRadioButton("3rd option");
		radioButton3.setBounds(10,120,200,30);
		jframeObject.add(radioButton3);
		buttonGroup.add(radioButton3);

		jframeObject.setBounds(100,100,440,500);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
