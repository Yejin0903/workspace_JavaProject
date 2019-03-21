
public class Book {
	String title;
	String author;
	
	public Book(String t){//생성자
	title = t;
	author = "작자미상";
	}
	public Book(String t, String a){//생성자
		title = t;
		author = a;
	}

	public Book() {
	
	}

	public static void main(String[] args) {
		Book javaBook = new Book("Java","황기태"); //생성자 Book(String t, String a) 호출
		System.out.println(javaBook.title+""+javaBook.author);
		Book bible = new Book("Bible");           //생성자 Book(String t) 호출
		System.out.println(bible.title+""+bible.author);
		
		
	}

}
