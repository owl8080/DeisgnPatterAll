package com.owl.factory.b_simple_factory.controller;

import com.owl.factory.b_simple_factory.entiy.AwardInfo;
import com.owl.factory.b_simple_factory.entiy.ResponseResult;
import com.owl.factory.b_simple_factory.factory.FreeGoodsFactory;
import com.owl.factory.b_simple_factory.service.IFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-15-17:40
 * @Description:
 */
public class DeliverController {
    public ResponseResult awardToUser(AwardInfo awardInfo){
        IFreeGoods iFreeGoods = FreeGoodsFactory.getInstance(awardInfo.getAwardType());
        ResponseResult responseResult = iFreeGoods.sendFreeGoods(awardInfo);
        return responseResult;
    }
}
