package server.common.dao;

import org.hibernate.SessionFactory;
import server.common.model.Student;


/**
 * Created by khoa on 5/4/2014.
 */
public class StudentDAO extends BaseDAO<Student> implements IStudentDAO {

    public StudentDAO(SessionFactory sessionFactory)
    {
        super();
        setType(Student.class);
        this.sessionFactory = sessionFactory;
    }
}
