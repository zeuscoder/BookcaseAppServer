package cn.zeus.bookcase.component.zone.vo.req;

import cn.zeus.bookcase.util.PageInfo;

/**
 * Created by lvzimou on 2016/11/23.
 */
public class ZoneReq {

    private String parentCode;

    private Integer pageOffset;

    private Integer pageSize;

    public ZoneReq() {

    }

    public ZoneReq(String parentCode, Integer page, Integer pageSize) {
        this.parentCode = parentCode;
        PageInfo pageInfo = PageInfo.getPageInfo(page, pageSize);
        this.pageOffset = pageInfo.getPageOffset();
        this.pageSize = pageInfo.getPageSize();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
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
