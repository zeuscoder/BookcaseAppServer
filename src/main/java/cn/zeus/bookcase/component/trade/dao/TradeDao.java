package cn.zeus.bookcase.component.trade.dao;

import cn.zeus.bookcase.component.trade.entity.Trade;
import cn.zeus.bookcase.component.trade.vo.req.TradeReq;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ajb on 17-5-10.
 */
@Repository("TradeDao")
public class TradeDao {

    private final static String NAMESPACE = TradeDao.class.getName()
            + ".";

    @Autowired
    private SqlSession sqlSession;

    /**
     * 交易列表
     *
     * @return
     */
    public List<Trade> selectTradesByParams(TradeReq filterParams) {
        return sqlSession.selectList(NAMESPACE + "selectTradesByParams", filterParams);
    }

    /**
     * 交易数量统计
     *
     * @return
     */
    public int countTrades(TradeReq filterParams) {
        return sqlSession.selectOne(NAMESPACE + "countTrades", filterParams);
    }

}
