package com.owl.factory.b_simple_factory.service.impl;

import com.owl.factory.b_simple_factory.entiy.AwardInfo;
import com.owl.factory.b_simple_factory.entiy.ResponseResult;
import com.owl.factory.b_simple_factory.service.IFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-15-17:09
 * @Description:
 */
public class DiscountFreeGoods implements IFreeGoods {
    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        // 发放打折券商品逻辑
        System.out.println("发放打折券给用户DI为"+awardInfo.getuID()+"的用户");
        return new ResponseResult("200","发送打折券成功"   );
    }
}
