package obserwator;

public class WarunkiBiezoceWyswietl implements Obserwator, WyswietlElement {
	
	private float temperatura;
	private float wilgotnosc;
	private Podmiot DanePogodowe;
	
	public WarunkiBiezoceWyswietl (Podmiot DanePogod) {
		this.DanePogodowe = DanePogod;
		DanePogodowe.zarejestrujObserwatora(this);
	}
	

	@Override
	public void wyswietl() {
		System.out.println("Bie¿¹ce warunki: temperatura - " + temperatura + " st. Celcjusza, wlgotnosc - " + wilgotnosc + " %.");

	}

	@Override
	public void aktualizacja(float temp, float wilg, float cisn) {
		temperatura = temp;
		wilgotnosc = wilg;
		wyswietl();

	}

}
