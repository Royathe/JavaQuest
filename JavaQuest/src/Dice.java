

public class Dice {

	
	
		
		public static double Crit() {
			
			int dice = (int)(Math.random()*100);
			double multiplier = 0;
			

			
			if (dice >= 0 && dice < 10) {
				multiplier = 2;
			}
			else if (dice >= 10 && dice < 30) {
				multiplier = 1.5;
			}
			else {
				multiplier = 1;
			}
			
			
			return multiplier;
			
		}
		
		public static int Throw() {
					
					int dice = (int)(Math.random()*100);
					
					
					return dice;
					
				}
	



		
	}
