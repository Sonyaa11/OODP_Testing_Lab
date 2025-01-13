package Workshop1;

public class Task16 {
	
	    public static void main(String[] args) {
	        // Create Book objects
	        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
	        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

	        // Print Book details
	        System.out.println(book1);
	        System.out.println(book2);
	    }
	}

	class Book {
	    private String title;
	    private String author;
	    private int year;

	    
	    public Book(String title, String author, int year) {
	        this.title = title;
	        this.author = author;
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return "Book Title: " + title + ", Author: " + author + ", Year: " + year;
	    }
	}



