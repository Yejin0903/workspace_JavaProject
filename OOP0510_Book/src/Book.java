
public class Book {
	String title;
	String author;
	
	public Book(String t){//������
	title = t;
	author = "���ڹ̻�";
	}
	public Book(String t, String a){//������
		title = t;
		author = a;
	}

	public Book() {
	
	}

	public static void main(String[] args) {
		Book javaBook = new Book("Java","Ȳ����"); //������ Book(String t, String a) ȣ��
		System.out.println(javaBook.title+""+javaBook.author);
		Book bible = new Book("Bible");           //������ Book(String t) ȣ��
		System.out.println(bible.title+""+bible.author);
		
		
	}

}
