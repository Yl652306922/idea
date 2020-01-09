package cn.yunhe.beans;

import java.util.Date;

public class Order2 {
    private String orderId;
    private Date orderCreatDate;
    private Date orderEndDate;
    private double orderPrice;
    private int orderStatus;
    private int uid;
    private User user;
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderCreatDate() {
        return orderCreatDate;
    }

    public void setOrderCreatDate(Date orderCreatDate) {
        this.orderCreatDate = orderCreatDate;
    }

    public Date getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Date orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order2{" +
                "orderId='" + orderId + '\'' +
                ", orderCreatDate=" + orderCreatDate +
                ", orderEndDate=" + orderEndDate +
                ", orderPrice=" + orderPrice +
                ", orderStatus=" + orderStatus +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }
}

