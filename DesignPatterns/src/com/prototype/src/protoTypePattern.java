package com.prototype.src;

public class protoTypePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book book = new Book("Design Patterns");
       prototype book1=book.clone();
       book.printtitle();
       book1.printtitle();
	}
	
	
   	
}
interface prototype{
	
	prototype clone();

	void printtitle();
}
class Book implements prototype , Cloneable{
	
	
	private String title;

    public Book(String title) {
        this.title = title;
    }
    
    @Override
    public Book clone() {
        try {
            return (Book) super.clone(); // Clone the object using Object's clone method
        } catch (CloneNotSupportedException e) {
            // Handle the exception: In this case, we can rethrow as a runtime exception.
            throw new AssertionError("Cloning not supported for Book class", e);
        }
    }

	public void printtitle() {
		
		System.out.println(title);
	}
	
} 
