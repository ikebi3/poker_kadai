public class Deck {

	private int[] cards = new int[52];

	Deck() {

		for(int i=0; i<cards.length; i++) {

			cards[i]=i;
		}

	}

	void shuffle() {

		for (int i=0; i < cards.length; i++) {

			int index = (int)(Math.random() * i);

			int tmp = cards[i];
			cards[i] = cards[index];
			cards[index] = tmp;
		}
	}

}
