package com.owl.factory.a_schemes01.service;

import com.owl.factory.a_schemes01.entity.BilibiliMemberInfo;

/**
 * @Author: owl
 * @Date: 2023-06-15-11:25
 * @Description:
 */
public class BilibiliService {
    public void opedMember(BilibiliMemberInfo bilibiliMemberInfo,String awardNumber ){
        System.out.println("中奖编码"+awardNumber+"开通会员："+bilibiliMemberInfo.getPhone()+"时长"+bilibiliMemberInfo.getTimeLong());
    }
}
