package server.common.dao;

import org.hibernate.SessionFactory;
import server.common.model.BaseEntity;

public class EntityDAO extends BaseDAO<BaseEntity> implements IEntityDAO {

	public EntityDAO(SessionFactory sessionFactory)
    {
		super();
        setType(BaseEntity.class);
        this.sessionFactory = sessionFactory;
	}
}
