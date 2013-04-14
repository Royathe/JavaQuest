package testPackage;

import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class Display extends JPanel {

	private String details;
	private JButton b;
	private Color color = (Color.WHITE);
	private FlowLayout mainLayout;
	private Container container;
	private JPanel mousepanel;
	private JPanel panel;
	private JLabel statusbar;
	
	private Image smoke;
	private boolean loaded;

	public static void main(String[] args) {

		JFrame go = new JFrame("Title");
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Display p = new Display();
		go.setContentPane(p);
		go.setSize(600,500);
		go.setResizable(false);
		go.setVisible(true);
		

	}
	
	
	public Display(){
		super();
		
		loadpics();
		
		/*panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose a color");
		b.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(null, "Pick your color", color);
						if(color == null)
							color=(Color.WHITE);
						panel.setBackground(color);
					}
				}
		);
		
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(600,500);
		setVisible(true);*/
		
	}
	
	
	
	public void paint(Graphics g){
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D)g;
		setBackground(Color.RED);
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 600, 30);
		
		Font fontCentury = new Font("18thCentury", Font.PLAIN, 35);
		
		
		g2d.setFont(fontCentury);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.WHITE);
		String s = "JavaQuest";
		int width = 600;
		int XPos = 0;
		int YPos = 21; 
        int stringLen = (int)  
                g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();  
            int start = width/2 - stringLen/2;  
            g2d.drawString(s, start + XPos, YPos);  
		
		
		loadpics();
		if(loaded=true){
			g.drawImage(smoke,10,10,null);
			g.drawImage(smoke,60,60,null);
		}
	}
	
	
	
	/*
	public Display(){
		super("title");
		mainLayout = new FlowLayout();
		container = getContentPane();
		setLayout(mainLayout);
		
		lb = new JButton("left");
		add(lb);
		lb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						mainLayout.setAlignment(FlowLayout.LEFT);
						mainLayout.layoutContainer(container);
					}
				}
		);
		
		
		rb = new JButton("right");
		add(rb);
		rb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						mainLayout.setAlignment(FlowLayout.RIGHT);
						mainLayout.layoutContainer(container);
					}
				}
		);
		
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
		
		/*
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent event){
			details = String.format("You clicked %d ", event.getY());
			
			int x = event.getX();
			int y = event.getY();
			
			details += x + " ";
			
			if(x<200 && x>0 && y<200 && y>0)
				details = "you clicked the top left corner";
			
			
			/*if(event.isMetaDown())
				details += "with right mouse button";
			else if(event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";

				statusbar.setText(details);
		}
		
		
	}
	
	
	private class Handlerclass implements MouseListener, MouseMotionListener {
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("Clicked at %d, %d", event.getX(),event.getY()));
		}
		public void mousePressed(MouseEvent event) {
			statusbar.setText("you pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event){
			statusbar.setText("you released the button");
		}
		public void mouseEntered(MouseEvent event){
			statusbar.setText("you entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event){
			statusbar.setText("the mouse has left the window");
			mousepanel.setBackground(Color.WHITE);
		}
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("mouse is being dragged");
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("you moved the mouse");
		}
		
		
		
	}
	
	*/
	private void loadpics() {
		smoke = new ImageIcon(getClass().getResource("smoke.png")).getImage();
		loaded = true;
		repaint();
	}
	/*
	public static void main(String[] args) {
		
		JFrame Display = new JFrame("Display");
		Display.setVisible(true);
		Display.setSize(500,600);
        Display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Display.setLocationRelativeTo(null);
		
		DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Display d = new Display();
		d.run(dm); 
		
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
		if(loaded=true){
			g.drawImage(smoke,10,10,null);
		}
		
	}
	
	
	public static void main(String[] args) {

		  JFrame frame = new JFrame("DiceSimulator");
	        frame.setVisible(true);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        draw object = new draw();
	        frame.add(object);
	        frame.setLocationRelativeTo(null);
	        object.drawing();
	        
	}*/

}
