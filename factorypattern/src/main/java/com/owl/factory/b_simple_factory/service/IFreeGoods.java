package com.owl.factory.b_simple_factory.service;

import com.owl.factory.b_simple_factory.entiy.AwardInfo;
import com.owl.factory.b_simple_factory.entiy.ResponseResult;

/**
 * @Author: owl
 * @Date: 2023-06-15-17:07
 * @Description:
 */
public interface IFreeGoods {
    ResponseResult sendFreeGoods(AwardInfo awardInfo);
}
