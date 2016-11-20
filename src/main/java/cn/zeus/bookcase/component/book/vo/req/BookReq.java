package cn.zeus.bookcase.component.book.vo.req;

import cn.zeus.bookcase.util.PageInfo;

/**
 * Created by lvzimou on 16-11-19.
 */
public class BookReq {

    private String title;

    private String authors;

    private String isbn;

    private Integer category;

    private Integer pageOffset;

    private Integer pageSize;

    public BookReq() {

    }

    public BookReq(String title, String authors, String isbn,
                   Integer category, Integer page, Integer pageSize) {
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.category = category;
        PageInfo pageInfo = PageInfo.getPageInfo(page, pageSize);
        this.pageOffset = pageInfo.getPageOffset();
        this.pageSize = pageInfo.getPageSize();
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getPageOffset() {
        return pageOffset;
    }

    public void setPageOffset(Integer pageOffset) {
        this.pageOffset = pageOffset;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
