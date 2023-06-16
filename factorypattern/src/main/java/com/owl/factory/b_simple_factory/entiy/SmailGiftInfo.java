package com.owl.factory.b_simple_factory.entiy;

/**
 * @Author: owl
 * @Date: 2023-06-15-11:10
 * @Description:
 */
public class SmailGiftInfo {
     private String userName;
     private String Phone;
     private String address;
     private String orderId;

    public SmailGiftInfo() {
    }

    public SmailGiftInfo(String userName, String phone, String address, String orderId) {
        this.userName = userName;
        Phone = phone;
        this.address = address;
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "SmailGiftInfo{" +
                "userName='" + userName + '\'' +
                ", Phone='" + Phone + '\'' +
                ", address='" + address + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }
}
