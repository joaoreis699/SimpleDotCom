class SimpleDotComGame {
	public static void main(String[] args) {
		
		int numOfGuesses = 0;

		GameHelper helper = new GameHelper();

		SimpleDotCom dot = new SimpleDotCom();

		int randomNumber = (int) (Math.random() * 5);

		int[] locations = {randomNumber,randomNumber+1, randomNumber+2};

		dot.setLocationCells(locations);

		while(dot.numOfHits != 3) {
		
			String guess = helper.getUserInput("Insira um número");
			dot.checkYourself(guess);

			numOfGuesses++;
		}
		System.out.println("Você usou " + numOfGuesses + " palpites");
	}
}	

		
