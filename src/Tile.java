import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tile {
	private String imageUrl;
	private int z; // zoom
	private int y;
	private int x;
	
	public Tile( int z, int x, int y) {
		this.z = z;
		this.x = x;
		this.y = y;
		
		this.imageUrl = "https://tile.openstreetmap.org/"+this.z+"/"+this.x+"/"+this.y+".png";
	}
	
	public JLabel make() {
		URL url;
		JLabel imageTile = null;
		
		try {
			url = new URL(this.imageUrl);
			
			System.out.println("Loading " + this.imageUrl);
			
			BufferedImage image = ImageIO.read(url);
			
			imageTile = new JLabel(new ImageIcon(image));
			
		} catch (IOException e) {
			System.out.println(e);
		}
		// x, y
		imageTile.setBounds(0, 0, 256, 256);
		
		return imageTile;
	}
	
	public void addToChart(Chart chart) {
		chart.getContentPane().add(this.make());
	}
	
}
