

public class Items {

    // unequips items
	private static void unEquipMain(){
		Items.BaseSword(false);
		Items.ElvenSword(false);
		Items.SpellSword(false);
		Items.RuneBlade(false);
		Items.FireBlade(false);
	}private static void unEquipArm(){
		Items.BaseArmor(false);
		Items.ChainMail(false);
	}private static void unEquipOff(){
		Items.FireStaff(false);
		Items.NecroStaff(false);
		Items.Shield(false);
	}
	
	// equips item
	public static void equip(String item) {
		
		//Checks Main-Hand options
		if(item.equals("BaseSword")){
			Items.unEquipMain();
			Items.BaseSword(true);
		}
		else if(item.equals("ElvenSword")){
			Items.unEquipMain();
			Items.ElvenSword(true);
		}
		else if(item.equals("SpellSword")){
			Items.unEquipMain();
			Items.SpellSword(true);
		}
		else if(item.equals("RuneBlade")){
			Items.unEquipMain();
			Items.RuneBlade(true);
		}
		else if(item.equals("FireBlade")){
			Items.unEquipMain();
			Items.FireBlade(true);
		}
		

		//Checks Off-Hand options
		else if(item.equals("FireStaff")){
			Items.unEquipOff();
			Items.FireStaff(true);
		}
		else if(item.equals("NecroStaff")){
			Items.unEquipOff();
			Items.NecroStaff(true);
		}
		else if(item.equals("Shield")){
			Items.unEquipOff();
			Items.Shield(true);
		}
		
		//Checks Armor options
		else if(item.equals("BaseArmor")){
			Items.unEquipArm();
			Items.BaseArmor(true);
		}
		else if(item.equals("ChainMail")){
			Items.unEquipArm();
			Items.ChainMail(true);
		}
		
		
		
		
		
		
		
	}

	// Weapons Main-Hand	
	public static void BaseSword(boolean equipped){
		if(equipped == true){
			Character.hasBaseSword--;
			Character.weapStat = 1;
			System.out.println("Rusty Sword equipped");}
		else{
			Character.hasBaseSword++;
			Character.weapStat = 0;}
		}
	public static void ElvenSword(boolean equipped){
		if(equipped == true){
			Character.hasElvenSword--;
			Character.weapStat = 3;;
			System.out.println("Elven Sword equipped");}
		else{
			Character.hasElvenSword++;
			Character.weapStat = 0;}
		}
	public static void SpellSword(boolean equipped){
		if(equipped == true){
			Character.hasSpellSword--;
			Character.weapStat = 3;
			Character.magicAtt = 1;;
			System.out.println("Spell Sword equipped");}
		else{
			Character.hasSpellSword++;
			Character.weapStat = 0;
			Character.magicAtt = 0;}
		}
	public static void RuneBlade(boolean equipped){
		if(equipped == true){
			Character.hasRuneBlade--;
			Character.weapStat = 5;;
			System.out.println("Rune Blade equipped");}
		else{
			Character.hasRuneBlade++;
			Character.weapStat = 0;}
		}
	public static void FireBlade(boolean equipped){
		if(equipped == true){
			Character.hasFireBlade--;
			Character.weapStat = 5;
			Character.magicAtt = 2;
			System.out.println("Fire Blade equipped");}
		else{
			Character.hasFireBlade++;
			Character.weapStat = 0;
			Character.magicAtt = 2;}
		}
	public static void ArcaneBlade(boolean equipped){
		if(equipped == true){
			Character.magicAtt = 1;
			System.out.println("Your hands are imbued with arcane magic. Your blades do magic damage.");}
		else{
			Character.magicAtt = 0;}
		}	
		
	// Weapons Off-Hand
	public static void FireStaff(boolean equipped){
		if(equipped == true){
			Character.hasFireStaff--;
			Character.hasSpellFire = true;
			System.out.println("Fire Staff equipped");}
		else{
			Character.hasFireStaff++;
			Character.hasSpellFire = false;}
		}	
	public static void NecroStaff(boolean equipped){
		if(equipped == true){
			Character.hasNecroStaff--;
			Character.hasSpellDeath = true;
			System.out.println("Necro Staff equipped");}
		else{
			Character.hasNecroStaff++;
			Character.hasSpellDeath = false;}
		}
	public static void Shield(boolean equipped){
		if(equipped == true){
			Character.hasShield--;
			Character.armorStat = 10;
			System.out.println("Shield equipped");}
		else{
			Character.hasNecroStaff++;
			Character.armorStat = 0;}
		}	
	
	// Armors
	public static void BaseArmor(boolean equipped){
		if(equipped == true){
			Character.hasBaseArmor--;
			Character.armorStat = 0;
			System.out.println("Leather Tunic equipped");}
		else{
			Character.hasBaseArmor++;
			Character.armorStat = 0;}
		}
	public static void ChainMail(boolean equipped){
		if(equipped == true){
			Character.hasChainMail--;
			Character.armorStat = 10;
			System.out.println("Chain Mail equipped");}
		else{
			Character.hasChainMail++;
			Character.armorStat = 0;}
		}
	public static void TrollHide(boolean equipped){
		if(equipped == true){
			Character.hasTrollHide--;
			Character.defStat += 10;
			System.out.println("Troll Hide added to armor. Defence increased.");}
		else{
			Character.hasTrollHide++;
			Character.defStat -= 10;}
		}
	public static void Plating(boolean equipped){
		if(equipped == true){
			Character.hasPlating--;
			Character.defStat += 10;
			System.out.println("Plating added to armor. Defence increased.");}
		else{
			Character.hasPlating++;
			Character.defStat -= 10;}
		}
	public static void ArcaneArmor(boolean equipped){
		if(equipped == true){
			Character.magicDef = 1;
			System.out.println("You are shielded with arcane magic. Defence increased.");}
		else{
			Character.magicDef = 0;}
		}	
	
	// Miscellaneous
	public static void HealthPot(){
		if (Character.hasHealthPot > 0){
			Character.health = 100;
			Character.hasHealthPot--;
			System.out.println("Health fully restored!");
		}
		else{
			System.out.println("Out of health pots");
		}
	}
	public static void SigilStone(boolean equipped){
		if (equipped = true){
			Character.manaRegen = 100;
			Character.hasSigilStone = 1;
			System.out.println("The Sigil Stone hastens your mana regeneration!");
		}
		else{
			Character.manaRegen = 10;
			Character.hasSigilStone = 0;
		}
	}
	public static void BookHeal(){
		if (Character.hasHealBook > 0 && (Character.hasSpellHeal = false)){
			Character.hasSpellHeal = true;
			Character.hasHealBook--;
			System.out.println("You learned healing spell!");
		}
		else{
			System.out.println("You already know that spell");
		}
	}
	public static void BookShield(){
		
		
		if (Character.hasShieldBook > 0 && (Character.hasSpellShield = false)){
			Character.hasSpellShield = true;
			Character.hasShieldBook--;
			System.out.println("You learned magic shield spell!");
		}
		else{
			System.out.println("You already know that spell");
		}
	}
	
	
	
	
	
	
	
	
	}
