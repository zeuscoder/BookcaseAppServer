package cn.zeus.bookcase.component.zone.service;

import cn.zeus.bookcase.component.zone.dao.ZoneDao;
import cn.zeus.bookcase.component.zone.entity.Zone;
import cn.zeus.bookcase.component.zone.vo.req.ZoneReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/23.
 */
@Service("ZoneService")
public class ZoneService {

    @Autowired
    private ZoneDao zoneDao;

    /**
     * 获取 省列表／城市列表／区域列表
     *
     * @param zoneReq
     * @return
     */
    public List<Zone> fetchZones(ZoneReq zoneReq) {
        return zoneDao.selectZones(zoneReq);
    }
}
