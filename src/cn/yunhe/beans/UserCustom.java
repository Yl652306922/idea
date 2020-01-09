package cn.yunhe.beans;

import java.util.List;

public class UserCustom {
    private User user;
    private List<Order> orderList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "UserCustom{" +
                "user=" + user +
                ", orderList=" + orderList +
                '}';
    }
}
