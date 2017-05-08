package cn.zeus.bookcase.component.book.vo.resp;

import cn.zeus.bookcase.component.book.constant.BookState;
import cn.zeus.bookcase.component.book.entity.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvzimou on 16-11-19.
 */
public class BookResp {

    private int bookId;

    private String title;

    private String authors;

    private String isbn;

    private int number;

    private double price;

    private String publishDate;

    private String publisher;

    private int pages;

    private String rating;

    private String summary;

    private String state;

    public BookResp() {

    }

    public BookResp(Book book) {
        this.bookId = book.getBookId();
        this.title = book.getTitle();
        this.authors = book.getAuthors();
        this.isbn = book.getIsbn();
        this.number = book.getNumber();
        this.price = book.getPrice();
        this.publishDate = book.getPublishDate();
        this.publisher = book.getPublisher();
        this.pages = book.getPages();
        this.rating = book.getRating();
        this.summary = book.getSummary();
        this.state = BookState.getBookStateByDbType(book.getState()).getEnName();
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static List<BookResp> fetchBooks(List<Book> books) {
        List<BookResp> bookResps = new ArrayList<BookResp>();
        if (books != null && !books.isEmpty()) {
            for (Book book: books) {
                bookResps.add(new BookResp(book));
            }
        }
        return bookResps;
    }
}
