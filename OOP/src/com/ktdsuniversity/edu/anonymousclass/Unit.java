package com.ktdsuniversity.edu.anonymousclass;

public interface Unit {
	public void move();
	public void basicAttack(Unit otherCharacter);
	public void skillAttack(Unit otherCharacter);
	public void recall();
	public void buyItem();
	public void sellItem();
	public void speak();
	public void emotion();
	public void die();
	public void takeMinions();
	
	public int getHp();
	public void setHp(int hp);
	public int getDefence();
}
