package com.codingdojo.ObjectMasterPart2;
import com.codingdojo.ObjectMasterPart1.Human;

public class Ninja extends Human {
	public Ninja () {
		stealth = 10;
	}
	
	public void steal(Human target) {
		target.setHealth(target.getHealth() - stealth);
		health += stealth;
	}
	
	public void runAway() {
		health -= 10;
	}
}
