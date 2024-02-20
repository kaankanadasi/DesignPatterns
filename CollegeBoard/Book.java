package CollegeBoard;

public class Book {
    private int numPages;
    private String bookTitle;

    public Book(int pages, String title) {
        numPages = pages;
        bookTitle = title;
    }
    public String toString () {
        return bookTitle + " " + numPages;
    }
    public int length () {
        return numPages;
    }


    public class AudioBook extends Book {
        private int numMinutes;
        public AudioBook (int minutes, int pages, String title) {
            super (pages, title);
            numMinutes = minutes;
        }
        public int length () {
            return numMinutes;
        }
        public double pagesPerMinute () {
            return ((double) super.length ()) / numMinutes;
        }
    }
}


/*
    Line 1: Book [] books = new Book [2];
    Line 2: books [0] = new AudioBook (100, 300, "The Jungle");
    Line 3: books [1] = new Book (400, "Captains Courageous");
    Line 4: System.out.println (books [0].pagesPerMinute () );
    Line 5: System.out.println (books [0].toString ());
    Line 6: System.out.println (books [0].length ());
    Line 7: System.out.println (books [1].toString ());

    Line 4 will not compile because variables of type Book may only call methods in the Book class.

    Since the books array has been declared of type Book, at compile time all objects stored in books are considered Book object 
    regardless of their actual type. Therefore, any methods that are called on elements of books must be declared in Book. In order 
    to call the pagesPerMinute() method on Book[0], we would need to use typecasting to let the compiler know that the object stored 
    in the books array at this index is actually an AudioBook object.
*/
