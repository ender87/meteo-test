
public class Sim {

	public static void main(String[] args) {
		WeatherData wdTest = new WeatherData();
		WeatherForecaster printerTest = new WeatherForecaster(wdTest);
		
		wdTest.setWeatherState(1250.5f, 30.0f);
		wdTest.setWeatherState(1000.5f, 30.0f);
		
	}

}

