

public class Level {

	public static int[][] map = Level.Generate();
	
	
	public static void main(String[] args) {
		
		
		Level.print();

		
	}
	
	
	public static void print() {
			
			
			int[][] map = Level.map;
	
			//prints map
			for(int i = (map.length-1);i>=1; i--){
				for(int o = 1;o<map.length-1; o++){
					
					if(map[i][o] == 0){
						System.out.print("   ");
					}
					else if(map[i][o] == 1){
						System.out.print(" | ");
					}
					else if(map[i][o] == 2){
						System.out.print(" M ");
					}
					else if(map[i][o] == 3){
						System.out.print(" 8 ");
					}
					else if(map[i][o] == 4){
						System.out.print(" I ");
					}
					else if(map[i][o] == 5){
						System.out.print(" H ");
					}
					else if(map[i][o] == 6){
						System.out.print(" S ");
					}
					else if(map[i][o] == 7){
						System.out.print(" w ");
					}
					else if(map[i][o] == 8){
						System.out.print(" ! ");
					}
					else if(map[i][o] == 9){
						System.out.print(" € ");
					}
					else if(map[i][o] == 10){
						System.out.print(" D ");
					}
					else if(map[i][o] == 11){
						System.out.print(" Y ");
					}
					else if(map[i][o] == 12){
						System.out.print(" A ");
					}
					
				}
				System.out.print("\n");
			}
			
			
			
		}
	
	
	
	
	public static int[][] Generate(){

		//Event list
		//  E0;		   NullEvent
		int E1 = 4; // Goblins
		int E2 = 2; // Troll
		int E3 = 2; // Knight
		int E4 = 2; // FireMage
		int E5 = 1; // Village
		int E6 = 2; // SpellBook
		int E7 = 1; // Necromancer
		int E8 = 2; // Atronach
		//  E9; 	   Stash
		int E10 = 2; //DeathKnight
		//  E11 	 //Castle
		//  E12; 	   Impassable
		
		int count = 0; // counter used for placements
		
		
		
		
		int[][] coordinate = new int[7][6]; // sets coordinates
		
		//sets all "0" coordinates to "Blocked Path". Easier for coordinate visualization
		for(int i = 0;i<coordinate.length-1; i++){
			coordinate[0][i] = 12;
		}
		for(int i = 0;i<coordinate.length; i++){
			coordinate[i][0] = 12;
		}
		//end of setting
		
		
		
		
		/* Sets Start Location */
			coordinate[1][3] = 9;
		/* Sets Main Goblin Location */
			int goblinRandom = (int)((Math.random()*2)+1);
			int gX = 2;
			goblinRandom = (goblinRandom == 2) ? gX = 4 : goblinRandom;
			coordinate[1][gX] = 1;
			E1--;
			count++;
		/* Sets Castle Location */
			coordinate[6][3] = 11;
			count++;
		/* Sets Castle Side */
			coordinate[6][2] = 12;
			coordinate[6][4] = 12;
		/* Sets Main Death Knight Location */
			coordinate[5][3] = 10;
			E10--;
			count++;
			
			
		/* Sets Necessary map locations  */	
		do{	
		int x = (int)((Math.random()*5)+1);
		int y = (int)((Math.random()*6)+1);
		
		
		/* Sets Village Location */if ((coordinate[y][x] == 0 )&&(E5 > 0)){
			coordinate[y][x] = 5;
			E5--;
			count++;
		}
		/* Sets Necromancer/Abandoned Castle Location */else if ((coordinate[y][x] == 0 )&&(E7 > 0)){
			coordinate[y][x] = 7;
			E7--;
			count++;
		}
		/* Sets Main Troll Location */else if ((coordinate[y][x] == 0 )&&(E2 > 1)){
			coordinate[y][x] = 2;
			E2--;
			count++;
		}
		/* Sets Main FireMage Location */else if ((coordinate[y][x] == 0 )&&(E4 > 1)){
			coordinate[y][x] = 4;
			E4--;
			count++;
		}
		/* Sets Main Atronach Location */else if ((coordinate[y][x] == 0 )&&(E8 > 1)){
			coordinate[y][x] = 8;
			E8--;
			count++;
		}
		/* Sets Main Knight Location */else if ((coordinate[y][x] == 0 )&&(E3 > 1)){
			coordinate[y][x] = 3;
			E3--;
			count++;
		}
		/* Sets Stash Location */else if ((coordinate[y][x] == 0 )){
			coordinate[y][x] = 9;
			count++;
		}
		}while(count < 12);
		// end of setting
		count=0;
		
		// randomizes rest of map locations
			for(int i = (coordinate.length-1);i>=1; i--){
				for(int o = 1;o<coordinate.length-1; o++){
					int event = (int)((Math.random()*100));
					
					
					//places Death Knight 2%
					if((event <= 1 )&&(E10 > 0)&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 10;
						E10--;
					}
					//places Ravines 5%
					else if((event > 1 )&&(event <= 5 )&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 12;
					}
					//places Goblins 25%
					else if((event > 5 )&&(event <= 25 )&&(E1 > 0)&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 1;
						E1--;
					}
					//places Troll 20%
					else if((event > 25 )&&(event <= 45 )&&(E2 > 0)&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 2;
						E2--;
					}
					//places Knight 10%
					else if((event > 45 )&&(event <= 55 )&&(E3 > 0)&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 3;
						E3--;
					}
					//places Atronach 10%
					else if((event > 55 )&&(event <= 65 )&&(E8 > 0)&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 8;
						E8--;
					}
					//places Fire Mage 5%
					else if((event > 65 )&&(event <= 70 )&&(E4 > 0)&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 4;
						E4--;
					}
					//places Spell Book 10%
					else if((event > 70 )&&(event <= 80 )&&(E6 > 0)&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 6;
						E6--;
					}
					//places Stash 20%
					else if((event > 80 )&&(event <= 100 )&&(coordinate[i][o] == 0)){
						coordinate[i][o] = 9;
					}
				}
			}	
		//end of map generation
		
		return coordinate;
		
	}
	}