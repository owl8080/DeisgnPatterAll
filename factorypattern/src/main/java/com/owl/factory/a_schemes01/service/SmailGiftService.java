package com.owl.factory.a_schemes01.service;

import com.owl.factory.a_schemes01.entity.SmailGiftInfo;

/**
 * @Author: owl
 * @Date: 2023-06-15-11:25
 * @Description:
 */
public class SmailGiftService {
    public void giveSmailGift(SmailGiftInfo smailGiftInfo,String awardNumber){
        System.out.println("中奖编号"+awardNumber+"  中奖信息"+smailGiftInfo);
    }
}
