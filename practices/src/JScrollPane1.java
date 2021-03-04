import	javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.BorderFactory;
import	javax.swing.JFrame;
import	javax.swing.JScrollPane;

public class JScrollPane1 {
	public static void main(String[] args) {
		JTextArea jtextareaObject=new JTextArea("");
		JFrame jframeObject=new JFrame();
		JScrollPane jscrollpaneObject;

		jframeObject.setTitle("JTextArea");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setLayout(null);
		//jframeObject.setForeground(Color.red);// no sirve

		jtextareaObject.setBounds(10,150,410,250);
		jtextareaObject.setText("Capture your comments");
		jtextareaObject.setEditable(true);
		jtextareaObject.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

		//jframeObject.add(jtextareaObject);

		jtextareaObject.setForeground(Color.darkGray);
		jtextareaObject.setBackground(Color.green);

		jscrollpaneObject=new JScrollPane(jtextareaObject);
		jscrollpaneObject.setBounds(10,150,410,300);

		jframeObject.add(jscrollpaneObject);

		jframeObject.setBounds(100,100,500,500);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
