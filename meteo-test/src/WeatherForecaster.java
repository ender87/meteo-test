import java.util.Observable;
import java.util.Observer;


public class WeatherForecaster implements Observer {
	private float currentPressure = 1010.1f;
	private float lastPressure;
	private Observable observable;

	public WeatherForecaster(Observable o){
		if (o instanceof WeatherData){
			this.observable = o;
			observable.addObserver(this);
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
			WeatherData data = (WeatherData)this.observable;
			this.lastPressure = currentPressure;
			this.currentPressure = data.getPressure();
			printW();
	}
	
	public void printW(){
		System.out.println("Zmiana cisnienia atm:\n"
				+ "najnowszy pomiar: " + this.currentPressure
				+ "\npoprzedni pomiar:" + this.lastPressure);
	}
	
	

}
