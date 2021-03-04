import java.awt.BorderLayout;

import	javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import	javax.swing.JTable;
import	javax.swing.JScrollPane;

public class JTable1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		DefaultTableModel dtmObject;
		TableModel tableModelObject;
		Object[][] Data= {{"","","","","","",""},
						  {"","","","","","",""},
						  {"","","","","","",""},
						  {"","","","","","",""},
						  {"","","","","","",""},
						  {"","","","","","",""}};
		String[] titles= {"Dom","Lun","Mar","Mie","Jue","Vie","Sab"};
		JTable jtableObject=new JTable(Data,titles);

		jframeObject.setTitle("JTable");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jtableObject.setCellSelectionEnabled(true);

		JScrollPane jscrollpaneObject=new JScrollPane(jtableObject);
		jscrollpaneObject.setBounds(0,0,400,150);

		//jframeObject.getContentPane().add(jscrollpaneObject,BorderLayout.CENTER);
		jframeObject.add(jscrollpaneObject,BorderLayout.CENTER);

		tableModelObject=jtableObject.getModel();
		tableModelObject.setValueAt("Hoy",1,1);
		tableModelObject.setValueAt("123",1,2);

		System.out.println("Valor en 1,1: "+tableModelObject.getValueAt(1,1));
		System.out.println("Columnas: "+tableModelObject.getColumnCount());
		System.out.println("Renglones: "+tableModelObject.getRowCount());
		System.out.println("Nombre de la columna 6: "+tableModelObject.getColumnName(6));

		dtmObject=new DefaultTableModel(Data,titles);// para poder agregar columnas y otras cosas no permitidas

		jtableObject.setModel(dtmObject);

		dtmObject.addColumn("Extra");
		//dtmObject.setColumnCount(6);
		dtmObject.setColumnCount(8);

		Object[] newRow= {"Dom","Lun","Mar","Mie","Jue","Vie","Ex1","Ex2"};
		dtmObject.addRow(newRow);
		dtmObject.setValueAt("7",2,2);
		dtmObject.setColumnIdentifiers(newRow);

		jframeObject.setBounds(100,100,440,500);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
