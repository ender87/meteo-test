import java.io.IOException;
import java.util.Scanner;

public class Sim {

	public static void main(String[] args) throws IOException {
		final float fTemp = 30.5f;
		WeatherData wdTest = new WeatherData();
		WeatherForecaster printerTest = new WeatherForecaster(wdTest);

		Scanner sc = new Scanner(System.in);

		System.out.println("Program do monitorowania zmian"
				+ "cisnienia atmosferycznego\n"
				+ "wprowadz \"exit\" lub \"close\" "
				+ "by zakonczyc");

		boolean bflag = true;
		while (bflag) {
			System.out.println("Odczytaj aktualne cisnienie: ");
			String userInp = sc.next();
			try {
				wdTest.setWeatherState(Float.parseFloat(userInp), fTemp);
			} catch (Exception e) {
				if ((userInp.equals("exit")) || (userInp.equals("close"))) {
					bflag = false;
				}
			}
		}

		System.out.println("Pomiar zakonczony.");

	}
}
