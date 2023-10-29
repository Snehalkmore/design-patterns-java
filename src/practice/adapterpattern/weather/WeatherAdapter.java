package practice.adapterpattern.weather;

public class WeatherAdapter {
	
	public int findweather(int zipcode) {
		String city=null;
		if(zipcode==416416) {
			city="sangli";
		}
		WeatherFinder weatherFinder = new WeatherFinderImpl();
		int temparature = weatherFinder.find(city);
		return temparature;
	}

}
