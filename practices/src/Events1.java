import	javax.swing.JFrame;
import	java.awt.Button;
import	java.awt.event.ActionEvent;
import	java.awt.event.ActionListener;
import	javax.swing.JLabel;
import	java.awt.event.MouseEvent;
import	java.awt.event.MouseListener;

public class Events1 {
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		Button buttonAccept=new Button("Accept");
		JLabel jlabelObject=new JLabel("Label");

		jframeObject.setTitle("Events 1");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonAccept.setBounds(10,10,120,25);
		buttonAccept.addActionListener(new buttonAcceptListener());

		jframeObject.add(buttonAccept);

		jlabelObject.setBounds(10,40,120,25);
		jlabelObject.addMouseListener(new jlabelObjectListener());

		jframeObject.add(jlabelObject);

		jframeObject.setResizable(false);
		jframeObject.setVisible(true);
		jframeObject.setSize(400,400);
	}
}
class buttonAcceptListener implements ActionListener{
	private int counter=1;
	public void actionPerformed(ActionEvent e) {
		System.out.print("El botón ha sido pulsado "+counter+" veces\r\n");
		counter++;
	}
}
class jlabelObjectListener implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited");
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released");
	}
}
