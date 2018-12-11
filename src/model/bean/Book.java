package model.bean;

public class Book {
	private String id, tensach, nhaxb, namsx;
	private int soluong;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getNhaxb() {
		return nhaxb;
	}

	public void setNhaxb(String nhaxb) {
		this.nhaxb = nhaxb;
	}

	public String getNamsx() {
		return namsx;
	}

	public void setNamsx(String namsx) {
		this.namsx = namsx;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public Book(String id, String tensach, String nhaxb, String namsx, int soluong) {
		super();
		this.id = id;
		this.tensach = tensach;
		this.nhaxb = nhaxb;
		this.namsx = namsx;
		this.soluong = soluong;
	}

	public Book() {
		super();
	}

}
