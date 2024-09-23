import javax.swing.*;

public class Home {

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		
		PolygonCanvas polyCanvas = new PolygonCanvas();
		
		frm.setVisible(true);
		frm.setSize(603, 818);
		frm.setTitle("IronMan LowPoly Art");
		frm.add(polyCanvas);

	}

}
