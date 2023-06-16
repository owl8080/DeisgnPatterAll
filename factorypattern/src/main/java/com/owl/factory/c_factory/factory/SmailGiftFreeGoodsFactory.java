package com.owl.factory.c_factory.factory;

import com.owl.factory.b_simple_factory.service.IFreeGoods;
import com.owl.factory.b_simple_factory.service.impl.SmailGiftFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-16-20:02
 * @Description:
 */
public class SmailGiftFreeGoodsFactory implements IFreeGoodsFactory{
    @Override
    public IFreeGoods getInstance() {
        return new SmailGiftFreeGoods();
    }
}
