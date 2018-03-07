package MVC;

import javax.sound.midi.*;
import java.util.*;

 
 
public class BeatModel implements BeatModelInterface, MetaEventListener {
	Sequencer sequenser;
	ArrayList<ObserwatorUderzen> listaObsUderzen = new ArrayList<ObserwatorUderzen>();
	ArrayList<ObserwatorBMP> listaObsBMP = new ArrayList<ObserwatorBMP>();
	int bpm = 90;
	
	TreeSet<String> tree = new TreeSet<String>();
	String name = "Dorota";
	
	@Override
	public void inicjuj() {
		konfigurujMidi();
		zbudujSciezkeiRozpocznij();

	}

	private void zbudujSciezkeiRozpocznij() {
		// TODO Auto-generated method stub
		
	}
	
	void uderzenieEvent() {
		powiadomObserwatorow();
	}

	private void powiadomObserwatorow() {
		// TODO Auto-generated method stub
		
	}

	private void konfigurujMidi() {
		try {
			sequenser = MidiSystem.getSequencer();
			sequenser.open();
			Sequence sequence = new Sequence(Sequence.PPQ, 4);
			Track sciezka = sequence.createTrack();	
			sequenser.setTempoInBPM(bpm);
		} catch (Exception ex) {ex.printStackTrace();}
		
	}

	@Override
	public void start() {
		sequenser.start();
		ustawBMP(90);

	}

	@Override
	public void stop() {
		ustawBMP(90);
		sequenser.stop();

	}

	@Override
	public void ustawBMP (int bpm) {
		this.bpm = bpm;
	}

	@Override
	public int pobierzBMP() {
		return bpm;
	}

	@Override
	public void zarejestrujObserwatora(ObserwatorUderzen o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zarejestrujObserwatora(ObserwatorBMP o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wyrejestrujObserwatora(ObserwatorUderzen o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wyrejestrujObserwatora(ObserwatorBMP o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meta(MetaMessage meta) {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void ustawBMP() {
		// TODO Auto-generated method stub
		
	}

}
