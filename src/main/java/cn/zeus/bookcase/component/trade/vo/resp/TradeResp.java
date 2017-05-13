package cn.zeus.bookcase.component.trade.vo.resp;

import cn.zeus.bookcase.component.trade.entity.Trade;
import cn.zeus.bookcase.component.trade.vo.Trader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvzimou on 2017/5/11.
 */
public class TradeResp {

    private int id;

    private Trader fromTrader;

    private Trader targetTrader;

    private String tradeStartDate;

    private String tradeEndDate;

    private int tradeDays;

    private String tradeCondition;

    private String tradeDealDate;

    private String remark;

    public TradeResp() {

    }

    public TradeResp(Trade trade) {
        this.id = trade.getTradeId();
        this.fromTrader = new Trader(trade.getFromTraderId(), trade.getFromTraderName(),
                trade.getFromTraderBookId(), trade.getFromTraderBookName(), trade.getFromTraderRemark());
        this.targetTrader = new Trader(trade.getTargetTraderId(), trade.getTargetTraderName(),
                trade.getTargetTraderBookId(), trade.getTargetTraderBookName(), trade.getTargetTraderRemark());
        this.tradeStartDate = trade.getTradeStartDate();
        this.tradeEndDate = trade.getTradeEndDate();
        this.tradeDays = trade.getTradeDays();
        this.tradeCondition = trade.getTradeCondition();
        this.tradeDealDate = trade.getTradeDealDate();
        this.remark = trade.getRemark();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Trader getFromTrader() {
        return fromTrader;
    }

    public void setFromTrader(Trader fromTrader) {
        this.fromTrader = fromTrader;
    }

    public Trader getTargetTrader() {
        return targetTrader;
    }

    public void setTargetTrader(Trader targetTrader) {
        this.targetTrader = targetTrader;
    }

    public String getTradeStartDate() {
        return tradeStartDate;
    }

    public void setTradeStartDate(String tradeStartDate) {
        this.tradeStartDate = tradeStartDate;
    }

    public String getTradeEndDate() {
        return tradeEndDate;
    }

    public void setTradeEndDate(String tradeEndDate) {
        this.tradeEndDate = tradeEndDate;
    }

    public int getTradeDays() {
        return tradeDays;
    }

    public void setTradeDays(int tradeDays) {
        this.tradeDays = tradeDays;
    }

    public String getTradeCondition() {
        return tradeCondition;
    }

    public void setTradeCondition(String tradeCondition) {
        this.tradeCondition = tradeCondition;
    }

    public String getTradeDealDate() {
        return tradeDealDate;
    }

    public void setTradeDealDate(String tradeDealDate) {
        this.tradeDealDate = tradeDealDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static List<TradeResp> fetchTrades(List<Trade> trades) {
        List<TradeResp> tradeResps = new ArrayList<TradeResp>();
        if (trades != null && !trades.isEmpty()) {
            for (Trade trade: trades) {
                tradeResps.add(new TradeResp(trade));
            }
        }
        return tradeResps;
    }

}
