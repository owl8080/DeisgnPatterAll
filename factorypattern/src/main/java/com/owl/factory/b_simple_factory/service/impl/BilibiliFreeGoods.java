package com.owl.factory.b_simple_factory.service.impl;

import com.owl.factory.b_simple_factory.entiy.AwardInfo;
import com.owl.factory.b_simple_factory.entiy.BilibiliMemberInfo;
import com.owl.factory.b_simple_factory.entiy.ResponseResult;
import com.owl.factory.b_simple_factory.service.IFreeGoods;

/**
 * @Author: owl
 * @Date: 2023-06-15-17:13
 * @Description:
 */
public class BilibiliFreeGoods implements IFreeGoods {
    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        // 发放B 站会员打折券
        BilibiliMemberInfo bilibiliMemberInfo = new BilibiliMemberInfo();
        bilibiliMemberInfo.setPhone(awardInfo.getExtMap().get("phone"));
        bilibiliMemberInfo.setTimeLong(awardInfo.getExtMap().get("timeLong"));

        System.out.println(awardInfo.getuID()+"会员开通成功"+bilibiliMemberInfo);
        ResponseResult responseResult = new ResponseResult("200","会员开通成功",bilibiliMemberInfo);
        return responseResult;
    }
}
