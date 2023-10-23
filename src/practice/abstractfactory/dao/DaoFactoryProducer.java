package practice.abstractfactory.dao;

public class DaoFactoryProducer {
	
	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory daoAbstractFactory = null;
		
		if(factoryType.equals("db")) {
			daoAbstractFactory = new DbDaoFactory();
		}else if(factoryType.equals("xml")) {
			daoAbstractFactory = new XmlDaoFactory();
		}
		return daoAbstractFactory;
	}

}
