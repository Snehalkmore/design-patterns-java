package practice.adapterpattern.weather;

public class WeatherUi {
	
	public void showTemparature(int zipCode) {
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findweather(zipCode));
		
	}
	
	public static void main(String[] args) {
		WeatherUi weatherUi = new WeatherUi();
		weatherUi.showTemparature(416416);
	}

}
