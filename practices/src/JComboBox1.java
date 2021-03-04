import	javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.BorderFactory;
import	javax.swing.JFrame;
import	javax.swing.JScrollPane;
import	javax.swing.JComboBox;

public class JComboBox1 {
	public static void main(String[] args) {
		JTextArea jtextareaObject=new JTextArea("");
		JFrame jframeObject=new JFrame();
		JScrollPane jscrollpaneObject;
		JComboBox jcomboboxObject=new JComboBox();

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

		jcomboboxObject.setBounds(50,460,180,20);
		jcomboboxObject.addItem("localhost");
		jcomboboxObject.addItem("190.170.130.186");
		jcomboboxObject.addItem("www.facebook.com");
		jcomboboxObject.setSelectedIndex(-1);// aquí va el índice del elemento seleccionado por defecto
		//jcomboboxObject.removeItemAt(0);
		jcomboboxObject.setForeground(Color.white);
		jcomboboxObject.setBackground(Color.black);
		//jcomboboxObject.setVisible(false);
		//jcomboboxObject.enable(false);

		jframeObject.add(jcomboboxObject);

		jframeObject.setBounds(100,100,500,600);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
