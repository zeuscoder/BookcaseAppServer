package cn.zeus.bookcase.component.trade.vo.resp;

import cn.zeus.bookcase.component.trade.entity.Trade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvzimou on 2017/5/11.
 */
public class TradeResp {

    private int id;

    private int fromTraderId;

    private String fromTargetName;

    private int targetTraderId;

    private String targetTraderName;

    private int fromTraderBookId;

    private String fromTraderBookName;

    private int targetTraderBookId;

    private String targetTraderBookName;

    private String fromTraderRemark;

    private String targetTraderRemark;

    private String tradeStartDate;

    private String tradeEndDate;

    private int tradeDays;

    private String tradeCondition;

    private String tradeDealDate;

    public TradeResp() {

    }

    public TradeResp(Trade trade) {
        this.id = trade.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromTraderId() {
        return fromTraderId;
    }

    public void setFromTraderId(int fromTraderId) {
        this.fromTraderId = fromTraderId;
    }

    public String getFromTargetName() {
        return fromTargetName;
    }

    public void setFromTargetName(String fromTargetName) {
        this.fromTargetName = fromTargetName;
    }

    public int getTargetTraderId() {
        return targetTraderId;
    }

    public void setTargetTraderId(int targetTraderId) {
        this.targetTraderId = targetTraderId;
    }

    public String getTargetTraderName() {
        return targetTraderName;
    }

    public void setTargetTraderName(String targetTraderName) {
        this.targetTraderName = targetTraderName;
    }

    public int getFromTraderBookId() {
        return fromTraderBookId;
    }

    public void setFromTraderBookId(int fromTraderBookId) {
        this.fromTraderBookId = fromTraderBookId;
    }

    public String getFromTraderBookName() {
        return fromTraderBookName;
    }

    public void setFromTraderBookName(String fromTraderBookName) {
        this.fromTraderBookName = fromTraderBookName;
    }

    public int getTargetTraderBookId() {
        return targetTraderBookId;
    }

    public void setTargetTraderBookId(int targetTraderBookId) {
        this.targetTraderBookId = targetTraderBookId;
    }

    public String getTargetTraderBookName() {
        return targetTraderBookName;
    }

    public void setTargetTraderBookName(String targetTraderBookName) {
        this.targetTraderBookName = targetTraderBookName;
    }

    public String getFromTraderRemark() {
        return fromTraderRemark;
    }

    public void setFromTraderRemark(String fromTraderRemark) {
        this.fromTraderRemark = fromTraderRemark;
    }

    public String getTargetTraderRemark() {
        return targetTraderRemark;
    }

    public void setTargetTraderRemark(String targetTraderRemark) {
        this.targetTraderRemark = targetTraderRemark;
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
