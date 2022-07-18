public enum Direction {
	N,S,E,O;
	
	
	public static Direction directionFor(String direction) {
		switch(direction){
			case "n":
				return N;
			case "s":
				return S;
			case "e":
				return E;
			case "o":
				return O;
		}

		throw new IllegalArgumentException("Usa apenas as letras N, S, E e O!");
	}

}
