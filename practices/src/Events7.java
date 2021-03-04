import	javax.swing.JFrame;
import	javax.swing.JRadioButton;
import	javax.swing.ButtonGroup;
import	javax.swing.event.ChangeEvent;
import	javax.swing.event.ChangeListener;

public class Events7 {
static JRadioButton jradiobutton640,jradiobutton800,jradiobutton1024;
static JFrame jframeObject=new JFrame();
	public static void main(String[] args) {
		ButtonGroup buttongroupDimensions;

		jframeObject.setTitle("Events 7");
		jframeObject.setLayout(null);
		jframeObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttongroupDimensions=new ButtonGroup();

		jradiobutton640=new JRadioButton("640*480");
		jradiobutton640.setBounds(10,20,100,30);
		jradiobutton640.addChangeListener(new radiobuttonListener());
		jframeObject.add(jradiobutton640);
		buttongroupDimensions.add(jradiobutton640);

		jradiobutton800=new JRadioButton("800*600");
		jradiobutton800.setBounds(10,70,100,30);
		jradiobutton800.addChangeListener(new radiobuttonListener());
		jframeObject.add(jradiobutton800);
		buttongroupDimensions.add(jradiobutton800);

		jradiobutton1024=new JRadioButton("1024*768");
		jradiobutton1024.setBounds(10,120,100,30);
		jradiobutton1024.addChangeListener(new radiobuttonListener());
		jframeObject.add(jradiobutton1024);
		buttongroupDimensions.add(jradiobutton1024);

		//jframeObject.setResizable(false);
		jframeObject.setBounds(100,10,300,300);
		jframeObject.setVisible(true);
	}
}
class radiobuttonListener extends Events7 implements ChangeListener{
	public void stateChanged(ChangeEvent sd) {
		if(jradiobutton640.isSelected()) {
			jframeObject.setSize(640,480);
		}
		if(jradiobutton800.isSelected()) {
			jframeObject.setSize(800,600);
		}
		if(jradiobutton1024.isSelected()) {
			jframeObject.setSize(1024,768);
		}
	}
}
