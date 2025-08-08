class SimpleDotCom {

	int[] locationCells;
	int numOfHits = 0;
	int[] correctGuess = {-1, -1, -1};
	int index = 0;

	public void setLocationCells(int [] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {

		int guess = Integer.parseInt(stringGuess);

		String result = "erro";


		for (int cell : locationCells) { 

			if(guess == cell) {
			
				for (int checkingCell : correctGuess) {
			
					System.out.println("Valor atual de checkingCell " + checkingCell);
					if(cell == checkingCell) {	

						result = "Acerto já contabilizado";
						break;
					}
				}
				if(result.equals("Acerto já contabilizado")) {
					break;
				}

				correctGuess[index++] = cell;
					
				result = "acerto";

				numOfHits++;
					
				break;
			}
		}

		if (numOfHits == locationCells.length) {

			result = "eliminação";

			for(int cell : correctGuess) {
				System.out.print(cell + " ");
			}
		}

		System.out.println();
		System.out.println(result);

		return result;
	}
}

