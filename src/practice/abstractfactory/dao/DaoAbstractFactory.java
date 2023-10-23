package practice.abstractfactory.dao;

public abstract class DaoAbstractFactory {
	
	public abstract Dao createDao(String type);

}
