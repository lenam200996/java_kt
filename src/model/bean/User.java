package model.bean;

public class User {
	private String username, password, fullname, id;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String username, String password, String fullname, String id) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.id = id;
	}

	public User() {
		super();
	}

}
