import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	
	/**
	 * 
	 */
	private Chart chart;
	
	/**
	 * 
	 */
	public Main() {
		this.chart = new Chart("Notam Application");
		chart.init();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}

	
}

