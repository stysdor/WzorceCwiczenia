package kaczki;

public class DzikaKaczka extends Kaczka {
	
	public DzikaKaczka() {
		latanie = new Latam();
		kwakanie = new Kwacz();
	}

	@Override
	public void wyswietl() {
		System.out.println("Jestem dzik¹ kaczk¹");
		
	}

}
