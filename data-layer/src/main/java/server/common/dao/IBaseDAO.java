package server.common.dao;

import java.io.Serializable;

import server.exception.UnableToDeleteException;

public interface IBaseDAO<T> {
	public T getById(Serializable id);
	public Serializable insert(T transientObject);
	public void delete(T transientObject) throws UnableToDeleteException;
}
