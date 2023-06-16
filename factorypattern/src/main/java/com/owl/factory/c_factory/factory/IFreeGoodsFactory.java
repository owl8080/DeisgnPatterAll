package com.owl.factory.c_factory.factory;

import com.owl.factory.b_simple_factory.service.IFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-16-19:57
 * @Description:
 */
public interface IFreeGoodsFactory {
    IFreeGoods getInstance();
}
