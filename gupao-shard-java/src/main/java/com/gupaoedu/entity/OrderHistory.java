package com.gupaoedu.entity;

import java.util.Date;

public class OrderHistory {
    private Long orderHistoryId;
    private String name;
    private String money;
    private String month;
    private Date orderTime;

    public Long getOrderHistoryId() {
        return orderHistoryId;
    }

    public void setOrderHistoryId(Long orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "OrderHistory{" +
                "orderHistoryId=" + orderHistoryId +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", month='" + month + '\'' +
                ", orderTime=" + orderTime +
                '}';
    }
}
