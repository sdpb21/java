import	javax.swing.JFrame;
import	javax.swing.JMenuBar;
import	javax.swing.JMenu;
import	javax.swing.JMenuItem;
import	java.awt.event.ActionEvent;
import	java.awt.event.ActionListener;
import	java.awt.Color;

public class Events4 {
static JMenuItem jmenuitem640,jmenuitem1024,jmenuitemRed,jmenuitemGreen;
static JFrame jframeObject=new JFrame();

	public static void main(String[] args) {
		JMenuBar jmenubarPrincipal=new JMenuBar();
		JMenu jmenuOptions,jmenuSize,jmenuColor;

		jframeObject.setTitle("Events 4");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setJMenuBar(jmenubarPrincipal);

		jmenuOptions=new JMenu("Options");
		jmenubarPrincipal.add(jmenuOptions);

		jmenuSize=new JMenu("Window size");
		jmenuOptions.add(jmenuSize);

		jmenuColor=new JMenu("Color");
		jmenuOptions.add(jmenuColor);

		jmenuitem640=new JMenuItem("640x480");
		jmenuSize.add(jmenuitem640);
		jmenuitem640.addActionListener(new submenuListener());

		jmenuitem1024=new JMenuItem("1024x768");
		jmenuSize.add(jmenuitem1024);
		jmenuitem1024.addActionListener(new submenuListener());

		jmenuitemRed=new JMenuItem("Red");
		jmenuColor.add(jmenuitemRed);
		jmenuitemRed.addActionListener(new submenuListener());

		jmenuitemGreen=new JMenuItem("Green");
		jmenuColor.add(jmenuitemGreen);
		jmenuitemGreen.addActionListener(new submenuListener());

		jframeObject.setResizable(false);
		jframeObject.setBounds(100,100,400,400);
		jframeObject.setVisible(true);
	}
}
class submenuListener extends Events4 implements ActionListener{
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==jmenuitem640) {
			jframeObject.setSize(640,480);
		}
		if(a.getSource()==jmenuitem1024) {
			jframeObject.setSize(1024,768);
		}
		if(a.getSource()==jmenuitemRed) {
			jframeObject.getContentPane().setBackground(new Color(255,0,0));
		}
		if(a.getSource()==jmenuitemGreen) {
			jframeObject.getContentPane().setBackground(new Color(0,255,0));
		}
	}
}
