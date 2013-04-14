

import java.util.Scanner;

public class LevelUp {
	
	public static void main() {


		Scanner query = new Scanner(System.in);
		String response;
		boolean selected = false;
		System.out.println("\n You are now level " + Character.level + ". What stat do you want to increase?");
		System.out.println("'attack' 'defence' 'magic'?");
		
		do {
			response = query.next();
			if (response.equals("attack")||response.equals("Attack")||response.equals("att")){
				Character.attStat += 1;
				System.out.println("\n Attack increased by 1");
				selected = true;
			}
			else if (response.equals("defence")||response.equals("Defence")||response.equals("def")){
				Character.defStat += 5;
				System.out.println("\n Defence increased by 5");
				selected = true;
			}
			else if (response.equals("magic")||response.equals("Magic")||response.equals("mag")){
				Character.magStat += 1;
				System.out.println("\n Magic increased by 1");
				selected = true;
			}
			else {
				System.out.println("failed selection");
			}
			
			
		}while(selected == false);
		Character.experiance -= 100;
		
		
	}

}
