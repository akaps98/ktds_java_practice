package com.ktdsuniversity.edu.comiccafe;

public class ComicCafe {
	// 클래스 상수를 초기화 시키는 방법
	// 1. 클래스 상수 선언과 동시에 값 초기화
	private static final int COMIC_FEE = 1000;
	
	// 2. 클래스 상수만 선언해두고 static scope에서 값 초기화 static {}
	public static final int VIP_RENTAL_FEE;
	
	static {
		VIP_RENTAL_FEE = 100;
	}
	
	private int wallet;
	private Comic[] comics;
//	private Comic slamDunk;
//	private Comic onePiece;
//	private Comic bleach;
//	private Comic naruto;

//	public ComicCafe(int wallet, Comic slamDunk, Comic onePiece, Comic bleach, Comic naruto) {
//		this.wallet = wallet;
//		this.slamDunk = slamDunk;
//		this.onePiece = onePiece;
//		this.bleach = bleach;
//		this.naruto = naruto;
//	}
	
	public ComicCafe(int wallet, Comic[] comics) {
		this.comics = comics;
		this.wallet = wallet;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	public String isBorrowed(Comic comic) {
		if(comic.getIsBorrowed()) {
			return "not available";
		} else {
			return "available!";
		}
	}
	
	public void printInfo() {
		System.out.println("---------------------\nOUR BOOKS\n----------------------\n");
		
		for(int i = 0; i < this.comics.length; i++) {
			System.out.println(this.comics[i].getTitle() + ": " + this.isBorrowed(this.comics[i]) + "\n");
		}
		
		System.out.println("----------------------");
		
//		System.out.println("---------------------\nOUR BOOKS\n----------------------\n"
//						  + this.slamDunk.getTitle() + ": " + isBorrowed(this.slamDunk) + "\n"
//						  + this.onePiece.getTitle() + ": " + isBorrowed(this.onePiece) + "\n"
//						  + this.bleach.getTitle() + ": " + isBorrowed(this.bleach) + "\n"
//						  + this.naruto.getTitle() + ": " + isBorrowed(this.naruto) + "\n"
//						  + "----------------------");
	}
	
	public void borrowingProcess(Comic comic) {
		this.wallet += ComicCafe.COMIC_FEE;
		comic.setIsBorrowed(true);
		System.out.println("You've borrowed " + comic.getTitle());
	}
	
	public void borrowed(String title) {
		for(int i = 0; i < this.comics.length; i++) {
			if(this.comics[i].getTitle().equals(title)) {
				borrowingProcess(this.comics[i]);
				return;
			}
		}
		
		System.out.println("The book you're searching is invalid! (" + title + ")");
		
//		if(this.slamDunk.getTitle().equals(title)) {
//			borrowingProcess(this.slamDunk);
//		} else if(this.onePiece.getTitle().equals(title)) {
//			borrowingProcess(this.onePiece);
//		} else if(this.bleach.getTitle().equals(title)) {
//			borrowingProcess(this.bleach);
//		} else if(this.naruto.getTitle().equals(title)) {
//			borrowingProcess(this.naruto);
//		} else {
//			System.out.println("The book you're searching is invalid! (" + title + ")");
//		}
	}
	
	public void returned(String title) {
		for(int i = 0; i < this.comics.length; i++) {
			if(this.comics[i].getTitle().equals(title)) {
				if(this.comics[i].getIsBorrowed()) {
					this.comics[i].setIsBorrowed(false);
					System.out.println("You've returned " + title);
					return;
				} else {
					System.out.println(title + " has not been borrowed!");
					return;
				}
			}
		}
		
		System.out.println("The book you're searching is invalid! (" + title + ")");
		
//		if(this.slamDunk.getTitle().equals(title)) {
//			if(this.slamDunk.getIsBorrowed()) {
//				this.slamDunk.setIsBorrowed(false);
//				System.out.println("You've returned " + title);
//			} else {
//				System.out.println(title + " has not been borrowed!");
//			}
//		} else if(this.onePiece.getTitle().equals(title)) {
//			if(this.onePiece.getIsBorrowed()) {
//				this.onePiece.setIsBorrowed(false);
//				System.out.println("You've returned " + title);
//			} else {
//				System.out.println(title + " has not been borrowed!");
//			}
//		} else if(this.bleach.getTitle().equals(title)) {
//			if(this.bleach.getIsBorrowed()) {
//				this.bleach.setIsBorrowed(false);
//				System.out.println("You've returned " + title);
//			} else {
//				System.out.println(title + " has not been borrowed!");
//			}
//		} else if(this.naruto.getTitle().equals(title)) {
//			if(this.naruto.getIsBorrowed()) {
//				this.naruto.setIsBorrowed(false);
//				System.out.println("You've returned " + title);
//			} else {
//				System.out.println(title + " has not been borrowed!");
//			}
//		} else {
//			System.out.println("The book you're searching is invalid! (" + title + ")");
//		}
	}
	
	public static void main(String[] args) {
		Comic[] comics = {new Comic("Slam Dunk"), new Comic("One Piece"), new Comic("Bleach"), new Comic("Naruto")};
		ComicCafe nolSoop = new ComicCafe(5000, comics);
		
		nolSoop.printInfo(); // prints all comics in comic cafe
		
		nolSoop.borrowed("Kingdom"); // there is no Kingdom
		
		nolSoop.borrowed("One Piece");
		nolSoop.borrowed("Naruto");
		
		nolSoop.printInfo(); // prints all comics in comic cafe
		
		nolSoop.returned("Bleach"); // not borrowed
		
		nolSoop.returned("Naruto");
		
		nolSoop.printInfo(); // prints all comics in comic cafe
		
		System.out.println("We own " + nolSoop.getWallet()); // they have borrowed 2 books in total. 5000 += (1000 + 1000)
	}
}
