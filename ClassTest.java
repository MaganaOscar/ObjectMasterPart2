package com.codingdojo.ObjectMasterPart2;

public class ClassTest {

	public static void main(String[] args) {
		Ninja tester1 = new Ninja();
		Samurai tester2 = new Samurai();
		Samurai tester4 = new Samurai();
		Wizard tester3 = new Wizard();
		
		tester1.steal(tester2);
		tester1.runAway();
		System.out.println(tester1.getHealth());
		System.out.println(tester2.getHealth());
		tester3.fireball(tester1);
		System.out.println(tester1.getHealth());
		tester3.heal(tester2);
		System.out.println(tester2.getHealth());
		tester2.deathBlow(tester3);
		System.out.println(tester3.getHealth());
		System.out.println(tester2.getHealth());
		System.out.println(tester2.howMany());
	}

}
