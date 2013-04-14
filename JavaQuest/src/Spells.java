

public class Spells {

	public static void main(String[] args) {


	}

	public static int FireBall(){
		int damage = 0;
		int manaDrain = 30 - (Character.magStat * 2);
		
		if(Character.mana >= manaDrain){
			damage = 10 * Character.magStat;
			System.out.println(manaDrain + " mana lost" + "\n" + Character.mana + " mana");
			Character.mana -= manaDrain;
		}
		else {
			System.out.println("Not enough mana!");
		}
		
		return damage;
	}
	
	public static int DeathCoil(){
		int damage = 0;
		int manaDrain = 20 - (Character.magStat * 2);
		
		if(Character.mana >= manaDrain){
			damage =(int)( 5 * Character.magStat * Dice.Crit());
			System.out.println(manaDrain + " mana lost" + "\n" + Character.mana + " mana");
			Character.mana -= manaDrain;
		}
		else {
			System.out.println("Not enough mana!");
		}
	
	return damage;
	}
	
	public static void Shield(){
		
		if(Character.mana >= 50){
			Character.magicDef += 5;
			System.out.println("A shield of magic surrounds you");
			System.out.println("50 mana lost" + "\n" + Character.mana + " mana");
			Character.mana -= 50;
		}
		else {
			System.out.println("Not enough mana!");
		}
		
	}
	
	public static void Heal(){
		
		if(Character.mana >= 50){
			Character.health = 100;
			System.out.println("Health fully restored!");
			System.out.println("50 mana lost" + "\n" + Character.mana + " mana");
			Character.mana -= 50;
		}
		else {
			System.out.println("Not enough mana!");
		}
	}

	public static boolean Invisibility(){
		
		boolean flee = false;
		
		if(Character.mana == 100){
			flee = true;
			System.out.println("100 mana lost \n 0 mana");
			Character.mana = 0;
		}
		else {
			System.out.println("Not enough mana!");
		}
		
		return flee;
	}
}

	
