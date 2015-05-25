public class Deck {

	private int[] cards = new int[52];
	private int[] dcards = new int[52];
	private int count = 0;
	private int dcount = 0;

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

	public boolean reshuffle() {

		return false;

	}

	public int deal() {

		return cards[count++];
	}

	public void discard(int a) {

		dcards[dcount++] = a;

	}

}