package practice.behavioural.templatepattern.computermanufactorer;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Added HardDisk to desktop");
	}

	@Override
	public void addRam() {
		System.out.println("Added RAM to desktop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Added Keyboard to desktop");
	}

}
