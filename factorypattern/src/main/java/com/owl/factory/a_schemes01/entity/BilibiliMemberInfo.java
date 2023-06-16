package com.owl.factory.a_schemes01.entity;

/**
 * @Author: owl
 * @Date: 2023-06-15-11:10
 * @Description:
 */
public class BilibiliMemberInfo {
    private String phone;
    private String timeLong;

    public BilibiliMemberInfo() {
    }

    public BilibiliMemberInfo(String phone, String timeLong) {
        this.phone = phone;
        this.timeLong = timeLong;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTimeLong() {
        return timeLong;
    }

    public void setTimeLong(String timeLong) {
        this.timeLong = timeLong;
    }
}
