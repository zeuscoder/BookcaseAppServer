package cn.zeus.bookcase.component.trade.service;

import cn.zeus.bookcase.component.trade.dao.TradeDao;
import cn.zeus.bookcase.component.trade.vo.req.TradeReq;
import cn.zeus.bookcase.component.trade.vo.resp.BaseInfoResp;
import cn.zeus.bookcase.component.trade.vo.resp.TradeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by ajb on 17-5-10.
 */
@Service("TradeService")
public class TradeService {

    @Autowired
    private TradeDao tradeDao;

    /**
     * 交易列表
     *
     * @return
     */
    public List<TradeResp> fetchTrades(TradeReq filterParams) {
        return TradeResp.fetchTrades(tradeDao.selectTradesByParams(filterParams));
    }

    /**
     * 交易数量统计
     *
     * @return
     */
    public int countTrades(TradeReq filterParams) {
        return tradeDao.countTrades(filterParams);
    }

    /**
     * 获取交易基本信息
     *
     * @return
     */
    public BaseInfoResp fetchTradeBaseInfo() {
        BaseInfoResp baseInfoResp = new BaseInfoResp();
        baseInfoResp.setUsers(50);
        String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        TradeReq filterParams = new TradeReq(today, today, 1, 10);
        baseInfoResp.setTrades(tradeDao.countTrades(filterParams));
        return baseInfoResp;
    }
}
