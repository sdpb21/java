import	javax.swing.JFrame;
import	javax.swing.JScrollPane;
import	javax.swing.JTextArea;
import	javax.swing.JButton;
import	java.awt.event.KeyListener;
import	java.awt.event.KeyEvent;
import	java.awt.event.ActionEvent;
import	java.awt.event.ActionListener;

public class Events3 {
	static JButton button1,button2;

	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JScrollPane jscrollpaneObject;
		JTextArea jtextareaObject=new JTextArea();

		jframeObject.setTitle("Events 3");
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframeObject.setLayout(null);

		jtextareaObject.setName("xArea");
		jscrollpaneObject=new JScrollPane(jtextareaObject);
		jscrollpaneObject.setBounds(10,10,350,200);
		jframeObject.add(jscrollpaneObject);

		jtextareaObject.addKeyListener(new jtextareaObjectListener());

		button1=new JButton("Button 1");
		button1.setBounds(10,220,100,30);
		jframeObject.add(button1);
		button1.addActionListener(new buttonListener());

		button2=new JButton("Button 2");
		button2.setBounds(120,220,100,30);
		jframeObject.add(button2);
		button2.addActionListener(new buttonListener());

		jframeObject.setResizable(false);
		jframeObject.setBounds(100,100,400,400);
		jframeObject.setVisible(true);
	}
}
class jtextareaObjectListener implements KeyListener{
	public void keyPressed(KeyEvent e) {
		System.out.println("Source KeyPressed: "+((JTextArea)e.getSource()).getName());
		System.out.println("KeyPressed: "+e.getKeyChar());
	}
	public void keyReleased(KeyEvent e) {
		/*if(e.getSource() == jtextareaObject) {
			System.out.println("has escrito en el JTextArea");
		}*/
		System.out.println("Source KeyReleased: "+((JTextArea)e.getSource()).getName());
		System.out.println("KeyReleased: "+e.getKeyChar());
	}
	public void keyTyped(KeyEvent e) {
		System.out.println("Source KeyTyped: "+((JTextArea)e.getSource()).getName());
		System.out.println("KeyTyped: "+e.getKeyChar());
	}
}
class buttonListener extends Events3 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			System.out.println("Button 1 Pressed");
		}
		if(e.getSource()==button2) {
			System.out.println("Button 2 pressed");
		}
	}
}