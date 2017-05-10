package cn.zeus.bookcase.component.trade.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
     * 交易数量统计
     *
     * @return
     */
    public int countTrades() {
        return sqlSession.selectOne(NAMESPACE + "countTrades");
    }

}
