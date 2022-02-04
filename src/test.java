public class test {

	static void addiere(int summand1, int summand2, int ...summandX) {
		int ergebnis = summand1 + summand2;
		for (int i = 0; i < summandX.length; i++){
			ergebnis = summandX[i]+ergebnis;
		}
		System.out.println(ergebnis);
	}

	public static void main(String[] args) {
		addiere(2 ,4);//mit zwei Argumenten
		addiere(2, 4, 6, 8, 10, 12, 14, 16);//Aufruf mit mehreren Argumenten
	}
}
