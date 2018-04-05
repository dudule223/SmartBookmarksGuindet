package smartbookmark.guindet.diiage.org;
import java.util.Date;

public class Comment {
    int Id;
    int BookId;
    int Page;
    String Comment;
    Date Date;

    public Comment()
    {

    }

    public Comment(int id, int bookId, int page, String comment, Date date)
    {
        Id = id;
        BookId = bookId;
        Comment = comment;
        Date = date;
        Page = page;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public String toString()
    {
        return Comment.substring(0,50) + " - " +Date;
    }
}
