import java.util.ArrayList;

class SimpleDotComGame {
	public static void main(String[] args) {
		
		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		SimpleDotCom dot = new SimpleDotCom();

		int randomNumber = (int) (Math.random() * 5);

		ArrayList<String> locations = new ArrayList<String>();

		locations.add(String.valueOf(randomNumber));
		locations.add(String.valueOf(randomNumber+1));
		locations.add(String.valueOf(randomNumber+2));

		dot.setLocationCells(locations);

		while(true) {
		
			String guess = helper.getUserInput("Insira um número");

			if(dot.checkYourself(guess) == "kill") {
			
				break;
			}

			numOfGuesses++;
		}
		System.out.println("Você usou " + numOfGuesses + " palpites");
	}
}	

		
