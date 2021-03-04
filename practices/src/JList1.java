import	javax.swing.JFrame;
import	javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import	javax.swing.JLabel;
import	javax.swing.JList;
import javax.swing.BorderFactory;
import	javax.swing.DefaultListModel;

public class JList1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JScrollPane jscrollpaneObject;
		JLabel jlabelObject;
		String languages[];
		JList jlistObject;
		DefaultListModel defaultlistmodelObject=new DefaultListModel();

		jframeObject.setTitle("JList");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setLayout(null);
		//jframeObject.setForeground(Color.red);// no sirve

		jlabelObject=new JLabel("Languages:");
		jlabelObject.setBounds(10,10,300,30);
/*
		languages=new String[5];
		languages[0]="Java";
		languages[1]="C++";
		languages[2]="C#";
		languages[3]="Pascal";
		languages[4]="Cobol";
*/
		languages=new String[7];
		languages[0]="Java";
		languages[1]="C++";
		languages[2]="C#";
		languages[3]="Pascal";
		languages[4]="Cobol";
		languages[5]="JavaScript";
		languages[6]="HTML";

		jlistObject=new JList(languages);
		jlistObject.setBounds(100,320,320,120);
		jlistObject.setListData(languages);

		jscrollpaneObject=new JScrollPane(jlistObject);
		jscrollpaneObject.setBounds(100,10,320,120);

		jframeObject.add(jscrollpaneObject);
		jframeObject.add(jlabelObject);

		defaultlistmodelObject.addElement("php");
		defaultlistmodelObject.addElement("Asp");
		defaultlistmodelObject.addElement("JavaScript");
		jlistObject.setModel(defaultlistmodelObject);
		defaultlistmodelObject.addElement("html");
		defaultlistmodelObject.addElement("CSS");
		defaultlistmodelObject.addElement("Java");
		defaultlistmodelObject.addElement("Fortran");
		defaultlistmodelObject.addElement("Pascal");
		defaultlistmodelObject.addElement("Java");

		jlistObject.setSelectedIndex(0);
		jlistObject.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

		System.out.println("Elements: "+defaultlistmodelObject.size());

		defaultlistmodelObject.insertElementAt("Pos 1",1);
		defaultlistmodelObject.add(5,"Pos 5");

		System.out.println("Elemento en posición 3: "+defaultlistmodelObject.getElementAt(3));
		System.out.println("Encontró Asp en: "+defaultlistmodelObject.indexOf("Asp"));
		System.out.println("Encontró Java en: "+defaultlistmodelObject.lastIndexOf("Java"));

		//defaultlistmodelObject.remove(0);
		//defaultlistmodelObject.removeElement("Java");
		//defaultlistmodelObject.clear();
		//defaultlistmodelObject.removeAllElements();

		jframeObject.setBounds(100,100,500,600);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
