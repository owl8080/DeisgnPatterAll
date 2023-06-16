package com.owl.factory.b_simple_factory.service.impl;

import com.owl.factory.b_simple_factory.entiy.AwardInfo;
import com.owl.factory.b_simple_factory.entiy.ResponseResult;
import com.owl.factory.b_simple_factory.entiy.SmailGiftInfo;
import com.owl.factory.b_simple_factory.service.IFreeGoods;

import java.util.UUID;

/**
 * @Author: owl
 * @Date: 2023-06-15-17:19
 * @Description:
 */
public class SmailGiftFreeGoods implements IFreeGoods {
    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
         // 发放礼品
        SmailGiftInfo smailGiftInfo = new SmailGiftInfo();
        smailGiftInfo.setUserName(awardInfo.getExtMap().get("userName"));
        smailGiftInfo.setPhone(awardInfo.getExtMap().get("phone"));
        smailGiftInfo.setAddress(awardInfo.getExtMap().get("address"));
        smailGiftInfo.setOrderId(UUID.randomUUID().toString());

        System.out.println("小礼品发送成功"+smailGiftInfo);
        ResponseResult responseResult = new ResponseResult("200","小礼品发送成功",smailGiftInfo);
        return responseResult;

    }
}
