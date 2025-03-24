public class Book {
    private String bookId;
    private String author;
    private String title;
    private int years;

    public Book(String bookId, String author, String title, int years) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.years = years;
    }

    public String getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYears() {
        return years;
    }

    @Override
    public boolean equals(Object obj) {
        // Khi id trùng thì 2 đôi tượng hiện tại và obj trung nhau --> true
        if(obj instanceof Book) {
            return this.bookId.equals(((Book)obj).bookId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.bookId.hashCode();
    }

    @Override
    public String toString() {
        return "Id: " + bookId + ", Author: " + author + ", Title: " + title + ", Years: " + years;
    }
}
