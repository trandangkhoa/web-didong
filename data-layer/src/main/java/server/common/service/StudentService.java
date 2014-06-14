package server.common.service;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import server.common.dao.IEntityDAO;
import server.common.dao.IStudentDAO;
import server.common.model.Student;
import server.exception.UnableToDeleteException;
import server.exception.UnableToInsertException;

/**
 * Created by khoa on 5/4/2014.
 */
public class StudentService extends BaseService implements IStudentService {
    private IStudentDAO studentDAO;
    private IEntityDAO entitytDAO;

    public StudentService(SessionFactory sessionFactory, IStudentDAO studentDAO, IEntityDAO entitytDAO){
        this.entitytDAO = entitytDAO;
        this.sessionFactory  = sessionFactory;
        this.studentDAO = studentDAO;
        this.entitytDAO = entitytDAO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertNewStudent(Student student) throws UnableToInsertException {
        try{
            if(student.getEntity() == null){
                throw new UnableToInsertException("Missing entity info");
            }

            // we assume no entity record associate with this student exists, so create it first
            entitytDAO.insert(student.getEntity());
            studentDAO.insert(student);
        }
        catch(Exception ex){
            throw new UnableToInsertException(ex.getMessage());
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteStudent(Student student) throws UnableToDeleteException {
        try{
            studentDAO.delete(student);
        }
        catch(Exception ex){
            throw new UnableToDeleteException(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public Student getStudentById(Long id) {
        try{
            Student res = studentDAO.getById(id);
            return res;
        }
        catch(Exception ex){
        }

        return null;
    }
}
