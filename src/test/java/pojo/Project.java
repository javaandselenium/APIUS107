package pojo;

public class Project {
	int id;
	String title;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String author;
	String name;
	
	public Project(int id, String title, String author, String name) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.name = name;
	}
	
	Project(){
		
	}

}
