package cn.zeus.bookcase.component.book.vo;

import cn.zeus.bookcase.component.book.entity.Book;

/**
 * Created by ajb on 17-5-8.
 */
public class BookInfoVo {

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

    private String image;

    private String saleAgent;

    private double salePrice;

    private double saleDiscount;

    private String remark;

    public BookInfoVo(Book book) {
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
        this.image = book.getImage();
        this.saleAgent = book.getSaleAgent();
        this.salePrice = book.getSalePrice();
        this.saleDiscount = book.getSaleDiscount();
        this.remark = book.getRemark();
    }

    public BookInfoVo() {

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSaleAgent() {
        return saleAgent;
    }

    public void setSaleAgent(String saleAgent) {
        this.saleAgent = saleAgent;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getSaleDiscount() {
        return saleDiscount;
    }

    public void setSaleDiscount(double saleDiscount) {
        this.saleDiscount = saleDiscount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
