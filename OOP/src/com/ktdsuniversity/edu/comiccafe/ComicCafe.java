package com.ktdsuniversity.edu.comiccafe;

public class ComicCafe {
	private final int COMIC_FEE = 1000;
	private int wallet;
	private Comic slamDunk;
	private Comic onePiece;
	private Comic bleach;
	private Comic naruto;
	
	public ComicCafe(int wallet, Comic slamDunk, Comic onePiece, Comic bleach, Comic naruto) {
		this.wallet = wallet;
		this.slamDunk = slamDunk;
		this.onePiece = onePiece;
		this.bleach = bleach;
		this.naruto = naruto;
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
		System.out.println("---------------------\nOUR BOOKS\n----------------------\n"
						  + this.slamDunk.getTitle() + ": " + isBorrowed(this.slamDunk) + "\n"
						  + this.onePiece.getTitle() + ": " + isBorrowed(this.onePiece) + "\n"
						  + this.bleach.getTitle() + ": " + isBorrowed(this.bleach) + "\n"
						  + this.naruto.getTitle() + ": " + isBorrowed(this.naruto) + "\n"
						  + "----------------------");
	}
	
	public void borrowingProcess(Comic comic) {
		this.wallet += COMIC_FEE;
		comic.setIsBorrowed(true);
		System.out.println("You've borrowed " + comic.getTitle());
	}
	
	public void borrowed(String title) {
		if(this.slamDunk.getTitle().equals(title)) {
			borrowingProcess(this.slamDunk);
		} else if(this.onePiece.getTitle().equals(title)) {
			borrowingProcess(this.onePiece);
		} else if(this.bleach.getTitle().equals(title)) {
			borrowingProcess(this.bleach);
		} else if(this.naruto.getTitle().equals(title)) {
			borrowingProcess(this.naruto);
		} else {
			System.out.println("The book you're searching is invalid! (" + title + ")");
		}
	}
	
	public void returned(String title) {
		if(this.slamDunk.getTitle().equals(title)) {
			if(this.slamDunk.getIsBorrowed()) {
				this.slamDunk.setIsBorrowed(false);
				System.out.println("You've returned " + title);
			} else {
				System.out.println(title + " has not been borrowed!");
			}
		} else if(this.onePiece.getTitle().equals(title)) {
			if(this.onePiece.getIsBorrowed()) {
				this.onePiece.setIsBorrowed(false);
				System.out.println("You've returned " + title);
			} else {
				System.out.println(title + " has not been borrowed!");
			}
		} else if(this.bleach.getTitle().equals(title)) {
			if(this.bleach.getIsBorrowed()) {
				this.bleach.setIsBorrowed(false);
				System.out.println("You've returned " + title);
			} else {
				System.out.println(title + " has not been borrowed!");
			}
		} else if(this.naruto.getTitle().equals(title)) {
			if(this.naruto.getIsBorrowed()) {
				this.naruto.setIsBorrowed(false);
				System.out.println("You've returned " + title);
			} else {
				System.out.println(title + " has not been borrowed!");
			}
		} else {
			System.out.println("The book you're searching is invalid! (" + title + ")");
		}
	}
	
	public static void main(String[] args) {
		ComicCafe nolSoop = new ComicCafe(5000, new Comic("Slam Dunk"), new Comic("One Piece"), new Comic("Bleach"), new Comic("Naruto"));
		
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
