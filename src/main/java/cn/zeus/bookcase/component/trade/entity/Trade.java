package cn.zeus.bookcase.component.trade.entity;

/**
 * Created by lvzimou on 2017/5/11.
 */
public class Trade {

    private int tradeId;

    private int fromTraderId;

    private String fromTraderName;

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

    private String remark;

    public Trade() {

    }

    public int getTradeId() {
        return tradeId;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public int getFromTraderId() {
        return fromTraderId;
    }

    public void setFromTraderId(int fromTraderId) {
        this.fromTraderId = fromTraderId;
    }

    public String getFromTraderName() {
        return fromTraderName;
    }

    public void setFromTraderName(String fromTraderName) {
        this.fromTraderName = fromTraderName;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
