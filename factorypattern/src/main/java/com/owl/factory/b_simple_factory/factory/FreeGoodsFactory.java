package com.owl.factory.b_simple_factory.factory;

import com.owl.factory.b_simple_factory.service.IFreeGoods;
import com.owl.factory.b_simple_factory.service.impl.BilibiliFreeGoods;
import com.owl.factory.b_simple_factory.service.impl.DiscountFreeGoods;
import com.owl.factory.b_simple_factory.service.impl.SmailGiftFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-15-17:24
 * @Description:
 */
public class FreeGoodsFactory {
    // 商品发放的接口
    public static IFreeGoods getInstance(Integer awardType){
        IFreeGoods iFreeGoods = null;
        switch (awardType){
            case 1:
                iFreeGoods = new DiscountFreeGoods();
                break;
            case 2:
                iFreeGoods = new BilibiliFreeGoods();
                break;
            case 3:
                iFreeGoods = new SmailGiftFreeGoods();
                break;
        }
        return iFreeGoods;
    }
}
