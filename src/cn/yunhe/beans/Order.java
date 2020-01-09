package cn.yunhe.beans;

import java.util.Date;
import java.util.List;

public class Order {
    private String order_id;
    private Date order_creatdate;
    private Date order_enddate;
    private double order_price;
    private int order_status;
    private int uid;
    private List<Order> detailList;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_creatdate() {
        return order_creatdate;
    }

    public void setOrder_creatdate(Date order_creatdate) {
        this.order_creatdate = order_creatdate;
    }

    public Date getOrder_enddate() {
        return order_enddate;
    }

    public void setOrder_enddate(Date order_enddate) {
        this.order_enddate = order_enddate;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public List<Order> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Order> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", order_creatdate=" + order_creatdate +
                ", order_enddate=" + order_enddate +
                ", order_price=" + order_price +
                ", order_status=" + order_status +
                ", uid=" + uid +
                ", detailList=" + detailList +
                '}';
    }
}
