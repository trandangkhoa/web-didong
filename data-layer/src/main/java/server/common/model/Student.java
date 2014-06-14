package server.common.model;

import javax.persistence.*;

import java.io.Serializable;

/**
 * Created by khoa on 5/4/2014.
 */
@javax.persistence.Entity
@Table(name = "student")
public class Student  implements Serializable {

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long studentId;

    private BaseEntity entity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entity_id",nullable = false)

    public BaseEntity getEntity() {
        return entity;
    }

    public void setEntity(BaseEntity entity) {
        this.entity = entity;
    }
}
