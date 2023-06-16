package com.owl.factory.c_factory.factory;

import com.owl.factory.b_simple_factory.service.IFreeGoods;
import com.owl.factory.b_simple_factory.service.impl.BilibiliFreeGoods;
import com.owl.factory.b_simple_factory.service.impl.DiscountFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-16-20:03
 * @Description:
 */
public class BilibiliFreeGoodsFactory implements IFreeGoodsFactory{
    @Override
    public IFreeGoods getInstance() {
        return new BilibiliFreeGoods();
    }
}
