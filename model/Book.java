package hipster.model;

/**
 * 
 * @author dbar0540
 *
 */
public class Book
{
	private int pageCount;
	private String author;
	private String subject;
	private String title;
	private double price;
	
	public Book()
	{	
		this.pageCount = 0;
		this.author = "";
		this.subject = "";
		this.title = "";
		this.price = -0.00;
		
	}
	public Book(int pageCount, String Author, String subject, String title, double price)
	{
		this.pageCount = pageCount;
		this.author = author;
		this.subject = subject;
		this.price = price;
		this.title = title;
	}
	
	public pageCount()
	{
		return pageCount;
	}
	
	
}
