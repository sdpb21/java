import	javax.swing.JLabel;
import	javax.swing.JFrame;

public class Jlabel1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JLabel jlabelObject1=new JLabel("Primera etiqueta.");
		JLabel jlabelObject2=new JLabel("Segunda etiqueta.");
		JLabel jlabelObject3=new JLabel("Tercera etiqueta.");
		jframeObject.setTitle("soy gay");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setBounds(100, 100, 450, 300);
		jframeObject.setLayout(null);
		
		jlabelObject1.setBounds(10,20,300,30);
		jframeObject.add(jlabelObject1);
		jlabelObject2.setBounds(10,100,300,30);
		jframeObject.add(jlabelObject2);
		jframeObject.setVisible(true);
		jframeObject.setBounds(250,150, 300, 300);
		jlabelObject3.setBounds(10,180,150,50);
		jframeObject.add(jlabelObject3);
		//jlabelObject
	}
}
