package cn.zeus.bookcase.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvzimou on 16-11-19.
 */
public class PageInfo {

    public static final int DEF_PAGE = 1;
    public static final int DEF_PAGE_SIZE = 10;
    private int pageOffset;
    private int pageSize;

    public PageInfo(int pageOffset, int pageSize) {
        this.pageOffset = pageOffset;
        this.pageSize = pageSize;
    }

    public PageInfo() {
    }

    public int getPageOffset() {
        return this.pageOffset;
    }

    public void setPageOffset(int pageOffset) {
        this.pageOffset = pageOffset;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public static PageInfo getPageInfo(Integer page, Integer pageSize) {
        Integer tempPage = page;
        Integer tempPageSize = pageSize;
        if(page == null || page.intValue() == 0) {
            tempPage = Integer.valueOf(1);
        }

        if(pageSize == null || pageSize.intValue() == 0) {
            tempPageSize = Integer.valueOf(10);
        }

        return new PageInfo((tempPage.intValue() - 1) * tempPageSize.intValue(), tempPageSize.intValue());
    }

    public static Map<String, Object> setParamsOfPageInfoInMap(int pageOffset, int pageSize) {
        HashMap params = new HashMap();
        params.put("pageOffset", Integer.valueOf(pageOffset));
        params.put("pageSize", Integer.valueOf(pageSize));
        return params;
    }

}
