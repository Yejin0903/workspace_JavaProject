
public class Book {
	String title;
	String Author;
	void show() { System.out.println(title+""+author);
	}
	

	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	public Book(String title,String author) {
		this.title=title;this.Author=author;
	}

	public static void main(String[] args) {
		Book javaBook=new Book("java,"Ȳ����");
				Book bible = new Book("Bible");
				Book bible=new Book("Bible");
				Book emptyBook=new Book();
				
				emptyBook.show();
				bible.show();
				javaBook.show();
				
				bible.show();
	}

}
