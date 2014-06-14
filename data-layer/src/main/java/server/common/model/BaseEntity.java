package server.common.model;

import org.hibernate.annotations.DiscriminatorFormula;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "entity")
@DiscriminatorFormula(value = "entity")
public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_id", nullable = false)
	public Long getEntityId() {
		return entityId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((entityId == null) ? 0 : entityId.hashCode());
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
		BaseEntity other = (BaseEntity) obj;
		if (entityId == null) {
			if (other.entityId != null)
				return false;
		} else if (!entityId.equals(other.entityId))
			return false;
		return true;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	@Column(name = "entity_name", nullable = true, length = 50)
	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	

	@Column(name = "date_join", nullable = true)
	public Date getDateJoin() {
		return dateJoin;
	}

	public void setDateJoin(Date dateJoin) {
		this.dateJoin = dateJoin;
	}

	@Column(name = "date_of_birth", nullable = true)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	private Long entityId;
	private String entityName;	
	private Date dateOfBirth;
	private Date dateJoin;

	
}
