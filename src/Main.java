import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Rechnung rechnung = new Rechnung();


		System.out.println("Wilkommen beim Artihemtische Funktionen Programm");
		System.out.println("Sie haben mit diesem Programm die Möglichkeit Rechnungen durchzuführen (/, *, +, -, %");



		System.out.println("Wählen Sie eine Operation aus: (/, *, +, -, %): ");
		Scanner sc = new Scanner(System.in);
		String operation = sc.nextLine();

		if(Objects.equals(operation, "+")) {
			int counter = 1;
			System.out.println("Wie viele zahlen möchten sie addieren?");
			String anzahlZahlen = sc.nextLine();
			int anzahlZahlenConverted = Integer.parseInt(anzahlZahlen);

			while (counter <= anzahlZahlenConverted) {
				System.out.println("Geben Sie eine Zahl ein: ");
				double zahl = sc.nextDouble();
				ArrayList list = new ArrayList<Double>();
				list.add(zahl);
				counter += 1;
			}

		}else {
			System.out.println("Geben Sie die erste Zahl ein: ");
			String zahl1 = sc.nextLine();
			double numberZahl1 = Double.parseDouble(zahl1);

			System.out.println("Geben Sie die erste Zahl ein: ");
			String zahl2 = sc.nextLine();
			double numberZahl2 = Double.parseDouble(zahl2);

			switch (operation) {
			case "/":
				System.out.println("Die Lösung Lautet: ");
				rechnung.durchRechnenOperation(numberZahl1, numberZahl2);
				break;
			case "*":
				System.out.println("Die Lösung Lautet: ");
				rechnung.malRechnenOperation(numberZahl1, numberZahl2);
				break;
			case "+":
				System.out.println("Die Lösung lautet: ");
				rechnung.plusRechnenOperation(1.9, 2.0,3.0,40,0);
				break;
			case "-":
				System.out.println("Die Lösung Lautet: ");
				rechnung.minusRechnenOperation(numberZahl1, numberZahl2);
				break;
			case "%":
				System.out.println("Die Lösung Lautet: ");
				rechnung.modulaRechnenOperation(numberZahl1, numberZahl2);
			default:
			}
		}







	}
}
