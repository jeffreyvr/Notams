public class Main {
	
	/**
	 * 
	 */
	private Chart chart;
	
	/**
	 * 
	 */
	public Main() {
		this.chart = new Chart("Notam Application", 9, 262, 169);
		chart.init();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}

	
}

