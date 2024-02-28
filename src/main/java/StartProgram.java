import java.util.ArrayList;
import java.util.List;

import controller.WeaponHelper;
import model.Weapon;

/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Feb 25, 2024
 */
public class StartProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeaponHelper wh = new WeaponHelper();
		List<Weapon> ws = new ArrayList<Weapon>();
		
		ws.add(new Weapon("Iron Sword", 'E', 45));
		ws.add(new Weapon("Steel Sword", 'D', 30));
		ws.add(new Weapon("Silver Sword", 'B', 20));
		ws.add(new Weapon("Slim Sword", 'D', 40));
		ws.add(new Weapon("Iron Blade", 'D', 45));
		ws.add(new Weapon("Steel Blade", 'C', 30));
		ws.add(new Weapon("Silver Blade", 'A', 20));
		ws.add(new Weapon("Iron Lance", 'E', 45));
		ws.add(new Weapon("Steel Lance", 'D', 30));
		ws.add(new Weapon("Silver Lance", 'B', 20));
		ws.add(new Weapon("Slim Lance", 'D', 40));
		ws.add(new Weapon("Iron Axe", 'E', 45));
		ws.add(new Weapon("Steel Axe", 'D', 30));
		ws.add(new Weapon("Silver Axe", 'B', 20));
		ws.add(new Weapon("Iron Bow", 'E', 45));
		ws.add(new Weapon("Steel Bow", 'D', 30));
		ws.add(new Weapon("Silver Bow", 'B', 20));
		ws.add(new Weapon("Short Bow", 'D', 30));
		ws.add(new Weapon("Longbow", 'C', 15));
		ws.add(new Weapon("Iron Knuckles", 'E', 45));
		ws.add(new Weapon("Killer Lance", 'C', 20));
		ws.add(new Weapon("Brave Sword", 'B', 30));
		ws.add(new Weapon("Brave Lance", 'B', 30));
		ws.add(new Weapon("Brave Axe", 'B', 30));
		ws.add(new Weapon("Brave Bow", 'B', 30));
		ws.add(new Weapon("Killer Axe", 'C', 20));
		ws.add(new Weapon("Killer Bow", 'C', 20));
		ws.add(new Weapon("Devil Axe", 'E', 30));
		ws.add(new Weapon("Poison Sword", 'E', 30));
		ws.add(new Weapon("Poison Axe", 'E', 30));
		ws.add(new Weapon("Poison Bow", 'E', 30));
		ws.add(new Weapon("Rapier", 'E', 30));
		ws.add(new Weapon("Lancereaver", 'D', 30));
		ws.add(new Weapon("Swordreaver", 'D', 30));
		ws.add(new Weapon("Axereaver", 'D', 30));
		ws.add(new Weapon("Wind Sword", 'E', 35));
		ws.add(new Weapon("Light Brand", 'E', 30));
		ws.add(new Weapon("Runesword", 'D', 25));
		ws.add(new Weapon("Flame Sword", 'C', 25));
		ws.add(new Weapon("Shamshir", 'B', 25));
		ws.add(new Weapon("Mani Katti", 'E', 30));
		ws.add(new Weapon("Wyrmslayer", 'C', 20));
		ws.add(new Weapon("Heavy Spear", 'D', 20));
		ws.add(new Weapon("Horseslayer", 'C', 20));
		ws.add(new Weapon("Halberd", 'C', 20));
		ws.add(new Weapon("Spear", 'E', 45));
		ws.add(new Weapon("Short Spear", 'D', 30));
		ws.add(new Weapon("Javelin", 'E', 35));
		ws.add(new Weapon("Hand Axe", 'E', 30));
		ws.add(new Weapon("Tomahawk", 'D', 25));
		ws.add(new Weapon("Battle Axe", 'D', 25));
		ws.add(new Weapon("Hammer", 'E', 25));
		ws.add(new Weapon("Hatchet", 'E', 30));
		ws.add(new Weapon("Swordslayer", 'C', 20));
		ws.add(new Weapon("Dragon Axe", 'C', 20));
		ws.add(new Weapon("Fiendcleaver", 'C', 20));
		ws.add(new Weapon("Venin Edge", 'E', 20));
		ws.add(new Weapon("Venin Lance", 'E', 20));
		ws.add(new Weapon("Venin Bow", 'E', 20));
		
		for(Weapon w : ws) {
			wh.insertWeapon(w);
		}
	}

}
