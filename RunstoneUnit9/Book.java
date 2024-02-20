public class Book {
    private String ISBN = "something";

    public String getISBN() {
        return ISBN; // implementation not shown  
    }
    // constructors, fields, and other methods not shown

    public class Dictionary extends Book {
        public String getDefinition() {
            return "..."; // implementation not shown  
        }
    }
}

//b.getDefintion();  -  At compile time the declared type is Book and the Book class does not have or inherit a getDefintion method.