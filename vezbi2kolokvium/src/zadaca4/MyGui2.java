package zadaca4;
import java.awt.*;
public class MyGui2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame("My Frame");
		Button b1 = new Button("OK");
		Button b2 = new Button("Cancel");
		f.setLayout(new FlowLayout());
		f.add("North", new TextField());
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		f.add("South", p);
		f.add("Center", new TextField("Center region"));
		f.setSize(300, 300);
		f.setVisible(true);
	}

}
