import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tile {
	private String imageUrl;
	private int y, x, width, height;
	private Chart chart;
	
	public Tile(Chart chart, int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.chart = chart;
		
		this.imageUrl = "https://tile.openstreetmap.org/"+this.chart.zoom+"/"+this.chart.currentX+"/"+this.chart.startY+".png";
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
		
		imageTile.setBounds(this.x, this.y, this.height, this.width);
		
		return imageTile;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
}
