Declare uma *matriz int* para armazenar os locais das células. Chame-a de *locationCells*.

Declare um  *int* para armazenar o número de acertos. Chame-o de *numOfHits* e configure-o com 0.

Declare um método *checkYourself() que use uma *String* para o palpite do usuário ("1", "3", etc.), verifique a string e retorne um resultado que represente um "acerto", "erro" ou "eliminação".

Declare um método de configuração que represente um "acerto", "erro" ou "eliminação".

Declare um método de configuração *setLocationsCells()* que use uma *matriz int* contendo os três locais da células na forma de *números inteiros*.

Como vai funcionar? 

Método: String checkYourself(String userGuess)

	Capture o palpite do usuário como um parâmetro de String

	Converta o palpite do usuário em um int

	Repita isso para cada local de cúlula da matriz int
		Confronte o palpite de cúlula da matriz int

	Se o palpite do usuário estiver correto
		Incremete o número de acertos
			Verifique se essa foi a última célula:
		
		Se o número de acertos for igual a 3, retorne "eliminação" como resultado
		
		Caso contrário não terá sido uma eliminação, portanto, retorne, "correto"
		
	Caso contrário o palpite do usuário não está correto, portanto, retorne "errado"

Método: void setLocationCells(int[] cellLocations)
	Capture os locais das células como um parâmetro de *matriz int*
	Atribua o parâmtro dos locais da células à variável de instância desses locais
