package model.BO;

import model.DAO.UserDAO;
import model.bean.User;

public class UserBO {
	UserDAO u = new UserDAO();

	public boolean check(String us, String pw) {
		return u.check(us, pw);
	}

	public User getUser() {
		return u.getUser();
	}

	public boolean edit(String id, String fullname) {
		return u.edit(id, fullname);
	}
}
