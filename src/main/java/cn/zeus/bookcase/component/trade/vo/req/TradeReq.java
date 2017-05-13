package cn.zeus.bookcase.component.trade.vo.req;

import cn.zeus.bookcase.util.PageInfo;

/**
 * Created by ajb on 17-5-13.
 */
public class TradeReq {

    private String dealStartDate;

    private String dealEndDate;

    private Integer pageOffset;

    private Integer pageSize;

    public TradeReq(String dealStartDate, String dealEndDate, Integer page, Integer pageSize) {
        this.dealStartDate = dealStartDate;
        this.dealEndDate = dealEndDate;
        PageInfo pageInfo = PageInfo.getPageInfo(page, pageSize);
        this.pageOffset = pageInfo.getPageOffset();
        this.pageSize = pageInfo.getPageSize();
    }

    public String getDealStartDate() {
        return dealStartDate;
    }

    public void setDealStartDate(String dealStartDate) {
        this.dealStartDate = dealStartDate;
    }

    public String getDealEndDate() {
        return dealEndDate;
    }

    public void setDealEndDate(String dealEndDate) {
        this.dealEndDate = dealEndDate;
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
