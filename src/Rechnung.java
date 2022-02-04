import java.util.Arrays;

public class Rechnung implements Funktionen{


	@Override
	public double malRechnenOperation(double zahl1, double zahl2) {
		double resultat = zahl1 * zahl2;
		System.out.println(resultat);
		return resultat;
	}

	@Override
	public double plusRechnenOperation(double zahl1, double zahl2, double ...zahlx) {
		double ergebnis = zahl1 + zahl2;
		for (int i = 0; i < zahlx.length; i++){
			ergebnis = zahlx[i]+ergebnis;
		}
		System.out.println(ergebnis);
		return ergebnis;
	}

	@Override
	public double minusRechnenOperation(double zahl1, double zahl2) {
		double resultat = zahl1 - zahl2;
		System.out.println(resultat);
		return resultat;
	}

	@Override
	public double durchRechnenOperation(double zahl1, double zahl2) {
		double resultat = zahl1 / zahl2;
		System.out.println(resultat);
		return resultat;

	}

	@Override
	public double modulaRechnenOperation(double zahl1, double zahl2) {
		double resultat = zahl1 % zahl2;
		System.out.println(resultat);
		return resultat;
	}


}
