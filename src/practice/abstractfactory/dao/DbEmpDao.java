package practice.abstractfactory.dao;

public class DbEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving employee to database.");
	}

}
