import	javax.swing.JFrame;
import	javax.swing.JLabel;
import	javax.swing.JComboBox;
import	javax.swing.JButton;
import	java.awt.event.ActionEvent;
import	java.awt.event.ActionListener;
import	java.awt.Color;

public class Events6 {
static JButton jbuttonObject;
static JComboBox jcombobox1,jcombobox2,jcombobox3;
static JFrame jframeObject=new JFrame();
	public static void main(String[] args) {
		JLabel jlabel1,jlabel2,jlabel3;

		jframeObject.setTitle("Events 6");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jlabel1=new JLabel("Red:");
		jlabel1.setBounds(10,10,100,30);
		jframeObject.add(jlabel1);

		jlabel2=new JLabel("Green:");
		jlabel2.setBounds(10,50,100,30);
		jframeObject.add(jlabel2);

		jlabel3=new JLabel("Blue:");
		jlabel3.setBounds(10,90,100,30);
		jframeObject.add(jlabel3);

		jcombobox1=new JComboBox();
		jcombobox1.setBounds(120,10,50,30);

		int f;
		for(f=0;f<=255;f++) {
			jcombobox1.addItem(String.valueOf(f));
		}
		jframeObject.add(jcombobox1);

		jcombobox2=new JComboBox();
		jcombobox2.setBounds(120,50,50,30);
		for(f=0;f<=255;f++) {
			jcombobox2.addItem(String.valueOf(f));
		}
		jframeObject.add(jcombobox2);

		jcombobox3=new JComboBox();
		jcombobox3.setBounds(120,90,50,30);
		for(f=0;f<=255;f++) {
			jcombobox3.addItem(String.valueOf(f));
		}
		jframeObject.add(jcombobox3);

		jbuttonObject=new JButton("Fix color");
		jbuttonObject.setBounds(10,130,100,30);
		jframeObject.add(jbuttonObject);
		jbuttonObject.addActionListener(new buttonListener3());

		jframeObject.setResizable(false);
		jframeObject.setBounds(100,100,400,400);
		jframeObject.setVisible(true);
	}
}
class buttonListener3 extends Events6 implements ActionListener{
	public void actionPerformed(ActionEvent sp) {
		if(sp.getSource()==jbuttonObject) {
			String cad1=(String)jcombobox1.getSelectedItem();
			String cad2=(String)jcombobox2.getSelectedItem();
			String cad3=(String)jcombobox3.getSelectedItem();

			int red=Integer.parseInt(cad1);
			int green=Integer.parseInt(cad2);
			int blue=Integer.parseInt(cad3);

			Color color1=new Color(red,green,blue);
			jbuttonObject.setBackground(color1);
			//jframeObject.setForeground(color1);
		}
	}
}