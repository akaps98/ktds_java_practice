package cafe;

/**
 * 아이스 아메리카노와 따뜻한 아메리카노 판매하는 커피숍
 * 
 * 클래스를 작성하는 순서
 * 멤버변수, 생성자, 메소드 -> 어떤 순서로 작성되어야 하는가?
 * 
 * 1. 상수
 * 2. 멤버변수
 * 3. 생성자
 * 4. 메소드
 */

public class MainStreet {
	public static void main(String[] args) {
//		CoffeeShop megaCoffee = new CoffeeShop();
//		megaCoffee.hotAmericano += 700;
//
//		int megaOrderPrice = megaCoffee.orderCoffee(1, 5);
//		System.out.println(megaOrderPrice);
//		
//		CoffeeShop starbucks = new CoffeeShop();
//		
//		starbucks.hotAmericano = 6000;
//		starbucks.iceAmericano = 7000;
//
//		System.out.println(starbucks.orderCoffee(2, 2));
		Coffee ice = new Coffee("ice americano", 2500);
		Coffee hot = new Coffee("hot americano", 2000);
		
		CoffeeShop cs = new CoffeeShop(ice, hot);
		
		System.out.println(cs.orderCoffee(1, 5));
	}
}
