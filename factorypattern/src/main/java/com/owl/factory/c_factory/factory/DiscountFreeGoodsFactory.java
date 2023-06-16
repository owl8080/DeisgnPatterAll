package com.owl.factory.c_factory.factory;

import com.owl.factory.a_schemes01.service.DiscountService;
import com.owl.factory.b_simple_factory.service.IFreeGoods;
import com.owl.factory.b_simple_factory.service.impl.DiscountFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-16-20:00
 * @Description:
 */
public class DiscountFreeGoodsFactory implements IFreeGoodsFactory{
    @Override
    public IFreeGoods getInstance() {
        return new DiscountFreeGoods();
    }
}
