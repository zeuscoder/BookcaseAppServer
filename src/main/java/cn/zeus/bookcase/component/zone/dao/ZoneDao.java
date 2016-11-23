package cn.zeus.bookcase.component.zone.dao;

import cn.zeus.bookcase.component.zone.entity.Zone;
import cn.zeus.bookcase.component.zone.vo.req.ZoneReq;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/23.
 */
@Repository("ZoneDao")
public class ZoneDao {


    private final static String NAMESPACE = ZoneDao.class.getName()
            + ".";

    @Autowired
    private SqlSession sqlSession;

    /**
     * 获取 省列表／城市列表／区域列表
     *
     * @return
     * @param zoneReq
     */
    public List<Zone> selectZones(ZoneReq zoneReq) {
        return sqlSession.selectList(NAMESPACE + "selectZones", zoneReq);
    }

}
