import javax.swing.JFrame;
import javax.swing.JLabel;

public class Chart extends JFrame {
	
	public Chart(String title) {
		super(title);
	}
	
	public void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		Tile tile1 = new Tile(9, 262, 169);
		tile1.addToChart(this);
			
		JLabel label = new JLabel("Hoi Jochem");
		this.add(label);
	   
		this.pack();
	    //frame.setLocation(200, 200);
		this.setVisible(true);
	}
}
