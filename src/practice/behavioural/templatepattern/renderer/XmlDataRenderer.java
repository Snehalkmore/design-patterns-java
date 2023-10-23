package practice.behavioural.templatepattern.renderer;

public class XmlDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "Xml Data";
	}

	@Override
	public String processData(String data) {
		return "Processed "+data;
	}

}
