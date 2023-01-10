package zadaca4;
import java.awt.*;

public class MyGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame ("My Frame");
		Button b = new Button ("OK");
		TextField tf = new TextField("Programming in Java" ,20);
		f.setLayout(new BorderLayout());
		f.add(b);
		f.add(tf);
		f.setSize(200,200);
		f.setVisible(true);
		
		
	}

}
