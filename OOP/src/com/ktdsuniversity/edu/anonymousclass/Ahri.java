package com.ktdsuniversity.edu.anonymousclass;

public class Ahri implements Unit {
	private String characterName;
	private String playerName;
	
	private int level;
	protected int hp;
	private int mana;
	private int money;
	private int attackDamage;
	protected int defence;
	private float attackSpeed;
	
	public Ahri(String playerName) {
		this.characterName = "Ahri";
		this.playerName = playerName;
		this.level = 1;
		this.hp = 100;
		this.mana = 100;
		this.attackDamage = 20;
		this.defence = 10;
		this.attackSpeed = 1.5f;
	}

	@Override
	public void move() {
		System.out.println(this.characterName + "(" + this.playerName + ") is moving.");
	}

	@Override
	public void basicAttack(Unit otherCharacter) {
		int otherCharacterHp = otherCharacter.getHp();
		int attackDamage = this.attackDamage - otherCharacter.getDefence();
		
		if(attackDamage < 0) {
			attackDamage = 0;
		}
		
		otherCharacterHp -= attackDamage;
		
		otherCharacter.setHp(this.attackDamage - otherCharacter.getDefence());
	}

	@Override
	public void skillAttack(Unit otherCharacter) {
		if(this.mana < 10) {
			return;
		}
		
		this.mana -= 10;
		
		int otherCharacterHp = otherCharacter.getHp();
		int attackDamage = this.attackDamage + this.level - otherCharacter.getDefence();
		
		if(attackDamage < 0) {
			attackDamage = 0;
		}
		
		otherCharacterHp -= attackDamage;
		
		otherCharacter.setHp(this.attackDamage - otherCharacter.getDefence());
	}

	@Override
	public void recall() {
		System.out.println(this.characterName + "(" + this.playerName + ") is recalling.");
	}

	@Override
	public void buyItem() {
		this.money -= 100;
		System.out.println(this.money);
	}

	@Override
	public void sellItem() {
		this.money += 80;
		System.out.println(this.money);
	}

	@Override
	public void speak() {
		String[] scripts = {"얍!", "이동~", "공격~"};
		System.out.println(scripts[(int)(Math.random() * scripts.length)]);
	}

	@Override
	public void emotion() {
		String[] emotions = {"웃기", "울기"};
		System.out.println(emotions[(int)(Math.random() * emotions.length)]);
	}

	@Override
	public void die() {
		System.out.println(this.characterName + "(" + this.playerName + ") has been executed.");
	}

	@Override
	public void takeMinions() {
		this.money += 3;
	}

	@Override
	public int getHp() {
		return this.hp;
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public int getDefence() {
		return this.defence;
	}
	
}
