package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author chumb - djackson16
 * CIS175 - Spring 2024
 * Feb 26, 2024
 */

@Entity
@Table(name="weapon")
public class Weapon {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	private String weaponName;
	private char mastery;
	private int endurance;
	
	public Weapon() {
		super();
	}
	
	public Weapon(int id, String weaponName, char mastery, int endurance) {
		super();
		this.id = id;
		this.weaponName = weaponName;
		this.mastery = mastery;
		this.endurance = endurance;
	}
	
	public Weapon(String weaponName, char mastery, int endurance) {
		super();
		this.weaponName = weaponName;
		this.mastery = mastery;
		this.endurance = endurance;
	}
	
	public Weapon(String weaponName) {
		super();
		this.weaponName = weaponName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public char getMastery() {
		return mastery;
	}

	public void setMastery(char mastery) {
		this.mastery = mastery;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	@Override
	public String toString() {
		return "Weapon [id=" + id + ", weaponName=" + weaponName + ", mastery=" + mastery + ", endurance=" + endurance
				+ "]";
	}
}
