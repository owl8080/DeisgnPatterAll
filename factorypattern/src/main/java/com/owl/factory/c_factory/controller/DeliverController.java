package com.owl.factory.c_factory.controller;

import com.owl.factory.b_simple_factory.entiy.AwardInfo;
import com.owl.factory.b_simple_factory.entiy.ResponseResult;
import com.owl.factory.b_simple_factory.service.IFreeGoods;
import com.owl.factory.c_factory.factory.BilibiliFreeGoodsFactory;
import com.owl.factory.c_factory.factory.DiscountFreeGoodsFactory;
import com.owl.factory.c_factory.factory.IFreeGoodsFactory;
import com.owl.factory.c_factory.factory.SmailGiftFreeGoodsFactory;

/**
 * @Author: owl
 * @Date: 2023-06-16-20:18
 * @Description:
 */
public class DeliverController {
    public ResponseResult awardToUser(AwardInfo awardInfo){
        IFreeGoodsFactory iFreeGoodsFactory =null;
        switch (awardInfo.getAwardType()){
            case 1:
                iFreeGoodsFactory = new DiscountFreeGoodsFactory();
                break;
            case 2:
                iFreeGoodsFactory =  new BilibiliFreeGoodsFactory();
                break;
            case 3:
                iFreeGoodsFactory = new SmailGiftFreeGoodsFactory();
                break;
        }

        IFreeGoods iFreeGoods = iFreeGoodsFactory.getInstance();
        ResponseResult responseResult = iFreeGoods.sendFreeGoods(awardInfo);
        return responseResult;
    }
}
