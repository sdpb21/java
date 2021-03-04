import	javax.swing.JFrame;
import	javax.swing.JTextField;
import	java.awt.event.KeyEvent;
import	java.awt.event.KeyListener;

public class Events2 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JTextField jtextfieldInput=new JTextField();
		JTextField jtextfieldInput2=new JTextField();

		jframeObject.setTitle("Events 2");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jtextfieldInput.setBounds(0,0,100,25);
		jtextfieldInput.setName("Input");
		jtextfieldInput.addKeyListener(new jtextfieldInputListener());

		jtextfieldInput2.setBounds(0,50,100,25);
		jtextfieldInput2.setName("Input2");
		jtextfieldInput2.addKeyListener(new jtextfieldInputListener());

		jframeObject.add(jtextfieldInput);
		jframeObject.add(jtextfieldInput2);

		jframeObject.setResizable(false);
		jframeObject.setBounds(100,100,400,400);
		jframeObject.setVisible(true);
	}
}
class jtextfieldInputListener implements KeyListener{
	public void keyPressed(KeyEvent e) {
		System.out.println("Source KeyPressed: "+((JTextField)e.getSource()).getName());
		System.out.println("Key pressed: "+e.getKeyChar());
	}
	public void keyReleased(KeyEvent e) {
		System.out.println("Source KeyReleased: "+((JTextField)e.getSource()).getName());
		System.out.println("Key Released: "+e.getKeyChar());
	}
	public void keyTyped(KeyEvent e) {
		System.out.println("Source KeyTyped: "+((JTextField)e.getSource()).getName());
		System.out.println("Key typed: "+e.getKeyChar());
	}
}