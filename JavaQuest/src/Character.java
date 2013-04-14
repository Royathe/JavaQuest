

public class Character {

	//Basic Values
	public static int health = 100;
	public static int mana = 100;
	public static int manaRegen = 10;
	public static int experiance = 0;
	public static int level = 1;
	public static int gold = 0;
	
	
	//Equipment Values
	public static int weapStat = 0;
	public static int armorStat = 0;
	public static int magicAtt = 0;
	public static int magicDef = 0;
	
	//Battle Values
	public static double armor(){
		double armor = 1-((0.01 * (defStat + armorStat)) + (magStat * magicDef * 0.05) );
		return armor;
	}
	public static int attack(){
		int attack = (int)((10 * Dice.Crit()) * (Character.attStat + Character.weapStat) + (10 * Character.magicAtt * magStat)); 
		return attack;
	}


	
    //Level Values
	public static int attStat = 1;
	public static int defStat = 10;
	public static int magStat = 1;
	

	//Inventory Values
	
		//Main-hand Weapons
		public static int hasBaseSword = 0;
		public static int hasElvenSword = 0;
		public static int hasSpellSword = 0;
		public static int hasRuneBlade = 0;
		public static int hasFireBlade = 0;
		
		//Off-hand Weapons
		public static int hasFireStaff = 0;
		public static int hasNecroStaff = 0;
		public static int hasShield = 0;
		
		//Spellbooks
		public static int hasShieldBook = 0;
		public static int hasHealBook = 0;
		
		//Spells
		public static boolean hasSpellFire = false;
		public static boolean hasSpellDeath = false;
		public static boolean hasSpellHeal = false;
		public static boolean hasSpellShield = false;
		public static boolean hasSpellInvisibilty = true;
		
		//Armor
		public static int hasBaseArmor = 0;
		public static int hasChainMail = 0;
		public static int hasTrollHide = 0;
		public static int hasPlating = 0;
		
		//Miscellaneous
		public static int hasSigilStone = 0;
		public static int hasArcaneArmor = 0;
		public static int hasArcaneBlade = 0;
		public static int hasHealthPot = 0;
		
}
