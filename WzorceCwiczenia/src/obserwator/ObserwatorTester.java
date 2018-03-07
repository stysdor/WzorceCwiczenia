package obserwator;

public class ObserwatorTester {

	public static void main(String[] args) {
		DanePogodowe dp = new DanePogodowe();
		WarunkiBiezoceWyswietl warB = new WarunkiBiezoceWyswietl(dp);
		dp.ustawOdczyty(20, 70, 1000);
		dp.ustawOdczyty(25, 60, 1000);
		dp.usunObserwatora(warB);
		dp.ustawOdczyty(28 , 60, 1000);


	}

}
