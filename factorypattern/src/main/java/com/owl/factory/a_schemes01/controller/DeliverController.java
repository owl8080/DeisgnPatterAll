package com.owl.factory.a_schemes01.controller;

import com.owl.factory.a_schemes01.entity.AwardInfo;
import com.owl.factory.a_schemes01.entity.BilibiliMemberInfo;
import com.owl.factory.a_schemes01.entity.SmailGiftInfo;
import com.owl.factory.a_schemes01.service.BilibiliService;
import com.owl.factory.a_schemes01.service.DiscountService;
import com.owl.factory.a_schemes01.service.SmailGiftService;

import java.util.UUID;

/**
 * @Author: owl
 * @Date: 2023-06-15-11:29
 * @Description: 发送礼品 1：打折券  2: B站会员 3：小礼品
 */
public class DeliverController {
    public void awardToUser(AwardInfo awardInfo){
       // 根据 awardInfo中award的中奖类型调用不同的Service
       switch (awardInfo.getAwardType()){
           case 1:
               // 奖品为打折券
               DiscountService discountService = new DiscountService();
               discountService.sendDiscount(awardInfo.getuID(),awardInfo.getAwardNumber());
               break;
           case 2:
               // B站会员
               BilibiliMemberInfo bilibiliMemberInfo = new BilibiliMemberInfo();
               bilibiliMemberInfo.setPhone(awardInfo.getExtMap().get("phone"));
               bilibiliMemberInfo.setTimeLong(awardInfo.getExtMap().get("timeLong"));

               BilibiliService bilibiliService = new BilibiliService();
               bilibiliService.opedMember(bilibiliMemberInfo,awardInfo.getAwardNumber());
               break;
           case 3:
               // 小礼品
               SmailGiftInfo smailGiftInfo = new SmailGiftInfo();
               smailGiftInfo.setUserName( awardInfo.getExtMap().get("userName"));
               smailGiftInfo.setPhone(awardInfo.getExtMap().get("phone"));
               smailGiftInfo.setAddress(awardInfo.getExtMap().get("address"));
               smailGiftInfo.setOrderId(UUID.randomUUID().toString());

               SmailGiftService smailGiftService = new SmailGiftService();
               smailGiftService.giveSmailGift(smailGiftInfo,awardInfo.getAwardNumber());


       }
    }
}
