package cn.zeus.bookcase.component.trade.vo;

/**
 * Created by ajb on 17-5-13.
 */
public class Trader {

    private int id;

    private String name;

    private int bookId;

    private String bookName;

    private String remark;

    public Trader() {
    }

    public Trader(int id, String name, int bookId, String bookName, String remark) {
        this.id = id;
        this.name = name;
        this.bookId = bookId;
        this.bookName = bookName;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
