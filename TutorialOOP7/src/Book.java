
public class Book {
	String title;
	String Author;
	void show() { System.out.println(title+""+author);
	}
	

	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	public Book(String title,String author) {
		this.title=title;this.Author=author;
	}

	public static void main(String[] args) {
		Book javaBook=new Book("java,"황기태");
				Book bible = new Book("Bible");
				Book bible=new Book("Bible");
				Book emptyBook=new Book();
				
				emptyBook.show();
				bible.show();
				javaBook.show();
				
				bible.show();
	}

}
