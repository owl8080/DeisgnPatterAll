package com.owl.factory;

//import com.owl.factory.a_schemes01.controller.DeliverController;
//import com.owl.factory.a_schemes01.entity.AwardInfo;
import com.owl.factory.a_schemes01.service.SmailGiftService;
//import com.owl.factory.b_simple_factory.controller.DeliverController;
import com.owl.factory.b_simple_factory.entiy.AwardInfo;
import com.owl.factory.c_factory.controller.DeliverController;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: owl
 * @Date: 2023-06-15-11:50
 * @Description:
 */
public class test_a_schemes01 {
//    DeliverController deliverController = new DeliverController();
    DeliverController deliverController = new DeliverController();
    @Test
    public void test01(){
        // 发放打折卡
        AwardInfo info1 = new AwardInfo();
        info1.setuID("001");
        info1.setAwardType(1);
        info1.setAwardNumber("De002");
        // 调用发放礼品的控制器
        deliverController.awardToUser(info1);
    }

    @Test
    public void test02(){
        // 测试B站会员奖品
        AwardInfo awardInfo  = new AwardInfo();
        awardInfo.setuID("002");
        awardInfo.setAwardType(2);
        awardInfo.setAwardNumber("DE000");

        Map<String,String > map = new HashMap<>();
        map.put("phone","122324");
        map.put("timeLong","23");
        awardInfo.setExtMap(map);

        deliverController.awardToUser(awardInfo);
    }

    @Test
    public void test03(){
        // 测试小礼品奖品
        // 添加中奖人信息
        AwardInfo awardInfo = new AwardInfo();
        awardInfo.setuID("003");
        awardInfo.setAwardType(3);
        awardInfo.setAwardNumber("DE0893");

        // 添加中奖人信息其他资料
        Map<String, String> map = new HashMap<>();
        map.put("userName","华仔");
        map.put("phone","13593");
        map.put("address","北京路29号");

        awardInfo.setExtMap(map);

        // 调用Service处理具体逻辑
        deliverController.awardToUser(awardInfo);
    }
}
