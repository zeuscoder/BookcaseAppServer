package cn.zeus.bookcase.web.controller.zone;

import cn.zeus.bookcase.common.BaseResponse;
import cn.zeus.bookcase.component.zone.entity.Zone;
import cn.zeus.bookcase.component.zone.service.ZoneService;
import cn.zeus.bookcase.component.zone.vo.req.ZoneReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lvzimou on 2016/11/23.
 */
@Controller
@RequestMapping("/public/zones")
public class ZoneController {

    private static final Logger LOG = LoggerFactory
            .getLogger(ZoneController.class);

    @Autowired
    private ZoneService zoneService;

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public BaseResponse<List<Zone>> fetchZones(
            @RequestParam(value = "parentCode", required = false) String parentCode,
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        LOG.info("[省市区列表] - 访问[GET /public/zones]接口, reqParams parentCode = " + parentCode);
        ZoneReq filterParams = new ZoneReq(parentCode, page, pageSize);
        BaseResponse<List<Zone>> br = new BaseResponse<List<Zone>>();
        br.setData(zoneService.fetchZones(filterParams));
        br.setMessage("查询成功");
        return br;
    }

}
