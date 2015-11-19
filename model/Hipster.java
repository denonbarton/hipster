package hipster.model;

/**
 * @author dbar0540
 * @version 0.x Nv 14, 2015
 * 
 */
public class Hipster

{
	private String name;
	private String[] hipsterPhrases;
	private Book[] hipsterBooks;

	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();

	}

	private void setupArray()
	{
		hipsterPhrases[0] = "that is so mainstream";
		hipsterPhrases[1] = " ok cool ";
		hipsterPhrases[2] = " awesome ";
		hipsterPhrases[3] = " you are diffrent";
	}

	public String getName()
	{
		return name;
	}

	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("");
		firstBook.setSubject("cats");
		firstBook.setPageCount(60);
		firstBook.setPrice(145.06);
		firstBook.setTitle("City of ember");
		
		secondBook = new Book();
		secondBook.setAuthor("");
		secondBook.setSubject("");
		secondBook.setPageCount(1);
		secondBook.setPrice(1);
		secondBook.setTitle("");
		
		
		
		thirdBook = new Book(855, "Owen Astrachan","Computer Science", "Conputer Science Tapsestry", 14.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
}
