import	javax.swing.JFrame;
import	javax.swing.JLabel;
import	javax.swing.JCheckBox;
import	javax.swing.JButton;
import	javax.swing.event.ChangeListener;
import	javax.swing.event.ChangeEvent;
import	java.awt.event.ActionEvent;
import	java.awt.event.ActionListener;

public class Events5 {
static JCheckBox jcheckboxAccept;
static JButton jbuttonContinue;
	public static void main(String[] args) {
		JFrame jframeObject=new JFrame();
		JLabel jlabelQuestion;

		jframeObject.setTitle("Events 5");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jlabelQuestion=new JLabel("Do you agree?");
		jlabelQuestion.setBounds(10,10,200,15);
		jframeObject.add(jlabelQuestion);

		jcheckboxAccept=new JCheckBox("Agree");
		jcheckboxAccept.setBounds(10,30,100,15);
		jcheckboxAccept.setSelected(false);
		jcheckboxAccept.addChangeListener(new checkboxListener());
		jframeObject.add(jcheckboxAccept);

		jbuttonContinue=new JButton("Continue");
		jbuttonContinue.setBounds(10,60,100,30);
		jbuttonContinue.setEnabled(false);
		jframeObject.add(jbuttonContinue);
		jbuttonContinue.addActionListener(new buttonListener2());

		jframeObject.setResizable(false);
		jframeObject.setBounds(100,100,300,200);
		jframeObject.setVisible(true);
	}
}
class checkboxListener extends Events5 implements ChangeListener{
	public void stateChanged(ChangeEvent s) {
		if(jcheckboxAccept.isSelected()) {
			jbuttonContinue.setEnabled(true);
		}else {
			jbuttonContinue.setEnabled(false);
		}
	}
}
class buttonListener2 extends Events5 implements ActionListener{
	public void actionPerformed(ActionEvent sp) {
		if(sp.getSource()==jbuttonContinue) {
			System.exit(0);
		}
	}
}
