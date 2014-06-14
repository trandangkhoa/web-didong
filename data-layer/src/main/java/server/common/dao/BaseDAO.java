package server.common.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import server.exception.UnableToDeleteException;

public abstract class BaseDAO<T> implements IBaseDAO<T> {
	protected SessionFactory sessionFactory;

	private Class<T> type;

	public void setType(Class<T> type) {
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	public T getById(Serializable id){
		return (T) sessionFactory.getCurrentSession().get(type, id);
	}
	
	public Serializable insert(T transientObject){
        Serializable id = sessionFactory.getCurrentSession().save(transientObject);
        return id;
	}
	public void delete(T transientObject) throws UnableToDeleteException {
		try{
            sessionFactory.getCurrentSession().delete(transientObject);
		} 
		catch(Exception e){
			throw new UnableToDeleteException(e.getMessage());
		}
	}
}
