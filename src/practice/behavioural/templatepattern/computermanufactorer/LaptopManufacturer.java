package practice.behavioural.templatepattern.computermanufactorer;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Added HardDisk to laptop");
	}

	@Override
	public void addRam() {
		System.out.println("Added RAM to laptop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Added Keyboard to laptop");
	}

}
