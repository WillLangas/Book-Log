/**
 * Creates the Book object, all data access and editing will be dealt
 * with by the Handler class, which will also ensure appropriate input
 * 
 * @author Will Langas
 */
public class Book {

	private String title;
	private String genre;
	private int numPages; 

	/**
	 * @param title 
	 */
	public static void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return title of book
	 */
	public static String getTitle() {
		return this.title;
	}

	/**
	 * @param genre
	 */
	public static void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return genre of book
	 */
	public static String getGenre() {
		return this.genre;
	}

	/**
	 * @param numPages
	 */
	public static void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	/**
	 * @return number of pages
	 */
	public static int getNumPages() {
		return this.numPages;
	}

}