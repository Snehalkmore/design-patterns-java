package practice.abstractfactory.dao;

public class Test {

	public static void main(String[] args) {
		
		DaoAbstractFactory daoFactoryProducer = DaoFactoryProducer.produce("db");
		Dao dao = daoFactoryProducer.createDao("emp");
		dao.save();
		
	}

}
