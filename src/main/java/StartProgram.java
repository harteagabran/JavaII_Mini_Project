import java.util.List;
import java.util.Scanner;

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
		Scanner in = new Scanner(System.in);
		WeaponHelper wh = new WeaponHelper();
		Weapon toAdd = new Weapon("Excalibur");
		Weapon toAdd2 = new Weapon("Colgate");
		wh.insertWeapon(toAdd);
		wh.insertWeapon(toAdd2);
		List<Weapon> allWeapons = wh.showAllWeapons();
		for(Weapon singleItem : allWeapons) {
			// added "singleItem.getId()" to show item ID for more details
			System.out.println(singleItem.getId() + " - " + singleItem.toString());
		}
	}

}
