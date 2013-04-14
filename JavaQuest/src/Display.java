
import java.awt.*;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display extends JPanel {

	public static String displayText;
	private JTextField item1;
	
	private Image fairieSMA;
	private Image trollSMA;
	private Image atronachSMA;
	private Image necroSMA;
	private Image villageSMA;
	private Image playerSMA;
	private Image paladinSMA;
	private Image deathSMA;
	private Image mageSMA;
	
	
	private Image mountain;
	private Image grass;
	private Image castle;
	private Image deadland;
	private static boolean loaded;

	public static void main(String[] args) {

		/*
		JFrame go = new JFrame("Title");
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Display p = new Display();
		go.setContentPane(p);
		
		go.setBackground(Color.BLACK);
		go.setSize(350,600);
		go.setResizable(false);
		go.setVisible(true);
		*/

	}
	
	
	public Display(){
		super();

		item1 = new JTextField("ENTER TEXT");
		add(item1);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		

		displayText = "- WHATWHAT";
		loadpics();
		
		
	}

	private class thehandler implements ActionListener{
			
			public void actionPerformed(ActionEvent event){
				
				String string = "";
				if(event.getSource()==item1)
					string=String.format("field 1: %s", event.getActionCommand());
				
				JOptionPane.showMessageDialog(null, string);
			
		}
	
	}
	private void loadpics() {
		//terrain
		grass = new ImageIcon(getClass().getResource("ter/grass.jpg")).getImage();
		mountain = new ImageIcon(getClass().getResource("ter/mountain.jpg")).getImage();
		castle = new ImageIcon(getClass().getResource("ter/castle.jpg")).getImage();
		deadland = new ImageIcon(getClass().getResource("ter/deadland.jpg")).getImage();
		//events
		fairieSMA = new ImageIcon(getClass().getResource("enemy/fairieSMA.png")).getImage();
		deathSMA = new ImageIcon(getClass().getResource("enemy/deathSMA.png")).getImage();
		atronachSMA = new ImageIcon(getClass().getResource("enemy/atronachSMA.png")).getImage();
		trollSMA = new ImageIcon(getClass().getResource("enemy/trollSMA.png")).getImage();
		paladinSMA = new ImageIcon(getClass().getResource("enemy/paladinSMA.png")).getImage();
		atronachSMA = new ImageIcon(getClass().getResource("enemy/atronachSMA.png")).getImage();
	/*	mageSMA = new ImageIcon(getClass().getResource("enemy/mageSMA.png")).getImage();
		necroSMA = new ImageIcon(getClass().getResource("enemy/necroSMA.png")).getImage();
		villageSMA = new ImageIcon(getClass().getResource("enemy/villageSMA.png")).getImage();
		
		//player
		playerSMA = new ImageIcon(getClass().getResource("playerSMA.png")).getImage();
		*/
		loaded = true;
		repaint();
	}
	
	
	public void paint(Graphics g){
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 350, 30);
		
		Font fontCentury = new Font("18thCentury", Font.PLAIN, 35);
		
		
		g2d.setFont(fontCentury);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.WHITE);
		String s = "JavaQuest";
		int width = 350;
		int XPos = 0;
		int YPos = 21; 
        int stringLen = (int)  
                g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();  
            int start = width/2 - stringLen/2;  
            g2d.drawString(s, start + XPos, YPos);  
		
             

		loadpics();
		
		drawMap(g);
		
		textBox(g,g2d);

		
		
	}
	
	private void textBox(Graphics g,Graphics2D g2d){
		
		Font fontLabel = new Font("Arial", Font.PLAIN, 14);
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 450, 350, 80);
		
		g2d.setFont(fontLabel);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.WHITE);
		g2d.drawString(displayText, 10, 465);
		//draw bottom ends
		
	}

	
	
	
	private void drawMap(Graphics g){
		int[][] map = Level.map;
		if(loaded=true){
			
			int xLoc = 0;
			int yLoc = 30;
			
			for(int i = (map.length-1);i>=1; i--){
				for(int o = 1;o<map.length-1; o++){
					
					if(map[i][o] == 0){
						g.drawImage(grass,xLoc,yLoc,null);
					}
					else if(map[i][o] == 1){
						g.drawImage(grass,xLoc,yLoc,null);
						g.drawImage(fairieSMA,xLoc,yLoc,null);
					}
					else if(map[i][o] == 2){
						g.drawImage(grass,xLoc,yLoc,null);
						g.drawImage(trollSMA,xLoc+10,yLoc+5,null);
					}
					else if(map[i][o] == 3){
						g.drawImage(grass,xLoc,yLoc,null);
						g.drawImage(paladinSMA,xLoc+20,yLoc,null);
					}
					else if(map[i][o] == 4){
						g.drawImage(grass,xLoc,yLoc,null);
					}
					else if(map[i][o] == 5){
						g.drawImage(grass,xLoc,yLoc,null);
					}
					else if(map[i][o] == 6){
						g.drawImage(grass,xLoc,yLoc,null);
					}
					else if(map[i][o] == 7){
						g.drawImage(grass,xLoc,yLoc,null);
					}
					else if(map[i][o] == 8){
						g.drawImage(deadland,xLoc,yLoc,null);
						g.drawImage(atronachSMA,xLoc+5,yLoc-10,null);
					}
					else if(map[i][o] == 9){
						g.drawImage(grass,xLoc,yLoc,null);
					}
					else if(map[i][o] == 10){
						g.drawImage(deadland,xLoc,yLoc,null);
						g.drawImage(deathSMA,xLoc,yLoc-2,null);
					}
					else if(map[i][o] == 11){
						g.drawImage(castle,xLoc,yLoc,null);
					}
					else if(map[i][o] == 12){
						g.drawImage(mountain,xLoc,yLoc,null);
					}
					xLoc = xLoc + 70;
				}
				yLoc = yLoc + 70;
				xLoc = 0;
			}
		}
		

	}
	
}
