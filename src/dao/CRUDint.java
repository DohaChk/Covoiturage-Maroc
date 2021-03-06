package dao;

import java.util.List;

public interface CRUDint<T> {
	/******* methodes *********/
	public void add(T obj);
	
	public void delete(int id);
		
	public T getObjectById(int id);
	
	public void update(T obj);
		
	public List<T> getAllObject();
	
	public T getObjectByEmailPassword( String mail, String password);

}
