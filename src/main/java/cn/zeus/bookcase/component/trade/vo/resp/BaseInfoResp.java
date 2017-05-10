package cn.zeus.bookcase.component.trade.vo.resp;

/**
 * Created by ajb on 17-5-10.
 */
public class BaseInfoResp {

    private int users;

    private int trades;

    public BaseInfoResp() {
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public int getTrades() {
        return trades;
    }

    public void setTrades(int trades) {
        this.trades = trades;
    }
}
