public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Dealer dealer = new Dealer();
		
		deck.shuffle();
		dealer.init();
	}

}
