import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechnungTest {

	@BeforeEach
	void setUp() {
		Rechnung rechnung = new Rechnung();
		double zahl1 = 29.4;
		double zahl2 = 12.3;
	}

	@Test
	void malRechnenOperation() {
		Rechnung rechnung = new Rechnung();
		double zahl1 = 29.4;
		double zahl2 = 12.3;

		assertEquals(361.62d, rechnung.malRechnenOperation(zahl1, zahl2));
	}

	@Test
	void plusRechnenOperation() {
	}

	@Test
	void minusRechnenOperation() {
		Rechnung rechnung = new Rechnung();
		double zahl1 = 10;
		double zahl2 = 4;

		assertEquals(6, rechnung.minusRechnenOperation(zahl1, zahl2));
	}

	@Test
	void durchRechnenOperation() {
		Rechnung rechnung = new Rechnung();
		double zahl1 = 150;
		double zahl2 = 3;

		assertEquals(50, rechnung.durchRechnenOperation(zahl1, zahl2));
	}

	@Test
	void modulaRechnenOperation() {
		Rechnung rechnung = new Rechnung();
		double zahl1 = 10;
		double zahl2 = 2;

		assertEquals(0, rechnung.modulaRechnenOperation(zahl1, zahl2));
	}
}
