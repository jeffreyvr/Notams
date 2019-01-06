import javax.swing.JFrame;
//import javax.swing.JLabel;

class Chart extends JFrame {
	public int zoom;
	public int startX;
	public int startY;
	public int currentX;
	public int currentY;
	
	public Chart(String title, int zoom, int startX, int startY) {
		super(title);
		
		this.zoom = zoom;
		this.startX = startX;
		this.startY = startY;
		this.currentX = this.startX;
		this.currentY = this.startY;
	}
	
	public void init() {
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(null); // fixes positioning issue
		
		super.setSize(900, 600);

		this.addTiles();

		super.setVisible(true);		
	}
	
	public void addTiles() {
		int i = 0;
		int count = 0;
		
		while ( count < super.getSize().width ) {
			this.addTile(new Tile(this, i*256, 0, 256, 256));
			i++;
			count = count + 256;
		}
	}
	
	public void addTile(Tile tile) {
		this.currentX = this.currentX + 1;
		
		System.out.println("Current X = " + this.currentX);
		
		this.add(tile.make());
	}
	
}
