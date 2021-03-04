import	javax.swing.JFrame;

import	java.awt.BorderLayout;
//import	java.awt.Frame;

import	javax.swing.JButton;
//import	java.awt.Graphics;

public class jframe1 {
	public static void main(String[] args) {
		JFrame jframeObject = new JFrame("txulio");
		JButton button=new JButton("txulio");	// definición del componente para el método add
		jframeObject.setSize(500,500);
		jframeObject.setVisible(true);
		jframeObject.setLocation(100, 10);
		//jframeObject.action(null, jframeObject);
		//jframeObject.add(button);						// .add(Component comp)
		jframeObject.add(button,BorderLayout.NORTH);	// .add(Component comp,Object constraints)
		//jframeObject
		//jframeObject.setExtendedState(Frame.MAXIMIZED_BOTH);
		//jframeObject.setLocationRelativeTo(jframeObject.getParent());
		//jframeObject.setLocationRelativeTo(null);
	}
}
