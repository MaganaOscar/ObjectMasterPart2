package com.codingdojo.ObjectMasterPart2;
import com.codingdojo.ObjectMasterPart1.Human;

public class Wizard extends Human {
	public Wizard() {
		health = 50;
		intelligence = 8;
	}
	
	public void heal(Human target) {
		target.setHealth(target.getHealth() + intelligence);
	}
	
	public void fireball (Human target) {
		target.setHealth(target.getHealth() - (intelligence * 3));
	}
}
