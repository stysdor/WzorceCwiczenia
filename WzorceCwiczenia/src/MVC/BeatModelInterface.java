package MVC;

public interface BeatModelInterface {
	void inicjuj();
	
	void start();
	
	void stop();
	
	void ustawBMP();
	
	int pobierzBMP();
	
	void zarejestrujObserwatora(ObserwatorUderzen o);
	
	void zarejestrujObserwatora(ObserwatorBMP o);
	
	void wyrejestrujObserwatora(ObserwatorUderzen o);
	
	void wyrejestrujObserwatora(ObserwatorBMP o);

	void ustawBMP(int bpm);

}
