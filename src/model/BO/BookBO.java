package model.BO;

import java.util.ArrayList;

import model.DAO.BookDAO;
import model.bean.Book;

public class BookBO {
	BookDAO b = new BookDAO();

	public ArrayList<Book> getArr(String id) {
		return b.getArr(id);
	}
}
