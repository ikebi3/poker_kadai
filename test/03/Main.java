public class Main {

	public static void main(String[] args) {
		Players  []	p = new Players[4];
		//4人が着席している状態
		
		for(int i=0; i<4; i++) {
			
			p[i] = new Player();
			
		}
		
		//1人が離席
		p[0] = new Players();
		
		//全員のdiscardを呼び出す
		for(int i=0; i<4; i++) {
			
			p[0].discard();
			
		}

	}

}
