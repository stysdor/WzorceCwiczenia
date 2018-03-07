package kaczki;

public class KaczkiTester {

	public static void main(String[] args) {
		Kaczka kaczka = new DzikaKaczka();
		kaczka.wyswietl();
		kaczka.wykonajKwakanie();
		kaczka.wykonajLatanie();
		
		Kaczka model = new ModelKaczki();
		model.wykonajLatanie();
		model.wykonajKwakanie();
		model.ustawLatanieInterface(new LatamZNapedemRakietowym());
		 model.wykonajLatanie();

	}

}
