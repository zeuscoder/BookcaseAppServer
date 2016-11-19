package cn.zeus.bookcase.component.book.vo.req;

import cn.zeus.bookcase.util.PageInfo;

/**
 * Created by lvzimou on 16-11-19.
 */
public class BookReq {

    private String title;

    private Integer pageOffset;

    private Integer pageSize;

    public BookReq(String title, Integer page, Integer pageSize) {
        super();
        this.title = title;
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
