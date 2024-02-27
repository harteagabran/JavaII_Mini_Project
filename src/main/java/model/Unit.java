package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author chumb - djackson16
 * CIS175 - Spring 2024
 * Feb 26, 2024
 */

@Entity
@Table(name="unit")
public class Unit {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	private String unitName;
	private int level;
	private int hitPoints;
	private int strength;
	private int magic;
	private int skill;
	private int sp;
	private int luck;
	private int defense;
	private int resistence;
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<Weapon> listOfWeapons;
	
	public Unit() {
		super();
	}
	
	public Unit(int id, String unitName, int level, int hitPoints, int strength, int magic, int skill, int sp, int luck,
			int defense, int resistence, List<Weapon> listOfWeapons) {
		super();
		this.id = id;
		this.unitName = unitName;
		this.level = level;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.magic = magic;
		this.skill = skill;
		this.sp = sp;
		this.luck = luck;
		this.defense = defense;
		this.resistence = resistence;
		this.listOfWeapons = listOfWeapons;
	}

	public Unit(String unitName, int level, int hitPoints, int strength, int magic, int skill, int sp, int luck,
			int defense, int resistence, List<Weapon> listOfWeapons) {
		super();
		this.unitName = unitName;
		this.level = level;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.magic = magic;
		this.skill = skill;
		this.sp = sp;
		this.luck = luck;
		this.defense = defense;
		this.resistence = resistence;
		this.listOfWeapons = listOfWeapons;
	}

	public Unit(String unitName, int level, int hitPoints, int strength, int magic, int skill, int sp, int luck,
			int defense, int resistence) {
		super();
		this.unitName = unitName;
		this.level = level;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.magic = magic;
		this.skill = skill;
		this.sp = sp;
		this.luck = luck;
		this.defense = defense;
		this.resistence = resistence;
	}

	public Unit(int id, String unitName, int level, int hitPoints, int strength, int magic, int skill, int sp, int luck,
			int defense, int resistence) {
		super();
		this.id = id;
		this.unitName = unitName;
		this.level = level;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.magic = magic;
		this.skill = skill;
		this.sp = sp;
		this.luck = luck;
		this.defense = defense;
		this.resistence = resistence;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getResistence() {
		return resistence;
	}

	public void setResistence(int resistence) {
		this.resistence = resistence;
	}

	public List<Weapon> getListOfWeapons() {
		return listOfWeapons;
	}

	public void setListOfWeapons(List<Weapon> listOfWeapons) {
		this.listOfWeapons = listOfWeapons;
	}

	@Override
	public String toString() {
		return "Unit [id=" + id + ", unitName=" + unitName + ", level=" + level + ", hitPoints=" + hitPoints
				+ ", strength=" + strength + ", magic=" + magic + ", skill=" + skill + ", sp=" + sp + ", luck=" + luck
				+ ", defense=" + defense + ", resistence=" + resistence + ", listOfWeapons=" + listOfWeapons + "]";
	}
}
