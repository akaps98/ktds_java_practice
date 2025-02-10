package com.ktdsuniversity.edu.anonymousclass;

public class Game {
	public static void main(String[] args) {
		Unit ahri = new Ahri("Faker");
		
		// 클래스 구현없이 인스턴스를 만들려면 new 추상클래스 혹은 인터페이스() {}
		Unit other = new Unit() {
			private String characterName = "hidden";
			private String playerName = "Chovy";
			
			private int level = 100;
			protected int hp = 10000;
			private int mana = 20000;
			private int money = 999999;
			private int attackDamage = 5000;
			protected int defence = 100000;
			private float attackSpeed = 0.1f;

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
			
		};
		
		ahri.move();
		other.move();
	}
}
