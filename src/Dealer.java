public class Dealer {

	Deck deck = new Deck();

	public void init() {

		deck.shuffle();

		deck.deal();
		deck.deal();
		deck.deal();
		deck.deal();
		deck.deal();

		turn();

	}

	private void turn() {
		init();

	}
}