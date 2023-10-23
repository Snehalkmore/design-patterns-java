package practice.behavioural.templatepattern.renderer;

public class CsvDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "Csv Data";
	}

	@Override
	public String processData(String data) {
		return "Processed "+data;
	}

}
