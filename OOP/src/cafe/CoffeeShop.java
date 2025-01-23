package cafe;

public class CoffeeShop {
	Coffee iceAmericano;
	Coffee hotAmericano;

	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		super();
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}

	/**
	 * 커피숍에서 커피를 주문.
	 * 
	 * @param menu 1번: 아이스 아메리카노, 2번: 뜨거운 아메리카노
	 * @param quantity 커피 주문 수량 (한 번에 하나의 커피 종류만 주문할 수 있다.)
	 * @return 결제해야하는 금액
	 */
	
	public int orderCoffee(int menu, int quantity) {
		if(menu == 1) {
			return this.iceAmericano.price * quantity;
		} else if(menu == 2) {
			return this.hotAmericano.price * quantity;
		}
		return 0; // 판매하지 않는 커피를 주문하면 결제할 필요가 없음.
	}
}
