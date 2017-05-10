package cn.zeus.bookcase.web.controller.trade;

import cn.zeus.bookcase.common.BaseResponse;
import cn.zeus.bookcase.component.trade.service.TradeService;
import cn.zeus.bookcase.component.trade.vo.resp.BaseInfoResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ajb on 17-5-10.
 */
@Controller
@RequestMapping("/trades")
public class TradeController {

    private static final Logger LOG = LoggerFactory
            .getLogger(TradeController.class);

    @Autowired
    private TradeService tradeService;

    @ResponseBody
    @RequestMapping(value = "/baseInfo", method = RequestMethod.GET)
    public BaseResponse<BaseInfoResp> fetchTradeBaseInfo() {
        LOG.info("[查看交易基本信息] - 访问[GET /trades/baseInfo]接口");
        BaseResponse<BaseInfoResp> br = new BaseResponse<BaseInfoResp>();
        br.setData(tradeService.fetchTradeBaseInfo());
        br.setMessage("获取交易基本信息成功");
        return br;
    }

}
