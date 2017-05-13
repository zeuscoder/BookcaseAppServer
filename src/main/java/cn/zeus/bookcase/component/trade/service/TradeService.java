package cn.zeus.bookcase.component.trade.service;

import cn.zeus.bookcase.component.trade.dao.TradeDao;
import cn.zeus.bookcase.component.trade.vo.resp.BaseInfoResp;
import cn.zeus.bookcase.component.trade.vo.resp.TradeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajb on 17-5-10.
 */
@Service("TradeService")
public class TradeService {

    @Autowired
    private TradeDao tradeDao;

    /**
     * 获取交易基本信息
     *
     * @return
     */
    public List<TradeResp> fetchTrades() {
        List<TradeResp> trades = new ArrayList<TradeResp>();
        return trades;
//        List<TradeResp> baseInfoResp = new List<TradeResp>();
//        baseInfoResp.setUsers(50);
//        baseInfoResp.setTrades(tradeDao.countTrades());
//        return baseInfoResp;
    }

    /**
     * 获取交易基本信息
     *
     * @return
     */
    public BaseInfoResp fetchTradeBaseInfo() {
        BaseInfoResp baseInfoResp = new BaseInfoResp();
        baseInfoResp.setUsers(50);
        baseInfoResp.setTrades(tradeDao.countTrades());
        return baseInfoResp;
    }
}
