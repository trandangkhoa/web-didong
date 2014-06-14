package server.common.service;

import server.common.model.Student;
import server.exception.UnableToDeleteException;
import server.exception.UnableToInsertException;

/**
 * Created by khoa on 5/4/2014.
 */
public interface IStudentService {
    public void insertNewStudent(Student student) throws UnableToInsertException;
    public void deleteStudent(Student student) throws UnableToDeleteException;
    public Student getStudentById(Long id);
}
