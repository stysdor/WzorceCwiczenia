package kaczki;

public abstract class Kaczka {
	LatanieInterface latanie;
	KwakanieInterface kwakanie;
	
	public abstract void wyswietl();
	
	public void wykonajLatanie() {
		latanie.lec();
	}
	
	public void wykonajKwakanie() {
		kwakanie.kwacz();
	}
	
	public void ustawLatanieInterface (LatanieInterface li) {
		latanie = li;
	}
	
	public void ustawKwakanieInterface (KwakanieInterface kw) {
		kwakanie = kw;
	}

}
