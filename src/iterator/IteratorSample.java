package iterator;

public class IteratorSample {
	public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("Git Hub"));
        bookShelf.appendBook(new Book("Qiita"));
        bookShelf.appendBook(new Book("Java"));
        bookShelf.appendBook(new Book("Iterator pattern"));

        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
        
//        List<Book> books = new ArrayList<Book>();
//        books.add(new Book("Git Hub"));
//        books.add(new Book("Qiita"));
//        books.add(new Book("Java"));
//        books.add(new Book("Iterator pattern"));
//        
//        for(Iterator it = books.iterator(); it.hasNext();) {
//        	Book book = (Book)it.next();
//        	System.out.println(book.getName());
//        }
    }
}