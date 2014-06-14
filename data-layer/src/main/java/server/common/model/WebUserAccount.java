package server.common.model;

import java.io.Serializable;

public class WebUserAccount  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Long getWebUserAccountId() {
		return webUserAccountId;
	}
	public void setWebUserAccountId(Long webUserAccountId) {
		this.webUserAccountId = webUserAccountId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((webUserAccountId == null) ? 0 : webUserAccountId.hashCode());
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
		WebUserAccount other = (WebUserAccount) obj;
		if (webUserAccountId == null) {
			if (other.webUserAccountId != null)
				return false;
		} else if (!webUserAccountId.equals(other.webUserAccountId))
			return false;
		return true;
	}

	private Long webUserAccountId;
	private String userName;
	private String password;
}
