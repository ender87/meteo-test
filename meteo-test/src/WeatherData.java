import java.util.Observable;

/**
 * @author eandwro
 * Use this observable to monitor/inform all
 * observators responsible for user output
 */
public class WeatherData extends Observable {
	private float pressure;
	private float temp;
	
	// poinformuj wszystkich obserwatorow o zmianie stanu pogody
	private void weatherStateChange(){
		setChanged();
		notifyObservers();
	}
	
	// ustaw nowy stan pogodowy (np. odczytany ze stacji, neta, user inputu)
	// nowy stan = zmiana, wiec wywolujemy weatherStateChange
	public void setWeatherState(float pressure, float temp){
		this.temp = temp;
		this.pressure = pressure;
		weatherStateChange();
	}

	public float getPressure(){
		return this.pressure;
	}
	
	public float getTemp(){
		return this.temp;
	}
	
}
