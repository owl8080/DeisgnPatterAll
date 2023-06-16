package com.owl.factory.b_simple_factory.entiy;

import java.util.Map;

/**
 * @Author: owl
 * @Date: 2023-06-15-11:09
 * @Description:
 */
public class AwardInfo {
    private String uID;
    private Integer awardType;
    private String awardNumber;
    private Map<String,String> extMap;

    public AwardInfo() {
    }

    public AwardInfo(String uID, Integer awardType, String awardNumber, Map<String, String> extMap) {
        this.uID = uID;
        this.awardType = awardType;
        this.awardNumber = awardNumber;
        this.extMap = extMap;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    @Override
    public String toString() {
        return "AwardInfo{" +
                "uID='" + uID + '\'' +
                ", awardType='" + awardType + '\'' +
                ", awardNumber='" + awardNumber + '\'' +
                ", extMap=" + extMap +
                '}';
    }
}
