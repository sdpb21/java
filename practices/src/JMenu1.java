import java.awt.event.KeyEvent;

import	javax.swing.JFrame;
import	javax.swing.JMenuBar;
import	javax.swing.JMenu;
import	javax.swing.JMenuItem;
import	javax.swing.JSeparator;
import	javax.swing.KeyStroke;

public class JMenu1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JMenuBar jmenubarPrincipal;
		JMenu jmenuSystem,jmenuXtra;
		JMenuItem jmenuitemInput,jmenuitemOutput,jmenuitemConfig,jmenuitemXtra1,jmenuitemXtra2;

		jframeObject.setTitle("JMenu");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jmenubarPrincipal=new JMenuBar();

		jframeObject.setJMenuBar(jmenubarPrincipal);

		jmenuSystem=new JMenu("System");

		jmenubarPrincipal.add(jmenuSystem);

		jmenuitemInput=new JMenuItem("Input");

		jmenuSystem.add(jmenuitemInput);

		jmenuitemOutput=new JMenuItem("Output");

		jmenuSystem.add(jmenuitemOutput);

		jmenuitemConfig=new JMenuItem("Configuration");

		jmenuSystem.add(jmenuitemConfig);
		jmenuSystem.add(new JSeparator());

		jmenuXtra=new JMenu("Extra");

		jmenuSystem.add(jmenuXtra);

		jmenuitemXtra1=new JMenuItem("Xtra1");
		jmenuXtra.add(jmenuitemXtra1);
		jmenuitemXtra2=new JMenuItem("Xtra2");
		jmenuXtra.add(jmenuitemXtra2);
		//jmenuitemConfig.add(jmenuitemXtra2);

		KeyStroke f5=KeyStroke.getKeyStroke(KeyEvent.VK_F5,KeyEvent.SHIFT_DOWN_MASK);
		KeyStroke KeyScape=KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE,KeyEvent.CTRL_DOWN_MASK);
		jmenuitemXtra1.setAccelerator(f5);
		jmenuitemXtra2.setAccelerator(KeyScape);

		jframeObject.setBounds(100,100,440,500);
		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
	}
}
