package cn.zeus.bookcase.component.trade.service;

import cn.zeus.bookcase.component.trade.dao.TradeDao;
import cn.zeus.bookcase.component.trade.vo.resp.BaseInfoResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public BaseInfoResp fetchTradeBaseInfo() {
        BaseInfoResp baseInfoResp = new BaseInfoResp();
        baseInfoResp.setUsers(50);
        baseInfoResp.setTrades(tradeDao.countTrades());
        return baseInfoResp;
    }
}
