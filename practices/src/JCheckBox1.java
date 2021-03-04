import	javax.swing.JFrame;
import	javax.swing.JCheckBox;

public class JCheckBox1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JCheckBox bitacora,mensajes;

		bitacora=new JCheckBox("Grabar en la bitácora");
		bitacora.setBounds(10,10,180,30);
		bitacora.setEnabled(false);
		jframeObject.add(bitacora);

		mensajes=new JCheckBox("Mensajes de éxito");
		mensajes.setBounds(10,50,180,30);
		//mensajes.setLabel("Modificado");
		mensajes.setSelected(true);
		jframeObject.add(mensajes);

		jframeObject.setTitle("JCheckBox");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setLayout(null);
		jframeObject.setBounds(100,100,440,500);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
