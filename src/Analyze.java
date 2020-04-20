import java.util.ArrayList;

public class Analyze {

	public static int totalPages(ArrayList<Integer> bookPages) {
		int totalPages = 0;
		for (int i = 0; i < bookPages.size(); ++i ) {
			totalPages += bookPages.get(i);
		}

		return totalPages;
	}

	public static double averagePages(ArrayList<Integer> bookPages) {
		double totalPages = (double) totalPages(bookPages);

		return (totalPages / bookPages.size());
	}

	public static String listTitles(ArrayList<String> bookTitles) {
		String formattedTitles = "[ ";

		for (int i = 0; i < bookTitles.size(); ++i) {
			if (i != bookTitles.size() - 1) {
				formattedTitles += bookTitles.get(i) + ", ";
			} else {
				formattedTitles += bookTitles.get(i) + " ]";
			}
		}

		return formattedTitles;
	}

	public static String listAuthors(ArrayList<String> bookAuthors) {
		String formattedAuthors = "[ ";

		for (int i = 0; i < bookAuthors.size(); ++i) {
			if (i != bookAuthors.size() - 1) {
				formattedAuthors += bookAuthors.get(i) + ", ";
			} else {
				formattedAuthors += bookAuthors.get(i) + " ]";
			}
		}

		return formattedAuthors;
	}

	public static String listGenres(ArrayList<String> bookGenres) {
		String formattedGenres = "[ ";

		for (int i = 0; i < bookGenres.size(); ++i) {
			if (i != bookGenres.size() - 1) {
				formattedGenres += bookGenres.get(i) + ", ";
			} else {
				formattedGenres += bookGenres.get(i) + " ]";
			}
		}

		return formattedGenres;
	}
}
