package com.codingdojo.ObjectMasterPart2;
import com.codingdojo.ObjectMasterPart1.Human;

public class Samurai extends Human {
	private static int allSamurai = 0;
	public Samurai() {
		health = 200;
		allSamurai++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(0);
		health = 200/2;
	}
	
	public void meditate() {
		health += (this.getHealth()/2);
	}
	
	public int howMany() {
		return allSamurai;
	}
}
