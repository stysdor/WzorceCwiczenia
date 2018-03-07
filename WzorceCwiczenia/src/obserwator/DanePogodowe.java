package obserwator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {
	private ArrayList<Obserwator> obserwatorzy;
	private float temperatura;
	private float cisnienie;
	private float wilgotnosc;

	public DanePogodowe() {
		obserwatorzy = new ArrayList<Obserwator>();
	}
	
	@Override
	public void zarejestrujObserwatora(Obserwator o) {
		obserwatorzy.add(o);

	}

	@Override
	public void usunObserwatora(Obserwator o) {
		obserwatorzy.remove(o);

	}

	@Override
	public void powiadomObserwatorow() {
		for(Obserwator o : obserwatorzy) {
			o.aktualizacja(temperatura, wilgotnosc, cisnienie);
		}

	}
	
	public void ustawOdczyty(float temp, float wilg, float cisn) {
		this.temperatura = temp;
		this.wilgotnosc = wilg;
		this.cisnienie = cisn;
		odczytyZmiana();
	}
	
	public void odczytyZmiana() {	
		powiadomObserwatorow();
	}
	
	

}
