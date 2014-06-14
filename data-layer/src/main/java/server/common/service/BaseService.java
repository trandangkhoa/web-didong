package server.common.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by khoa on 5/4/2014.
 */
public abstract class BaseService {
    protected SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    protected Transaction openTransaction(Session s) {
        return s.beginTransaction();
    }

}
