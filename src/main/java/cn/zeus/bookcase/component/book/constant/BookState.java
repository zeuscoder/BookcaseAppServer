package cn.zeus.bookcase.component.book.constant;

/**
 * Created by ajb on 17-5-8.
 */
public enum BookState {

    createdNew(0, "新增", "createdNew"), pending(1, "待审核", "pending"), onSale(2,
            "已上架", "onSale"), offSale(3, "已下架", "offSale"), deleted(4, "删除", "deleted");

    private int dbType;

    private String cnName;

    private String enName;

    BookState(int dbType, String cnName, String enName) {
        this.dbType = dbType;
        this.cnName = cnName;
        this.enName = enName;
    }

    public int getDbType() {
        return dbType;
    }

    public String getCnName() {
        return cnName;
    }

    public String getEnName() {
        return enName;
    }

    /**
     * 通过dbType获取书籍状态
     *
     * @param dbType
     * @return
     */
    public static BookState getBookStateByDbType(int dbType) {
        for (BookState bookState : BookState.values()) {
            if (bookState.getDbType() == dbType) {
                return bookState;
            }
        }
        return createdNew;
    }

    /**
     * 通过EnName获取书籍状态
     *
     * @param enName
     * @return
     */
    public static BookState getBookStateByEnName(String enName) {
        for (BookState bookState : BookState.values()) {
            if (bookState.getEnName().equals(enName)) {
                return bookState;
            }
        }
        return createdNew;
    }

    /**
     * 通过CnName获取书籍状态
     *
     * @param cnName
     * @return
     */
    public static BookState getBookStateByCnName(String cnName) {
        for (BookState bookState : BookState.values()) {
            if (bookState.getCnName().equals(cnName)) {
                return bookState;
            }
        }
        return createdNew;
    }

}
