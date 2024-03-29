package testPackage;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class Images extends JFrame {

	public static void main(String[] args) {

		DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i = new Images();
		i.run(dm);
		
		
		
	}

	private Screen s;
	private Image smoke;
	private boolean loaded;
	
	public void run(DisplayMode dm){
		
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial", Font.PLAIN, 24));
		loaded = false;
		
		
		
		s = new Screen();
		try{
			s.setFullScreen(dm, this);
			loadpics();
			try{
				Thread.sleep(5000);
			}catch(Exception ex){}
		}finally{
			s.restoreScreen();
		}
	}
	
	
	
	
	
	private void loadpics() {

		smoke = new ImageIcon(getClass().getResource("smoke.png")).getImage();
		loaded = true;
		repaint();
	}





	public void paint(Graphics g){
		if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		if(loaded){
			g.drawImage(smoke,200,200,null);
		}
		
	}
	
	
	
	
}
